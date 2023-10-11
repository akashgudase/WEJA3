package com.jspiders.multithreading.resource;

public class Resource {

	public void message() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello from " + Thread.currentThread().getName());
		}

	}

}
