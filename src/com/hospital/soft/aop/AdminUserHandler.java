package com.hospital.soft.aop;

import com.hospital.soft.common.CommonSessionListener;
import com.hospital.soft.common.LoginException;
import com.hospital.soft.mybatis.pojo.Admin;
import com.hospital.soft.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
@SuppressWarnings("all")
public class AdminUserHandler implements HandlerInterceptor {

	@Autowired
	private IAdminUserService adminUserService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Cache-Control", "no-cache");

		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Cache-Control", "no-cache");
		HttpSession session = request.getSession();
		if (session.getAttribute("adminUser") != null) {
			CommonSessionListener.setAuthCodeToLocal((String) session.getAttribute("authCode"));
			return checkRole(request);
		} else {
			String authCode = null;
			Cookie[] cookies = request.getCookies();// 这样便可以获取一个cookie数组
			if (cookies == null) {
				throw new LoginException("登录超时,请重新登录.");
			}
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("authCode")) {
					authCode = cookie.getValue();
				}
			}
			if (authCode == null) {

				throw new LoginException("登录超时,请重新登录..");
			} else {
				Admin t =adminUserService.getAdminUserByAuthCode(authCode);
				if (t == null) {
					throw new LoginException("登录超时,请重新登录...");
				} else {
					CommonSessionListener.setAuthCodeToLocal(authCode);
					session.setAttribute("authCode", authCode);
					session.setAttribute("adminUser", t);
					CommonSessionListener.addSession(t.getAuthcode(), request.getSession());
					return checkRole(request);
				}
			}
		}

	}

	private boolean checkRole(HttpServletRequest request) {
		boolean isApi = false;
		String uri = request.getRequestURI();
		if (uri.contains("_")) {
			isApi = true;
		}
		return true;
	}
}
