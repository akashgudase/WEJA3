package com.jspiders.multithreading.thread;

public class MyThread8 extends Thread {

	@Override
	public void run() {

		String str = "Hello World!";
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
