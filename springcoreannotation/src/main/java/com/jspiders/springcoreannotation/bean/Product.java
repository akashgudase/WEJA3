package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Product {

	@Value("1")
	private long id;
	@Value("laptop")
	private String name;
	@Value("45000")
	private double price;

}
