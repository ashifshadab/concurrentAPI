package com.ashifshadab.atomicLong;

public class WorkerThread implements Runnable {

	Counter counter;

	public WorkerThread(Counter counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {

		for (int i = 0; i < 1000; i++) {

			counter.increment();
		}

		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final number (should be 1000 for atomic integer): " + counter.value());
	}

}
