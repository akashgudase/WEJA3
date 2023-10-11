package com.jspiders.designpatterns.structural;

public class TeacherAdapter extends Teacher implements Game {

	@Override
	public void football() {

		setId(1);
		setName("Aman");
		setEmail("aman@gamil.com");

		System.out.println(getName() + " is a coach of football team.");

	}

	@Override
	public void hockey() {

		setId(2);
		setName("Sushil");
		setEmail("sushil@gamil.com");

		System.out.println(getName() + " is a coach of hockey team.");

	}

}
