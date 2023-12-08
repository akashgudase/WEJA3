package com.jspiders.springcoreannotation.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcoreannotation.bean.Student;

public class StudentConfig {

	@Bean(name = "student")
	public Student getStudent() {
		return new Student();
	}

}
