package com.ashifshadab.typesOfSemaphore.binarySemaphore;

public class TestBinarySemaphore {

	static BinarySemaphore binarySemaphore = new BinarySemaphore(1);

	public static void main(String[] args) {

		new Thread(new Task("Raj", binarySemaphore)).start();

		new Thread(new Task("Mohan", binarySemaphore)).start();

		new Thread(new Task("Shoan", binarySemaphore)).start();

		new Thread(new Task("Mohit", binarySemaphore)).start();

	}

}
