package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.bean.User;

public class UserMain {

	public static void main(String[] args) {

        ApplicationContext applicationContext = 
        		new ClassPathXmlApplicationContext("user_config.xml");
		User user = applicationContext.getBean(User.class);
		System.out.println(user);
		((ClassPathXmlApplicationContext) applicationContext).close();

	}

}
