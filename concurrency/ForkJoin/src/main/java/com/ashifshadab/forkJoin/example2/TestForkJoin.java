package com.ashifshadab.forkJoin.example2;

import java.util.concurrent.ForkJoinPool;

public class TestForkJoin {

	public static void main(String[] args) {

		// Custom input array elements
		int arr[] = { 50, 32, 61, 50, 49, 50, 16, 71, 50, 94, 10, 90, 12, 50, 78, 98, 88, 99 };

		// the element that is to
		// be searched in the arr
		int searchEle = 50;

		// assinging values to the
		// starting and ending indices
		int s = 0;
		int e = arr.length - 1;

		// Creating an object of the ForkJoinPool class
		ForkJoinPool fjp = ForkJoinPool.commonPool();

		// Now creating an object of the SearchWork class
		SearchWork sw = new SearchWork(arr, s, e, searchEle);

		// submitting the task to the ForkJoinPool
		int freq = fjp.invoke(sw);

		// printing the result
		System.out.println("The number " + searchEle + " is found " + freq + " times. ");

	}

}
