package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AadharCard {

	@Value("1")
	private long id;
	@Value("394763476354")
	private long aadharNumber;

}
