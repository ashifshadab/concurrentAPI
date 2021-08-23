package com.ashifshadab.executor.basicExample4;

public class Task implements Runnable {

	String name;

	public Task(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(name + " : " + i);
		}

	}

}
