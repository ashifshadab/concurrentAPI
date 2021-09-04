package com.ashifshadab.forkJoin.example2;

import java.util.concurrent.RecursiveTask;

public class SearchWork extends RecursiveTask<Integer> {

	int arr[];
	int s, e;
	int searchEle;

	public SearchWork(int[] arr, int s, int e, int searchEle) {
		super();
		this.arr = arr;
		this.s = s;
		this.e = e;
		this.searchEle = searchEle;
	}

	@Override
	protected Integer compute() {
		// Returns the frequency computed by countFreq
		return countFreq();
	}

	// A method to return the count of
	// number of times the searched element has occurred
	private Integer countFreq() {

		// At the beginning,
		// the c is set to 0
		int c = 0;

		// iterating using the for loop
		for (int j = s; j <= e; j++) {

			// if element is present in array
			if (arr[j] == searchEle) {

				// Increment the c by 1
				c = c + 1;
			}
		}

		// return the number of times the searched element
		// has occurred
		return c;
	}

}
