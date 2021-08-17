package com.ashifshadab.basicExample1;

import java.util.concurrent.Phaser;

public class TestPhaser {

	public static void main(String[] args) {

		Phaser phaser = new Phaser(1);

		int currentPhase;

		System.out.println("::::::STARTING::::::");

		new Thread(new Task("Raja", phaser)).start();

		new Thread(new Task("Mohan", phaser)).start();

		new Thread(new Task("Shoan", phaser)).start();

		// Wait for all thread to complete phase one
		currentPhase = phaser.getPhase();

		phaser.arriveAndAwaitAdvance();

		System.out.println("Phase " + currentPhase + " Completed");

		// Wait for all thread to complete phase two
		currentPhase = phaser.getPhase();

		phaser.arriveAndAwaitAdvance();

		System.out.println("Phase " + currentPhase + " Completed");

		// Wait for all thread to complete phase three
		currentPhase = phaser.getPhase();

		phaser.arriveAndAwaitAdvance();

		System.out.println("Phase " + currentPhase + " Completed");

		// Deregister the main thread
		phaser.arriveAndDeregister();

		if (phaser.isTerminated())
			System.out.println("The Phaser is terminated");

	}

}
