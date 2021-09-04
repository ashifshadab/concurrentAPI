package com.ashifshadab.forkJoin.divideAndConquer.example1;

import java.util.concurrent.RecursiveAction;

/**
 * Basic example of Divide and Conquer strategy. In this case RecursiveAction is
 * used.
 * 
 * A ForkJoin Task via RecursiveAction that transforms the elements of an array
 * of doubles into their square roots.
 **/
public class SqrtTransform extends RecursiveAction {

	/**
	 * The threshold value is arbitrarily set at 1000 in this example In real world
	 * code its optimal value can be determined by profiling and experimentation
	 */
	final int seqThreshold = 1000;

	// Array to be accessed
	double[] data;

	// Determines what part of data to process
	int start, end;

	public SqrtTransform(double[] data, int start, int end) {
		super();
		this.data = data;
		this.start = start;
		this.end = end;
	}

	// This is the method in which parallel computation will occur.
	@Override
	protected void compute() {

		// If number of elements is bellow the sequential threshold,
		// then process sequentially
		if ((end - start) < seqThreshold) {

			// Transform each elements into its square root
			for (int i = start; i < end; i++) {
				data[i] = Math.sqrt(data[i]);
			}

		} else {

			// Otherwise continue to break the data into smaller pieces

			// Find the midpoint
			int middle = (start + end) / 2;

			// Invoke the new Tasks, using the subdivided data.
			invokeAll(new SqrtTransform(data, start, middle), new SqrtTransform(data, middle, end));

		}

	}

}
