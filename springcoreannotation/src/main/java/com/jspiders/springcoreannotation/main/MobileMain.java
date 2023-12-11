package com.jspiders.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotation.bean.Mobile;

public class MobileMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(
				"com.jspiders.springcoreannotation.bean");
		Mobile mobile = (Mobile) applicationContext.getBean("mobile");
		System.out.println(mobile);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}
