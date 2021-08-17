package com.ashifshadab.basicExample1;

import java.util.concurrent.Phaser;

public class Task implements Runnable {

	String name;
	Phaser phaser;

	public Task(String name, Phaser phaser) {
		super();
		this.name = name;
		this.phaser = phaser;
		this.phaser.register();
	}

	@Override
	public void run() {

		System.out.println(name + " Begining Phase One");

		phaser.arriveAndAwaitAdvance();

		try {

			Thread.sleep(100);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " Begining Phase Two");

		phaser.arriveAndAwaitAdvance();

		try {

			Thread.sleep(100);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " Begining Phase Three");

		phaser.arriveAndDeregister();

	}

}
