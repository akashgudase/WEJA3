package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VotingCard {

	private long id;
	private String number;

	public VotingCard(@Value("1") long id, @Value("ABC123") String number) {
		super();
		this.id = id;
		this.number = number;
	}

	@Override
	public String toString() {
		return "VotingCard [id=" + id + ", number=" + number + "]";
	}

}
