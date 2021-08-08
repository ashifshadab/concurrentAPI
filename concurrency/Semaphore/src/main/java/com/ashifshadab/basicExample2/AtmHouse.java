package com.ashifshadab.basicExample2;

import java.util.concurrent.Semaphore;

public class AtmHouse {
	
	static Semaphore semaphore = new Semaphore(3);

	public static void main(String[] args) {

		new Thread(new ATMMachine(semaphore,"Rohit")).start();
		
		new Thread(new ATMMachine(semaphore,"Shyam")).start();
		
		new Thread(new ATMMachine(semaphore,"Mohan")).start();
		
		new Thread(new ATMMachine(semaphore,"Petrict")).start();
		
		new Thread(new ATMMachine(semaphore,"Dilbar")).start();
		
		new Thread(new ATMMachine(semaphore,"Babu")).start();

	}

}
