package com.ashifshadab.atomicReferenceArray;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class Compare implements Runnable {

	AtomicReferenceArray<String> atomicReferenceArray;

	public Compare(AtomicReferenceArray<String> atomicReferenceArray) {
		this.atomicReferenceArray = atomicReferenceArray;
	}

	@Override
	public void run() {

		for (int i = 0; i < atomicReferenceArray.length(); i++) {
			System.out.println("Thread " + Thread.currentThread().getName() + ", index " + i + ", value: "
					+ atomicReferenceArray.get(i));
			boolean swapped = atomicReferenceArray.compareAndSet(i, "item-2", "updated-item-2");
			System.out.println("Item swapped: " + swapped);

			if (swapped) {
				System.out.println("Thread " + Thread.currentThread().getName() + ", index " + i + ", updated-item-2");
			}
		}

	}

}
