package com.jspiders.springcorexml.bean;

import java.util.List;

import lombok.Data;

@Data
public class Customer {

	private long id;
	private String name;
	private long contact;
	private List<Product> products;

}
