package com.hospital.soft.common;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CommonSessionListener implements HttpSessionListener {

	// 存放authCode
	private static ThreadLocal<String> authCodeLocal = new ThreadLocal<String>();

	public static void setAuthCodeToLocal(String authCode) {
		authCodeLocal.set(authCode);
	}

	public static String getAuthCodeFromLocal() {
		return authCodeLocal.get();
	}
	// 只保存有登录(有authCode)的session对象
	private static ConcurrentMap<String, HttpSession> curSessionMap = new ConcurrentHashMap<String, HttpSession>();

	public static HttpSession getSessionByAuthCode(String authCode) {
		try {
			HttpSession session = curSessionMap.get(authCode);
			//session存在,就设置存活时间
			if(session!=null){
				session.setMaxInactiveInterval(900);
			}
			return session;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 新建的session不管
	@Override
	public void sessionCreated(HttpSessionEvent httpSessionEvent) {

	}

	// 销毁时候如果有authCode,就从map中移除
	@Override
	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		HttpSession session = httpSessionEvent.getSession();
		if (session.getAttribute("authCode") != null) {
//			System.out.println("sessionDestroyed remove:" + session.getAttribute("authCode"));
			curSessionMap.remove((String) session.getAttribute("authCode"));
		}
	}

	public synchronized static void addSession(String authCode, HttpSession session) {
		curSessionMap.put(authCode, session);
	}

	public synchronized static void removeSession(String authCode) {
		if (curSessionMap.containsKey(authCode)) {
			try {
//				System.out.println(" removeSession remove:" + authCode);
				curSessionMap.get(authCode).invalidate();
				curSessionMap.remove(authCode);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
