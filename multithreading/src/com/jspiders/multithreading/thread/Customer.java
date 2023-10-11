package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Paratha;

public class Customer extends Thread {

	private Paratha paratha = new Paratha();

	public Customer(Paratha paratha) {
		super();
		this.paratha = paratha;
	}

	@Override
	public void run() {

		paratha.orderParatha(10);

	}

}
