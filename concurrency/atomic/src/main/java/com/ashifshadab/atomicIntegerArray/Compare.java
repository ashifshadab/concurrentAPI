package com.ashifshadab.atomicIntegerArray;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Compare implements Runnable {

	AtomicIntegerArray atomicIntegerArray;

	public Compare(AtomicIntegerArray atomicIntegerArray) {
		super();
		this.atomicIntegerArray = atomicIntegerArray;
	}

	@Override
	public void run() {

		for (int i = 0; i < atomicIntegerArray.length(); i++) {
			boolean swapped = atomicIntegerArray.compareAndSet(i, 2, 3);

			if (swapped) {
				System.out.println("Thread " + Thread.currentThread().getName() + ", index " + i + ", value: 3");
			}
		}

	}

}
