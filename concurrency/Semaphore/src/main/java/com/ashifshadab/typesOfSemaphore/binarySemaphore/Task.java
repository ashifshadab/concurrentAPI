package com.ashifshadab.typesOfSemaphore.binarySemaphore;

public class Task implements Runnable {

	String name;
	
	BinarySemaphore binarySemaphore;


	public Task(String name, BinarySemaphore binarySemaphore) {
		super();
		this.name = name;
		this.binarySemaphore = binarySemaphore;
	}


	public void run() {

		try {

			// First get a permit
			System.out.println(name + " is waiting for permit");
			
			binarySemaphore.waitForNotify();
			
			System.out.println(name + " Got permit");
			
			for (int i = 0; i < 5; i++) {

				System.out.println(name + " : " + i);

				// Now,allow a context switch
				Thread.sleep(100);
			}

			System.out.println(name + " Release the permit");
			
			binarySemaphore.notifyToWakeup();
			
		} catch (InterruptedException iexc) {

			System.out.println(iexc);
		}

	}

}
