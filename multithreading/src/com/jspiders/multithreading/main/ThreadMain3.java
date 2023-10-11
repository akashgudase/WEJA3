package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread7;

public class ThreadMain3 {

	public static void main(String[] args) {

		MyThread7 myThread7 = new MyThread7();
		myThread7.setName("Thread7");
		myThread7.start();

	}

}
