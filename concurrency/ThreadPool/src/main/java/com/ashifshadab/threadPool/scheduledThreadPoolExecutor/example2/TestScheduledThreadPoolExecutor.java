package com.ashifshadab.threadPool.scheduledThreadPoolExecutor.example2;

import java.util.Calendar;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestScheduledThreadPoolExecutor {

	public static void main(String[] args) {

		// Creating a ScheduledThreadPoolExecutor object
		ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(2);

		// Creating two Runnable objects
		Runnable task1 = new TaskThread("task1");
		Runnable task2 = new TaskThread("task2");

		// Printing the current time in seconds
		System.out.println("Current time : " + Calendar.getInstance().get(Calendar.SECOND));

		// Scheduling the first task which will execute
		// after 2 seconds
		threadPool.schedule(task1, 2, TimeUnit.SECONDS);

		// Scheduling the second task which will execute
		// after 5 seconds
		threadPool.schedule(task2, 5, TimeUnit.SECONDS);

		// Remember to shut sown the Thread Pool
		threadPool.shutdown();

	}

}
