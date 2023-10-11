package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.Resource;
import com.jspiders.multithreading.thread.MyThread5;
import com.jspiders.multithreading.thread.MyThread6;

public class ThreadMain2 {

	public static void main(String[] args) {

		Resource resource = new Resource();

		MyThread5 myThread5 = new MyThread5(resource);
		myThread5.setName("Thread5");

		MyThread6 myThread6 = new MyThread6(resource);
		myThread6.setName("Thread6");

		myThread5.start();
		myThread6.start();

	}

}
