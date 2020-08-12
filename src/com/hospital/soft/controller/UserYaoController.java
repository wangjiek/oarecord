package com.hospital.soft.controller;

import com.hospital.soft.common.DateUtil;
import com.hospital.soft.common.result.JsonAdminResult;
import com.hospital.soft.mybatis.pojo.Admin;
import com.hospital.soft.mybatis.pojo.Qjyyrecord;
import com.hospital.soft.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 抢救医生用药表f
 */
@Controller
@RequestMapping("/user")
public class UserYaoController extends BaseWeiXinController {
    @Autowired
    private IRecordService recordService;

    @RequestMapping("/medications")
    public String medicationsInfo() {
        return "table/qjyyrecord";
    }


    @RequestMapping("/addqjyy")
    @ResponseBody
    public JsonAdminResult addQjyy(HttpSession session, Qjyyrecord qjyyrecord) {
        JsonAdminResult res = new JsonAdminResult(true);
        Admin user = (Admin) session.getAttribute("adminUser");
        qjyyrecord.setNowresult(qjyyrecord.getNowresult().trim());
        qjyyrecord.setUserId(user.getId());
        qjyyrecord.setCreateTimej(DateUtil.parseStringToDate(DateUtil.getToday(), "yyyy-MM-dd HH:mm:ss"));
        try {
            recordService.addQjyyRrcord(qjyyrecord);
        } catch (Exception e) {
            res.convertToErrorResult("提交失败");
        }
        return res;
    }
}
