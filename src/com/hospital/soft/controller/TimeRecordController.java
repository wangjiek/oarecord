package com.hospital.soft.controller;

import com.hospital.soft.common.DateUtil;
import com.hospital.soft.common.result.JsonAdminResult;
import com.hospital.soft.mybatis.pojo.*;
import com.hospital.soft.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * 时间管理记录表空控制器
 */
@Controller
@RequestMapping("/user")
public class TimeRecordController extends BaseWeiXinController {
    @Autowired
    IRecordService service;

    @RequestMapping("/yuanqian")
    public String yuanQian() {
        return "table/yuanqian";
    }

    //添加院前系统
    @RequestMapping("/addTimeRecord")
    @ResponseBody
    public JsonAdminResult addYuanQianInfo(Outpatient outpatient, Daoguanrecord daoguanrecord, Jzpreview jzpreview, Kscheck kscheck, Livehospital livehospital, HttpSession session) {
        JsonAdminResult res = new JsonAdminResult(true);
        Admin user = (Admin) session.getAttribute("adminUser");
        outpatient.setUserId(user.getId());
        daoguanrecord.setUserId(user.getId());
        jzpreview.setUserId(user.getId());
        kscheck.setUserId(user.getId());
        livehospital.setUserId(user.getId());
        Date date = DateUtil.parseStringToDate(DateUtil.getToday(), "yyyy-MM-dd HH:mm:ss");
        daoguanrecord.setTimeAdminType(date);
        jzpreview.setTimeAdminType(date);
        kscheck.setTimeAdminType(date);
        livehospital.setTimeAdminType(date);
        outpatient.setTimeAdminType(DateUtil.parseStringToDate(DateUtil.getToday(), "yyyy-MM-dd HH:mm:ss"));
        jzpreview.setJzpatientName(outpatient.getPatientname());
        jzpreview.setFbAddress(outpatient.getFbAddress());


        try {
            service.addsTimeRecord(outpatient);
            service.addTimejzRecord(jzpreview);
            service.addTimeKscRecord(kscheck);
            service.addTimeDgsRecord(daoguanrecord);
            service.addTimeCyRecord(livehospital);
            Integer outpatientId = outpatient.getOutpatientId();
            Integer jzpreviewId = jzpreview.getJzpreviewId();
            Integer kscheckId = kscheck.getKscheckId();
            Integer dgrecordId = daoguanrecord.getDgrecordId();
            Integer livehospitalId = livehospital.getLivehospitalId();
            Recordtype recordtype = new Recordtype();
            recordtype.setCreateTime(date);
            recordtype.setYqId(outpatientId);
            recordtype.setDaoguanId(dgrecordId);
            recordtype.setKsId(kscheckId);
            recordtype.setJzId(jzpreviewId);
            recordtype.setZyzgId(livehospitalId);
            recordtype.setUserId(user.getId());
            service.addRecordType(recordtype);
        } catch (Exception ex) {
            return res.convertToErrorResult("提交失败");
        }

        return res;
    }

//    //添加急诊预检
//    @RequestMapping("/addjzyj")
//    @ResponseBody
//    public JsonAdminResult addJzYj(Jzpreview jzpreview, HttpSession session) {
//        JsonAdminResult res = new JsonAdminResult(true);
//
//        try {
//            jzpreview.setTimeAdminType(DateUtil.parseStringToDate(DateUtil.getToday(), "yyyy-MM-dd HH:mm:ss"));
//            User adminUser = (User) session.getAttribute("adminUser");
//            jzpreview.setUserId(adminUser.getId());
//
//        } catch (Exception e) {
//            return res.convertToErrorResult("提交失败");
//        }
//        return res;
//    }{
//    //添加科室检查
//    @RequestMapping("/addksjc")
//    @ResponseBody
//    public JsonAdminResult addKsjc(HttpSession session, Kscheck kscheck) {
//        JsonAdminResult res = new JsonAdminResult(true);
//        kscheck.setTimeAdminType(DateUtil.parseStringToDate(DateUtil.getToday(), "yyyy-MM-dd HH:mm:ss"));
//        User user = (User) session.getAttribute("adminUser");
//        kscheck.setUserId(user.getId());
//        try {
//            service.addTimeKscRecord(kscheck);
//        } catch (Exception e) {
//            return res.convertToErrorResult("提交失败");
//        }
//        return res;
//    }
//    //添加导管室
//    @RequestMapping("/adddgs")
//    @ResponseBody
//    public JsonAdminResult addDaoGuan(HttpSession session, Daoguanrecord daoguanrecord) {
//        JsonAdminResult res = new JsonAdminResult(true);
//        User user = (User) session.getAttribute("adminUser");
//        daoguanrecord.setTimeAdminType(DateUtil.parseStringToDate(DateUtil.getToday(), "yyyy-MM-dd HH:mm:ss"));
//        try {
//            daoguanrecord.setUserId(user.getId());
//            service.addTimeDgsRecord(daoguanrecord);
//        } catch (Exception e) {
//            return res.convertToErrorResult("提交失败");
//        }
//        return res
//    }
    //添加出院转归
//    @RequestMapping("/addcy")
//    @ResponseBody
//    public JsonAdminResult addcyInfo(Livehospital livehospital, HttpSession session) {
//        JsonAdminResult res = new JsonAdminResult(true);
//        livehospital.setTimeAdminType(DateUtil.parseStringToDate(DateUtil.getToday(), "yyyy-MM-dd HH:mm:ss"));
//        User user = (User) session.getAttribute("adminUser");
//        livehospital.setUserId(user.getId());
//        try {
//            System.out.println(livehospital);
//            service.addTimeCyRecord(livehospital);
//        } catch (Exception e) {
//            res.convertToErrorResult("提交失败");
//        }
//        return res;
//    }


}
