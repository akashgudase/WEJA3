package com.jspiders.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotation.bean.Product;
import com.jspiders.springcoreannotation.config.ProductConfig;

public class ProductMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(ProductConfig.class);
		Product product = applicationContext.getBean(Product.class);
		System.out.println(product);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}
