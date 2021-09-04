package com.ashifshadab.atomicIntegerArray;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Increment implements Runnable {

	AtomicIntegerArray atomicIntegerArray;

	public Increment(AtomicIntegerArray atomicIntegerArray) {
		super();
		this.atomicIntegerArray = atomicIntegerArray;
	}

	@Override
	public void run() {

		for (int i = 0; i < atomicIntegerArray.length(); i++) {
			
			int add = atomicIntegerArray.incrementAndGet(i);
			
			System.out.println("Thread " + Thread.currentThread().getName() + ", index " + i + ", value: " + add);
		}

	}

}
