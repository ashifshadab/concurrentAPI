package com.ashifshadab.forkJoin.divideAndConquer.example1;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {

	public static void main(String[] args) {

		// Create a task pool
		ForkJoinPool forkJoinPool = new ForkJoinPool();

		double[] nums = new double[100000];

		// Give some values

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (double) i;
		}

		System.out.println("A portion of the orginal sequence : ");

		for (int i = 0; i < 10; i++)
			System.out.print(nums[i] + "");

		System.out.println("\n");

		SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

		forkJoinPool.invoke(task);

		System.out.println("A portion of the transformed sequence (to four decimal places): ");

		for (int i = 0; i < 10; i++)
			System.out.format("%.4f", nums[i]);
		
		System.out.println("");
		

	}

}
