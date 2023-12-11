package com.jspiders.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotation.bean.Vehicle;

public class VehicleMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				"com.jspiders.springcoreannotation");
		Vehicle vehicle = applicationContext.getBean(Vehicle.class);
		System.out.println(vehicle);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}
