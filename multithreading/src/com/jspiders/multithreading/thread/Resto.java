package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Paratha;

public class Resto extends Thread {

	private Paratha paratha;

	public Resto(Paratha paratha) {
		super();
		this.paratha = paratha;
	}

	@Override
	public void run() {

		paratha.prepareParatha(10);

	}

}
