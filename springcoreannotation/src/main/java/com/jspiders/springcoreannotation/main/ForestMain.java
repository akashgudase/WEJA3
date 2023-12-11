package com.jspiders.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotation.bean.Animal;
import com.jspiders.springcoreannotation.bean.Forest;

public class ForestMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				"com.jspiders.springcoreannotation");
		Forest forest = applicationContext.getBean(Forest.class);
		Animal animal = forest.getAnimal();
		animal.sound();
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}
