package com.hospital.soft.common;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TomcatListener implements ServletContextListener {
	
	
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("tomcat关闭,当前RechargeExecutor Size=");
		System.out.println("tomcat关闭成功..............");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {

		System.out.println("tomcat启动了..............");
	}

}