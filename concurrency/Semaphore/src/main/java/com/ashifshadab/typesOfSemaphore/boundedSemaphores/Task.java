package com.ashifshadab.typesOfSemaphore.boundedSemaphores;

public class Task implements Runnable {

	String name;

	BoundedSemaphores boundedSemaphores;

	

	public Task(String name, BoundedSemaphores boundedSemaphores) {
		super();
		this.name = name;
		this.boundedSemaphores = boundedSemaphores;
	}



	public void run() {

		try {

			// First get a permit
			System.out.println(name + " is waiting for permit");

			boundedSemaphores.take();

			System.out.println(name + " Got permit");

			for (int i = 0; i < 5; i++) {

				System.out.println(name + " : " + i);

				// Now,allow a context switch
				Thread.sleep(100);
			}

			System.out.println(name + " Release the permit");

			boundedSemaphores.release();

		} catch (InterruptedException iexc) {

			System.out.println(iexc);
		}

	}

}
