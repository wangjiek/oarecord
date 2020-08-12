package com.hospital.soft.controller;

import com.hospital.soft.common.DateUtil;
import com.hospital.soft.common.result.JsonAdminResult;
import com.hospital.soft.mybatis.pojo.Admin;
import com.hospital.soft.mybatis.pojo.Sjwkjzssrecord;
import com.hospital.soft.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 神经外科创伤病人急诊手术登记表控制器
 */
@Controller
@RequestMapping("/user")
public class SurgeryController extends BaseWeiXinController {
    @Autowired
    IRecordService service;

    @RequestMapping("surgeryBr")
    public String surgeryBrInfo() {
        return "table/sjwkjzss";
    }

    @RequestMapping("/addSjbr")
    @ResponseBody
    public JsonAdminResult addSjberInfo(HttpSession session, Sjwkjzssrecord sjwkjzssrecord) {
        JsonAdminResult res = new JsonAdminResult(true);
        sjwkjzssrecord.setCreateDatesj(DateUtil.parseStringToDate(DateUtil.getToday(), "yyyy-MM-dd HHH:mm:ss"));
        Admin user = (Admin) session.getAttribute("adminUser");
        sjwkjzssrecord.setUserId(user.getId());

        try {
            service.addSjBrRecord(sjwkjzssrecord);
        } catch (Exception e) {
            return res.convertToErrorResult("提交失败");
        }
        return res;
    }

}
