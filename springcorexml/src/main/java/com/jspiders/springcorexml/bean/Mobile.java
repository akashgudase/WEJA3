package com.jspiders.springcorexml.bean;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mobile {

	private int id;
	private String name;
	private double price;

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
