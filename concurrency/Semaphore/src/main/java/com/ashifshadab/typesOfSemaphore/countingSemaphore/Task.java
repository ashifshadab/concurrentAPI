package com.ashifshadab.typesOfSemaphore.countingSemaphore;

public class Task implements Runnable {

	String name;
	
	CountingSemaphore countingSemaphore;

	
	
	public Task(String name, CountingSemaphore countingSemaphore) {
		super();
		this.name = name;
		this.countingSemaphore = countingSemaphore;
	}



	public void run() {

		try {

			// First get a permit
			System.out.println(name + " is waiting for permit");
			
			countingSemaphore.take();
			
			System.out.println(name + " Got permit");
			
			for (int i = 0; i < 5; i++) {

				System.out.println(name + " : " + i);

				// Now,allow a context switch
				Thread.sleep(100);
			}

			System.out.println(name + " Release the permit");
			
			countingSemaphore.release();
			
		} catch (InterruptedException iexc) {

			System.out.println(iexc);
		}

	}

}
