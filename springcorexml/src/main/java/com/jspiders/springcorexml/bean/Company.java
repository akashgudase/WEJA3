package com.jspiders.springcorexml.bean;

import java.util.List;

import lombok.Data;

@Data
public class Company {

	private int id;
	private String name;
	private String location;
	private List<Employee> employees;

}
