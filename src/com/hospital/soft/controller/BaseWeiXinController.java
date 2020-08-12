package com.hospital.soft.controller;

import com.alibaba.fastjson.JSONObject;
import com.hospital.soft.common.CommonUtil;
import com.hospital.soft.common.LoginException;
import com.hospital.soft.common.result.JsonAppResult;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseWeiXinController {

	private static Logger log = LogManager.getLogger(BaseWeiXinController.class);

	@ExceptionHandler
	public String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception ex) {
		ex.printStackTrace();
		JsonAppResult res = new JsonAppResult("0", "系统异常,请稍后再试!");
		res.put("errmsg", ex.getMessage());
		if (ex instanceof LoginException) {
			res = new JsonAppResult("-1", "登录超时,请重新登录!");
		}
		CommonUtil.write(response, JSONObject.toJSONString(res));
		return null;

	}
	public void write(HttpServletResponse response, String obj) {
		Writer writer;
		try {
			response.setContentType("text/html;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			response.setHeader("Cache-Control", "no-cache");
			writer = response.getWriter();
			writer.write(obj);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getOpenId(HttpServletRequest request) {
		return (String) request.getSession().getAttribute("openId");
	}
    //
	@InitBinder
	public void stringToDate(WebDataBinder webDataBinder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		//创建属性编辑器
		CustomDateEditor customDateEditor = new CustomDateEditor(format, true);
		webDataBinder.registerCustomEditor(Date.class, customDateEditor);
	}
}
