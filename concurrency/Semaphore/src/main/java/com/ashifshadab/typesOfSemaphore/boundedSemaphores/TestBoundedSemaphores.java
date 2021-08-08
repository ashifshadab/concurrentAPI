package com.ashifshadab.typesOfSemaphore.boundedSemaphores;

public class TestBoundedSemaphores {

	static BoundedSemaphores boundedSemaphores = new BoundedSemaphores(4);

	public static void main(String[] args) {

		new Thread(new Task("Raj", boundedSemaphores)).start();

		new Thread(new Task("Mohan", boundedSemaphores)).start();

		new Thread(new Task("Shoan", boundedSemaphores)).start();

		new Thread(new Task("Mohit", boundedSemaphores)).start();

	}

}
