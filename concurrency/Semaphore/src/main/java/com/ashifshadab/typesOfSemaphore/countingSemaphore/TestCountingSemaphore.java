package com.ashifshadab.typesOfSemaphore.countingSemaphore;

public class TestCountingSemaphore {

	static CountingSemaphore countingSemaphore =new CountingSemaphore();
	
	public static void main(String[] args) {

		new Thread(new Task("Raj",countingSemaphore)).start();
		
		new Thread(new Task("Mohan",countingSemaphore)).start();
		
		new Thread(new Task("Shoan",countingSemaphore)).start();
		
		new Thread(new Task("Mohit",countingSemaphore)).start();

	}

}
