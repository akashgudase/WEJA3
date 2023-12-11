package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Voter {

	private long id;
	private String name;
	private VotingCard votingCard;

	public Voter(@Value("1") long id, @Value("Ramesh") String name, @Autowired VotingCard votingCard) {
		super();
		this.id = id;
		this.name = name;
		this.votingCard = votingCard;
	}

	@Override
	public String toString() {
		return "Voter [id=" + id + ", name=" + name + ", votingCard=" + votingCard + "]";
	}

}
