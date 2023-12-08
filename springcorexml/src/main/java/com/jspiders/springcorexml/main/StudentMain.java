package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.bean.Student;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("student_config.xml");
		Student student1 = (Student) applicationContext.getBean("student1");
		System.out.println(student1);
		Student student2 = (Student) applicationContext.getBean("student2");
		System.out.println(student2);
		((ClassPathXmlApplicationContext) applicationContext).close();

	}

}
