package com.ashifshadab.threadPool.threadPoolExecutor.example1;

import java.util.concurrent.TimeUnit;

public class TaskThread implements Runnable {

	@Override
	public void run() {

		try {
			
			Long duration = (long) (Math.random() * 5);
			
			System.out.println("Running Task! Thread Name: " + Thread.currentThread().getName());
			
			TimeUnit.SECONDS.sleep(duration);
			
			System.out.println("Task Completed! Thread Name: " + Thread.currentThread().getName());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
