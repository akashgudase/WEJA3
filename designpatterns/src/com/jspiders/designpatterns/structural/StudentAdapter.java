package com.jspiders.designpatterns.structural;

public class StudentAdapter extends Student implements Game {

	@Override
	public void football() {

		setId(1);
		setName("Pratik");
		setEmail("pratik@gmail.com");

		System.out.println(getName() + " is a cpatain of football team.");

	}

	@Override
	public void hockey() {

		setId(2);
		setName("Vaibhav");
		setEmail("vaibhav@gmail.com");

		System.out.println(getName() + " is a cpatain of hockey team.");

	}

}
