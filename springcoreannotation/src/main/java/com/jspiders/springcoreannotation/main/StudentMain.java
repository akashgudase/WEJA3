package com.jspiders.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotation.bean.Student;
import com.jspiders.springcoreannotation.config.StudentConfig;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}
