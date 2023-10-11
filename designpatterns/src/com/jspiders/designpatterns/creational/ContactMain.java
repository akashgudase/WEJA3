package com.jspiders.designpatterns.creational;

public class ContactMain {

	public static void main(String[] args) {

		Contact contact = new ContactBuilder().mobile(9876543210l).firstName("Ram").lastName("A.").buildContact();
		System.out.println(contact);

	}

}
