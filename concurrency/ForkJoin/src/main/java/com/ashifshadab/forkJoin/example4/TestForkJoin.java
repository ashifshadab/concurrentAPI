package com.ashifshadab.forkJoin.example4;

import java.util.concurrent.ForkJoinPool;

public class TestForkJoin {

	public static void main(String args[]) {

		int nThreads = Runtime.getRuntime().availableProcessors();
		System.out.println(nThreads);

		int[] numbers = new int[1000];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}

		ForkJoinPool forkJoinPool = new ForkJoinPool(nThreads);
		Long result = forkJoinPool.invoke(new Sum(numbers, 0, numbers.length));
		System.out.println(result);
	}
}
