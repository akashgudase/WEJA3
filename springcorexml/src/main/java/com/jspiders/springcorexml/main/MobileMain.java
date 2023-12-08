package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.bean.Mobile;

public class MobileMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("mobile_config.xml");
		Mobile mobile = (Mobile) applicationContext.getBean("mobile");
		System.out.println(mobile);
		((ClassPathXmlApplicationContext) applicationContext).close();

	}

}
