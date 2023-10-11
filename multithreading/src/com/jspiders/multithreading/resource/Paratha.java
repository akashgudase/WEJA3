package com.jspiders.multithreading.resource;

public class Paratha {

	private int availableParatha;

	public synchronized void orderParatha(int numberOfParatha) {

		if (numberOfParatha > availableParatha) {
			System.out.println(numberOfParatha + " Parathas not available. Please wait for sometime..");
			try {
				
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		availableParatha -= numberOfParatha;
		System.out.println("Order for " + numberOfParatha + " parathas is successful");

	}

	public synchronized void prepareParatha(int numberOfParatha) {

		System.out.println(numberOfParatha + " Parathas are getting prepared.");
		availableParatha += numberOfParatha;
		System.out.println(availableParatha + " Parathas are available.");
		notify();

	}

}
