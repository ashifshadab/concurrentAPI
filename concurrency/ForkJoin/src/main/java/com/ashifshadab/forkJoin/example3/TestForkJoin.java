package com.ashifshadab.forkJoin.example3;

import java.util.concurrent.ForkJoinPool;

public class TestForkJoin {

	public static void main(String[] args) {

		// getting the number of core available in the system
		int noOfCore = Runtime.getRuntime().availableProcessors();

		System.out.println("Total Number of available cores in the system processor is: " + noOfCore);

		// getting the instance of the pool
		ForkJoinPool Pool = ForkJoinPool.commonPool();

		System.out.println("Total number of active threads before invoking: " + Pool.getActiveThreadCount());

		// creating an instance of the class NewTaskService
		NewTaskService nts = new NewTaskService(1000);

		// calling the invoke() method
		Pool.invoke(nts);

		System.out.println("Total number of active threads after invoking: " + Pool.getActiveThreadCount());

		System.out.println("The size of the Common Pool is: " + Pool.getPoolSize());

	}

}
