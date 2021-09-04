package com.ashifshadab.forkJoin.example1;

import java.util.concurrent.ForkJoinPool;

public class TestForkJoin {

	public static void main(String[] args) {

		// get no. of available core available
		int proc = Runtime.getRuntime().availableProcessors();

		System.out.println("Number of available core in the processor is: " + proc);

		// get no. of threads active
		ForkJoinPool Pool = ForkJoinPool.commonPool();

		System.out.println("Number of active thread before invoking: " + Pool.getActiveThreadCount());

		NewTask t = new NewTask(400);

		Pool.invoke(t);

		System.out.println("Number of active thread after invoking: " + Pool.getActiveThreadCount());
		System.out.println("Common Pool Size is: " + Pool.getPoolSize());

	}

}
