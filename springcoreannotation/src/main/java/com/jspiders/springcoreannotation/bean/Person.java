package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component(value = "personBean")
@Data
public class Person {

	@Value("1")
	private long id;
	@Value("Ramesh")
	private String name;
	@Value("9987654788")
	private long contact;
	@Autowired
	private AadharCard aadharCard;

}
