package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	private long id;
	private String name;
	private Wheel wheel;

	@Value("1")
	public void setId(long id) {
		this.id = id;
	}

	@Value("Santro")
	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", wheel=" + wheel + "]";
	}

}
