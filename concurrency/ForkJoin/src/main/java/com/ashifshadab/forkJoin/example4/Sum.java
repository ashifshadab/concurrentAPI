package com.ashifshadab.forkJoin.example4;

import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask<Long> {

	int low;
	int high;
	int[] array;

	public Sum(int[] array, int high, int low) {
		super();
		this.low = low;
		this.high = high;
		this.array = array;
	}

	@Override
	protected Long compute() {
		if (high - low <= 10) {
			long sum = 0;

			for (int i = low; i < high; ++i)
				sum += array[i];
			return sum;
		} else {
			int mid = low + (high - low) / 2;
			Sum left = new Sum(array, low, mid);
			Sum right = new Sum(array, mid, high);
			left.fork();
			long rightResult = right.compute();
			long leftResult = left.join();
			return leftResult + rightResult;
		}
	}

}
