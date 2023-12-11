package com.jspiders.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotation.bean.Person;

public class PersonMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(
				"com.jspiders.springcoreannotation");
		Person person = (Person) applicationContext.getBean("personBean");
		System.out.println(person);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}
