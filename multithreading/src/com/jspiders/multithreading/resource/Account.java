package com.jspiders.multithreading.resource;

public class Account {

	private double accountBalance;

	public Account(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public synchronized void deposit(double amount) {

		accountBalance += amount;
		System.out.println("Amount of rupees " + amount + " has been credited.");
		System.out.println("Updated account balance = " + accountBalance);

	}

	public synchronized void withdraw(double amount) {

		if (amount > accountBalance) {
			System.out.println("Insufficient account balance");
		} else {
			accountBalance -= amount;
			System.out.println("Amount of rupees " + amount + " has been debited.");
			System.out.println("Updated account balance = " + accountBalance);
		}

	}

}
