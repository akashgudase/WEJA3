package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Wheel {

	private long id;
	private int size;

	@Value("1")
	public void setId(long id) {
		this.id = id;
	}

	@Value("18")
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Wheel [id=" + id + ", size=" + size + "]";
	}

}
