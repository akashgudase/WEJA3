package com.jspiders.springcoreannotation.bean;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Meow Meow..");
	}

}
