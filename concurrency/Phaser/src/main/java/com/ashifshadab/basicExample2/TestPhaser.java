package com.ashifshadab.basicExample2;

public class TestPhaser {

	public static void main(String[] args) {

		MyPhaser myPhaser = new MyPhaser(1, 4);

		System.out.println("::::::STARTING::::::");

		new Thread(new Task("Raja", myPhaser)).start();

		new Thread(new Task("Mohan", myPhaser)).start();

		new Thread(new Task("Shoan", myPhaser)).start();

		// Wait for the specified number of phase to completed
		while (!myPhaser.isTerminated()) {
			myPhaser.arriveAndAwaitAdvance();
		}
		System.out.println("The Phaser is terminated");

	}

}
