package com.jspiders.multithreading.thread;

public class MyThread7 extends Thread {

	@SuppressWarnings("deprecation")
	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				this.stop();
			}
			System.out.println(this.getName() + " is running.");
		}

	}

}
