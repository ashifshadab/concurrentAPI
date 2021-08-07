package com.ashifshadab.basicExample1;

import java.util.concurrent.Semaphore;

public class Increamentor implements Runnable {

	String name;

	Semaphore semaphore;

	public Increamentor(String name, Semaphore semaphore) {
		super();
		this.name = name;
		this.semaphore = semaphore;
	}

	public void run() {

		System.out.println(" STARTING " + name);

		try {

			// First get a permit
			System.out.println(name + " is waiting for permit");

			semaphore.acquire();

			System.out.println(name + " gets permit");

			// Now access shared Resource
			accessSharedResource();

		} catch (InterruptedException iexc) {

			System.out.println(iexc);
		}

		System.out.println(name + " Release the permit");

		semaphore.release();

	}

	private void accessSharedResource() {

		try {

			for (int i = 0; i < 5; i++) {

				SharedResource.count++;

				System.out.println(name + " : " + SharedResource.count);

				// Now,allow a context switch
				Thread.sleep(10);
			}

		} catch (InterruptedException iexc) {

			System.out.println(iexc);
		}
	}

}
