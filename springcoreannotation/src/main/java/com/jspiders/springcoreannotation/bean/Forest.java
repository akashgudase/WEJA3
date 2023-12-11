package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Forest {

	@Autowired
	// @Qualifier("cat")
	Animal animal;

}
