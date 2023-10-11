package com.jspiders.designpatterns.creational;

public class SingletonLazy {

	private static SingletonLazy singletonLazy;

	private SingletonLazy() {

	}

	public static SingletonLazy getObject() {

		if (singletonLazy == null) {
			singletonLazy = new SingletonLazy();
		}

		return singletonLazy;

	}

}
