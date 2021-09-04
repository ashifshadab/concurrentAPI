package com.ashifshadab.threadPool.newCachedThreadPool.example1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestNewCachedThreadPool {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newCachedThreadPool();

		// Cast the object to its class type
		ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;

		// Stats before tasks execution
		System.out.println("Largest executions: " + pool.getLargestPoolSize());
		System.out.println("Maximum allowed threads: " + pool.getMaximumPoolSize());
		System.out.println("Current threads in pool: " + pool.getPoolSize());
		System.out.println("Currently executing threads: " + pool.getActiveCount());
		System.out.println("Total number of threads(ever scheduled): " + pool.getTaskCount());

		executor.submit(new TaskThread());
		executor.submit(new TaskThread());

		// Stats after tasks execution
		System.out.println("Core threads: " + pool.getCorePoolSize());
		System.out.println("Largest executions: " + pool.getLargestPoolSize());
		System.out.println("Maximum allowed threads: " + pool.getMaximumPoolSize());
		System.out.println("Current threads in pool: " + pool.getPoolSize());
		System.out.println("Currently executing threads: " + pool.getActiveCount());
		System.out.println("Total number of threads(ever scheduled): " + pool.getTaskCount());

		executor.shutdown();

	}

}
