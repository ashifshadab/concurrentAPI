package com.ashifshadab.atomicLongArray;

import java.util.concurrent.atomic.AtomicLongArray;

public class Increment implements Runnable {

	AtomicLongArray atomicLongArray;

	public Increment(AtomicLongArray atomicLongArray) {
		super();
		this.atomicLongArray = atomicLongArray;
	}

	@Override
	public void run() {

		for (int i = 0; i < atomicLongArray.length(); i++) {
			long add = atomicLongArray.incrementAndGet(i);
			System.out.println("Thread " + Thread.currentThread().getName() + ", index " + i + ", value: " + add);
		}

	}

}
