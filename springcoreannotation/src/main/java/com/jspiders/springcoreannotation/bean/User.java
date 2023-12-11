package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class User {

	@Value("1")
	private long id;
	@Value("Ramesh")
	private String userName;
	@Value("ramesh@gmail.com")
	private String email;
	@Value("Ramesh@1234")
	private String password;

}
