package com.jspiders.springcoreannotation.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Bow Bow..");
	}

}
