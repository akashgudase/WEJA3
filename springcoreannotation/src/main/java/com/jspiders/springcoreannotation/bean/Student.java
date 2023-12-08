package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Student {
	
	{
		System.out.println("Object created for student");
	}

	@Value("1")
	private long id;
	@Value("Ramesh")
	private String name;
	@Value("ramesh@gmail.com")
	private String email;
	@Value("24")
	private int age;

}
