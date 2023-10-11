package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.Paratha;
import com.jspiders.multithreading.thread.Customer;
import com.jspiders.multithreading.thread.Resto;

public class ParathaMain {

	public static void main(String[] args) {

		Paratha paratha = new Paratha();

		Customer customer = new Customer(paratha);
		Resto resto = new Resto(paratha);

		customer.start();
		resto.start();

	}

}
