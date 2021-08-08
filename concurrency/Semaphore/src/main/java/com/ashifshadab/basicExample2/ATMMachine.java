package com.ashifshadab.basicExample2;

import java.util.concurrent.Semaphore;

public class ATMMachine implements Runnable {

	Semaphore semaphore;

	String customerName;

	public ATMMachine(Semaphore semaphore, String customerName) {
		super();
		this.semaphore = semaphore;
		this.customerName = customerName;
	}

	public void run() {

		try {

			System.out.println(customerName + " Trying to get chance for ATM access");

			semaphore.acquire();

			System.out.println(customerName + " Got chance for ATM access");

			for (int i = 1; i <= 5; i++) {

				System.out.println(customerName + " : is performing transactions " + i);

				Thread.sleep(1000);

			}
			
			semaphore.release();
			
			System.out.println(customerName + " : released the ATM access");

		} catch (InterruptedException iexc) {
			iexc.getCause();
		}
		

	}

}
