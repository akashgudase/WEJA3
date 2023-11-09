package com.jspiders.onetoonebi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AadharCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, unique = true)
	private long aadharNumber;
	@OneToOne(mappedBy = "aadharCard")
	private Person person;

	@Override
	public String toString() {
		return "AadharCard [id=" + id + ", aadharNumber=" + aadharNumber + "]";
	}

}
