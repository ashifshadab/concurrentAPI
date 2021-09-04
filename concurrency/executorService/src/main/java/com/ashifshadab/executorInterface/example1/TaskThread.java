package com.ashifshadab.executorInterface.example1;

import java.time.LocalDateTime;

public class TaskThread implements Runnable {

	@Override
	public void run() {

		try {
			
			Long duration = (long) (Math.random() * 5);
			
			System.out.println(Thread.currentThread().getName() +" Running Task start at " + LocalDateTime.now()); 
			
			Thread.sleep(duration);
			
			System.out.println(Thread.currentThread().getName() +" Task Completed at " + LocalDateTime.now());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
