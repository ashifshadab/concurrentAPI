package com.ashifshadab.threadPool.threadPoolExecutor.example1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestThreadPoolExecutor {

	public static void main(String args[]) {

		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

		// Stats before tasks execution
		System.out.println("Largest executions: " + executor.getLargestPoolSize());
		System.out.println("Maximum allowed threads: " + executor.getMaximumPoolSize());
		System.out.println("Current threads in pool: " + executor.getPoolSize());
		System.out.println("Currently executing threads: " + executor.getActiveCount());
		System.out.println("Total number of threads(ever scheduled): " + executor.getTaskCount());

		executor.submit(new TaskThread());
		executor.submit(new TaskThread());

		// Stats after tasks execution
		System.out.println("Core threads: " + executor.getCorePoolSize());
		System.out.println("Largest executions: " + executor.getLargestPoolSize());
		System.out.println("Maximum allowed threads: " + executor.getMaximumPoolSize());
		System.out.println("Current threads in pool: " + executor.getPoolSize());
		System.out.println("Currently executing threads: " + executor.getActiveCount());
		System.out.println("Total number of threads(ever scheduled): " + executor.getTaskCount());

		executor.shutdown();

	}

}
