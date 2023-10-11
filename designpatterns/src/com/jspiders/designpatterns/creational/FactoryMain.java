package com.jspiders.designpatterns.creational;

import java.util.Scanner;

public class FactoryMain {

	private static Beverage beverage;

	public static void main(String[] args) {

		try {
			factory().order();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Beverage is not ordered.");
		}

	}

	private static Beverage factory() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 1 to order Masala tea\nEnter 2 to order Ginger tea\n"
				+ "Enter 3 to order Lemon tea\nEnter 4 to order Green tea");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			beverage = new MasalaTea();
			break;
		case 2:
			beverage = new GingerTea();
			break;
		case 3:
			beverage = new LemonTea();
			break;
		case 4:
			beverage = new GreenTea();
			break;
		default:
			System.out.println("Invalid choice");
		}
		scanner.close();
		return beverage;
	}

}
