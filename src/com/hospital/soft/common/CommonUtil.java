package com.hospital.soft.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class CommonUtil {


	public static String getAuthCode(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return MD5.getMD5(session.getId() + "wangjie" + System.currentTimeMillis());

	}

	public static void write(HttpServletResponse response, String obj) {
		try {
			response.setHeader("Content-type", "text/html;charset=UTF-8");
			response.setHeader("Cache-Control", "no-cache");
			response.setCharacterEncoding("UTF-8");
			PrintWriter ps = response.getWriter();
			ps.print(obj);
			ps.flush();
			ps.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
