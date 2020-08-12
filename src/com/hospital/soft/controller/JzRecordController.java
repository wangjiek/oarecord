package com.hospital.soft.controller;

import com.hospital.soft.common.DateUtil;
import com.hospital.soft.common.result.JsonAdminResult;
import com.hospital.soft.mybatis.pojo.Admin;
import com.hospital.soft.mybatis.pojo.Jzrecord;
import com.hospital.soft.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 急诊表控制器
 */
@Controller
@RequestMapping("/user")
public class JzRecordController extends BaseWeiXinController {
    @Autowired
    private IRecordService service;

    @RequestMapping("/jztable")
    public String jzTableInfo() {
        return "table/jzrecord";
    }

    @RequestMapping("/addndjz")
    @ResponseBody
    public JsonAdminResult addndJzInfo(HttpSession session, Jzrecord jzrecord, HttpServletRequest request, HttpServletResponse response) {
        JsonAdminResult res = new JsonAdminResult(true);
        jzrecord.setCreattime(DateUtil.parseStringToDate(DateUtil.getToday(), "yyyy-MM-dd HH:mm:ss"));
        Admin user = (Admin) session.getAttribute("adminUser");
        jzrecord.setUserId(user.getId());
        try {
            service.addNdJzRecord(jzrecord);
        } catch (Exception e) {
            res.convertToErrorResult("提交失败");
        }

        return res;
    }
}
