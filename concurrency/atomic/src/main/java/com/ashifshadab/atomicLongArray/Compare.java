package com.ashifshadab.atomicLongArray;

import java.util.concurrent.atomic.AtomicLongArray;

public class Compare implements Runnable {

	AtomicLongArray atomicLongArray;

	public Compare(AtomicLongArray atomicLongArray) {
		super();
		this.atomicLongArray = atomicLongArray;
	}

	@Override
	public void run() {

		for (int i = 0; i < atomicLongArray.length(); i++) {
			boolean swapped = atomicLongArray.compareAndSet(i, 2, 3);

			if (swapped) {
				System.out.println("Thread " + Thread.currentThread().getName() + ", index " + i + ", value: 3");
			}
		}

	}

}
