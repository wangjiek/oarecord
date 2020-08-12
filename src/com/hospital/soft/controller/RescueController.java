package com.hospital.soft.controller;


import com.hospital.soft.common.DateUtil;
import com.hospital.soft.common.result.JsonAdminResult;
import com.hospital.soft.mybatis.pojo.Admin;
import com.hospital.soft.mybatis.pojo.Qjbrrecord;
import com.hospital.soft.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 创伤病人抢救表控制器
 */
@Controller
@RequestMapping("/user")
public class RescueController extends BaseWeiXinController {
    @Autowired
    private IRecordService service;

    @RequestMapping("/rescueBr")
    public String rescueBrInfo() {
        return "table/qjbrrecord";
    }

    @RequestMapping("/addqjbr")
    @ResponseBody
    public JsonAdminResult addQjbrInfo(HttpSession session, Qjbrrecord qjbrrecord) {
        JsonAdminResult res = new JsonAdminResult(true);
        qjbrrecord.setQjiujilu(qjbrrecord.getQjiujilu().trim());
        qjbrrecord.setQjcreateTime(DateUtil.parseStringToDate(DateUtil.getToday(), "yyyy-MM-dd HH:mm:ss"));
        Admin user = (Admin) session.getAttribute("adminUser");
        qjbrrecord.setUserid(user.getId());
        try {
            service.addQjbrRecord(qjbrrecord);
        } catch (Exception e) {
            res.convertToErrorResult("提交失败");
        }
        return res;
    }


}
