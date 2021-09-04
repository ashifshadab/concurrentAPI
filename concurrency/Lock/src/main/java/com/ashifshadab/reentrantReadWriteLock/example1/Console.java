package com.ashifshadab.reentrantReadWriteLock.example1;

import java.util.ArrayList;
import java.util.List;

public class Console {

	private List<String> elements = new ArrayList<String>();

	public void write() {

		String name = Thread.currentThread().getName();

		System.out.println(name + " is writing");

		for (int i = 0; i <= 5; i++) {

			elements.add(name);
		}

		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void print() {

		String name = Thread.currentThread().getName();

		System.out.println(name + " is printting");

		for (String string : elements) {
			System.out.println(name);
		}

		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
