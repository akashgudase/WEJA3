package com.jspiders.designpatterns.creational;

public class ContactBuilder {

	private String firstName;
	private String lastName;
	private String dob;
	private long mobile;
	private long work;
	private long home;
	private int landline;
	private String email;
	private String website;
	private String address;

	public ContactBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public ContactBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public ContactBuilder dob(String dob) {
		this.dob = dob;
		return this;
	}

	public ContactBuilder mobile(long mobile) {
		this.mobile = mobile;
		return this;
	}

	public ContactBuilder work(long work) {
		this.work = work;
		return this;
	}

	public ContactBuilder home(long home) {
		this.home = home;
		return this;
	}

	public ContactBuilder landline(int landline) {
		this.landline = landline;
		return this;
	}

	public ContactBuilder email(String email) {
		this.email = email;
		return this;
	}

	public ContactBuilder website(String website) {
		this.website = website;
		return this;
	}

	public ContactBuilder address(String address) {
		this.address = address;
		return this;
	}

	public Contact buildContact() {

		return new Contact(firstName, lastName, dob, mobile, work, home, 
				landline, email, website, address);

	}

}
