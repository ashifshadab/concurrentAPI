package com.ashifshadab.atomicReferenceArray;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class Increment implements Runnable {

	AtomicReferenceArray<String> atomicReferenceArray;

	public Increment(AtomicReferenceArray<String> atomicReferenceArray) {
		this.atomicReferenceArray = atomicReferenceArray;
	}

	@Override
	public void run() {
		for (int i = 0; i < atomicReferenceArray.length(); i++) {
			String add = atomicReferenceArray.getAndSet(i, "item-" + (i + 1));
			System.out.println("Thread " + Thread.currentThread().getName() + ", index " + i + ", value: " + add);
		}

	}

}
