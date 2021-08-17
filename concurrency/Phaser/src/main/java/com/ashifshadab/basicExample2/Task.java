package com.ashifshadab.basicExample2;

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

		while (!phaser.isTerminated()) {

			System.out.println(name + " Begining phase " + phaser.getPhase());

			phaser.arriveAndAwaitAdvance();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
