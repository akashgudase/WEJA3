package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.bean.Customer;

public class CustomerMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("customer_config.xml");
		Customer customer1 = (Customer) applicationContext.getBean("customer1");
		System.out.println(customer1);
		Customer customer2 = (Customer) applicationContext.getBean("customer2");
		System.out.println(customer2);
		((ClassPathXmlApplicationContext) applicationContext).close();

	}

}
