package com.jspiders.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotation.bean.User;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(
				"com.jspiders.springcoreannotation.bean");
		User user = applicationContext.getBean(User.class);
		System.out.println(user);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}
