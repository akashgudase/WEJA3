package com.jspiders.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotation.bean.Voter;

public class VoterMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				"com.jspiders.springcoreannotation");
		Voter voter = applicationContext.getBean(Voter.class);
		System.out.println(voter);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}
