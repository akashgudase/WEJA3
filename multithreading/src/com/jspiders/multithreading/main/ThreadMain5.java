package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.Source;
import com.jspiders.multithreading.thread.Thread1;
import com.jspiders.multithreading.thread.Thread2;

public class ThreadMain5 {

	public static void main(String[] args) {

		Source source = new Source();
		Thread1 thread1 = new Thread1(source);
		thread1.setName("Thread1");
		Thread2 thread2 = new Thread2(source);
		thread2.setName("Thread2");

		thread1.start();
		thread2.start();

	}

}
