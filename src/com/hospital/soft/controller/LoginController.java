package com.hospital.soft.controller;

import com.hospital.soft.common.CommonUtil;
import com.hospital.soft.common.MD5;
import com.hospital.soft.common.result.JsonAdminResult;
import com.hospital.soft.mybatis.pojo.*;
import com.hospital.soft.service.IAdminUserService;
import com.hospital.soft.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class LoginController extends BaseWeiXinController {
    @Autowired
    IAdminUserService userService;
    @Autowired
    IRecordService recordService;

    @RequestMapping("/login")
    public String login() {
        return "admin/index";
    }


    @RequestMapping("/postLogin")
    @ResponseBody
    public JsonAdminResult postLogin(String name, String pwd, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
        JsonAdminResult jes = new JsonAdminResult(true);
        Admin user = userService.getUserByLoginName(name);
        System.out.println(name);
        System.out.println(pwd);
        System.out.println(user);
        if (user == null) {
            return jes.convertToErrorResult("用户不存在");
        } else {
            String userPwd = user.getPwd();
            if (!userPwd.equals(MD5.getMD5(pwd))) {
                return jes.convertToErrorResult("密码错误");
            }
        }
        user.setAuthcode(CommonUtil.getAuthCode(request));
        userService.addAndUpdate(user);
        String path = "/";
        Cookie cookie = new Cookie("authCode", user.getAuthcode());
        cookie.setPath(path);
        cookie.setMaxAge(-1);// 关闭浏览器就失效
        response.addCookie(cookie);
        session.setAttribute("adminUser", user);
        return jes;
    }

    @RequestMapping("/main")
    public String main() {
        return "admin/demo";
    }

    @RequestMapping("/recode")
    public String recorde() {
        return "/admin/recode";
    }

    @RequestMapping("/getRecord")
    @ResponseBody
    public JsonAdminResult getRecordInfo(Integer page, Integer limit, Record record, Date endTime) {
        String type = null;
        JsonAdminResult res = new JsonAdminResult(true);
        try {
//            if (!StringUtils.isNullOrEmpty(record.getRtype())) {
//                if (!new String(record.getRtype().getBytes(), StandardCharsets.UTF_8).equals(record.getRtype())) {
//                    type = new String(record.getRtype().getBytes("ISO8859-1"), "utf-8");
//                    record.setRtype(type);
//                }
            //     }
            res = new JsonAdminResult(userService.getRecordList(page, limit, record, endTime));
        } catch (Exception e) {
            return res.convertToErrorResult("查询失败");
        }
        return res;
    }

    @RequestMapping("/editRecord")
    public String editRecordInfo(Record record, HttpSession session, Model model) throws UnsupportedEncodingException {
        System.out.println(record.getRtype());
        System.out.println(record.getId());
        Admin user = (Admin) session.getAttribute("adminUser");

        System.out.println(record.getRtype());
        if (record.getRtype() != null) {
            if (!(java.nio.charset.Charset.forName("GBK").newEncoder().canEncode(record.getRtype()))) {
                record.setRtype(new String(record.getRtype().getBytes("ISO8859-1"), "UTF-8"));
            }
        }
        System.out.println(record.getRtype());

        if (record.getRtype().equals("时间管理记录")) {
            try {
                System.out.println(2);
                Recordtype recordtype = recordService.findRecordTypeById(record.getId());
                Outpatient outpatient = recordService.findYqById(recordtype.getYqId());
                Jzpreview jzBrById = recordService.findJzBrById(recordtype.getJzId());
                Kscheck ksById = recordService.findKsById(recordtype.getKsId());
                Daoguanrecord dgById = recordService.findDgById(recordtype.getDaoguanId());
                Livehospital lhById = recordService.findLhById(recordtype.getZyzgId());
                model.addAttribute("cyzg", lhById);
                model.addAttribute("dg", dgById);
                model.addAttribute("ksjc", ksById);
                model.addAttribute("jzyj", jzBrById);
                model.addAttribute("outparient", outpatient);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "edit/yqjl";
        } else if (record.getRtype().equals("神经外科创伤病人急诊手术登记表")) {
            try {
                Sjwkjzssrecord sjById = recordService.findSjById(record.getId());
                model.addAttribute("sjqj", sjById);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "edit/sjwkjl";
        } else if (record.getRtype().equals("宁都县人民医院急诊")) {
            try {
                Jzrecord ndjzById = recordService.findNdjzById(record.getId());
                model.addAttribute("ndjz", ndjzById);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "edit/ndjzjl";
        } else if (record.getRtype().equals("抢救用药记录")) {
            try {
                Qjyyrecord yyById = recordService.findYyById(record.getId());
                model.addAttribute("qjyy", yyById);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "edit/yyjl";
        } else if (record.getRtype().equals("创伤病人抢救表")) {
            try {
                Qjbrrecord qjbrById = recordService.findQjbrById(record.getId());
                model.addAttribute("qjbr", qjbrById);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "edit/qjbrjl";
        }
        System.out.println(3);
        return null;
    }

    //修改急诊预检
    @RequestMapping("/editJzyj")
    @ResponseBody
    public JsonAdminResult editJzyj(HttpSession session, Jzpreview jzpreview) {
        JsonAdminResult res = new JsonAdminResult(true);
        Admin user = (Admin) session.getAttribute("adminUser");
        jzpreview.setUserId(user.getId());
        try {
            System.out.println(jzpreview);
            recordService.addTimejzRecord(jzpreview);
        } catch (Exception e) {
            return res.convertToErrorResult("修改失败");
        }
        return res;
    }

    //修改科室诊断
    @RequestMapping("/editKsjc")
    @ResponseBody
    public JsonAdminResult editKsjc(HttpSession session, Kscheck kscheck) {
        JsonAdminResult res = new JsonAdminResult(true);
        Admin user = (Admin) session.getAttribute("adminUser");
        kscheck.setUserId(user.getId());
        try {
            recordService.addTimeKscRecord(kscheck);
        } catch (Exception e) {
            res.convertToErrorResult("修改失败");
        }
        return res;
    }

    //修改导管室记录
    @RequestMapping("/editDg")
    @ResponseBody
    public JsonAdminResult editDgInfo(HttpSession session, Daoguanrecord daoguanrecord) {
        JsonAdminResult res = new JsonAdminResult(true);
        try {
            Admin user = (Admin) session.getAttribute("adminUser");
            daoguanrecord.setUserId(user.getId());
            recordService.addTimeDgsRecord(daoguanrecord);
        } catch (Exception e) {
            res.convertToErrorResult("提交失败");
        }
        return res;
    }

    //修改出院转归
    @RequestMapping("/editCyzg")
    @ResponseBody
    public JsonAdminResult editCyzgInfo(HttpSession session, Livehospital livehospital) {
        JsonAdminResult res = new JsonAdminResult(true);
        try {
            recordService.addTimeCyRecord(livehospital);
        } catch (Exception e) {
            res.convertToErrorResult("修改失败");
        }
        return res;
    }

    //修改神经外科创伤病人急诊手术登记表
    @RequestMapping("/editSjjz")
    @ResponseBody
    public JsonAdminResult editSjjzInfo(HttpSession session, Sjwkjzssrecord sjwkjzssrecord) {
        JsonAdminResult res = new JsonAdminResult(true);
        try {
            recordService.addSjBrRecord(sjwkjzssrecord);
        } catch (Exception e) {
            return res.convertToErrorResult("修改失败");
        }
        return res;
    }

    //修改宁都医院急诊表
    @RequestMapping("/editNdJz")
    @ResponseBody
    public JsonAdminResult editNdJzInfo(HttpSession session, Jzrecord jzrecord) {
        JsonAdminResult result = new JsonAdminResult(true);
        try {
            recordService.addNdJzRecord(jzrecord);
        } catch (Exception e) {
            return result.convertToErrorResult("修改失败");
        }
        return result;
    }
    //修改抢救用药
    @RequestMapping("/editQjyy")
    @ResponseBody
    public JsonAdminResult editQjyyInfo(HttpSession session, Qjyyrecord qjyyrecord) {
        JsonAdminResult res = new JsonAdminResult(true);
        try {
            System.out.println("我的世界");
            recordService.addQjyyRrcord(qjyyrecord);
        } catch (Exception e) {
            return res.convertToErrorResult("修改失败");
        }
        return res;
    }

    //修改抢救病人
    @RequestMapping("/editQjbr")
    @ResponseBody
    public JsonAdminResult editInfo(HttpSession session, Qjbrrecord qjbrrecord) {
        JsonAdminResult res = new JsonAdminResult(true);
        try {
            recordService.addQjbrRecord(qjbrrecord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @RequestMapping("/delRecord")
    @ResponseBody
    public JsonAdminResult delRecord(HttpSession session, Record record) {
        JsonAdminResult res = new JsonAdminResult(true);
        if (record.getRtype().equals("时间管理记录")) {
            Recordtype recordTypeById = null;
            try {
                recordTypeById = recordService.findRecordTypeById(record.getId());
                recordService.delYyjl(recordTypeById.getYqId());
                recordService.delTimeJzyj(recordTypeById.getJzId());
                recordService.delTimeKs(recordTypeById.getKsId());
                recordService.delTimeDg(recordTypeById.getDaoguanId());
                recordService.delCyzg(recordTypeById.getZyzgId());
                recordService.delRecordTypeById(recordTypeById.getTypeId());
            } catch (Exception e) {
                return res.convertToErrorResult("删除失败");
            }

        } else if (record.getRtype().equals("神经外科创伤病人急诊手术登记表")) {
            try {
                recordService.delSjbr(record.getId());
            } catch (Exception e) {
                return res.convertToErrorResult("删除失败");
            }

        } else if (record.getRtype().equals("宁都县人民医院急诊")) {
            try {
                recordService.delNdjz(record.getId());
            } catch (Exception e) {
                return res.convertToErrorResult("删除失败");
            }

        } else if (record.getRtype().equals("抢救用药记录")) {
            try {
                recordService.delYyjl(record.getId());
            } catch (Exception e) {
                return res.convertToErrorResult("删除失败");
            }
        } else if (record.getRtype().equals("创伤病人抢救表")) {
            try {
                recordService.delCsBr(record.getId());
            } catch (Exception e) {
                return res.convertToErrorResult("删除失败");
            }
        }
        return res;
    }

    @RequestMapping("/editQy")
    @ResponseBody
    public JsonAdminResult edtiQyInfo(Outpatient outpatient, HttpSession session) {
        JsonAdminResult res = new JsonAdminResult(true);
        Admin user = (Admin) session.getAttribute("adminUser");
        outpatient.setUserId(user.getId());
        try {
            recordService.addsTimeRecord(outpatient);
        } catch (Exception e) {
            return res.convertToErrorResult("修改失败");
        }
        return res;
    }

    @RequestMapping("/demo")
    public String demo() {
        return "admin/demo";
    }
}
