package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	private long id;
	private String name;
	private double price;

	@Value("1")
	public void setId(long id) {
		this.id = id;
	}

	@Value("Nord 3")
	public void setName(String name) {
		this.name = name;
	}

	@Value("34000")
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
