package com.ashifshadab.atomicLongArray;

import java.util.concurrent.atomic.AtomicLongArray;

public class TestAtomicLongArray {

	private static AtomicLongArray atomicLongArray = new AtomicLongArray(10);

	public static void main(final String[] arguments) throws InterruptedException {

		for (int i = 0; i < atomicLongArray.length(); i++) {
			atomicLongArray.set(i, 1);
		}

		Thread t1 = new Thread(new Increment(atomicLongArray));
		Thread t2 = new Thread(new Compare(atomicLongArray));
		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Values: ");

		for (int i = 0; i < atomicLongArray.length(); i++) {
			System.out.print(atomicLongArray.get(i) + " ");
		}
	}
}
