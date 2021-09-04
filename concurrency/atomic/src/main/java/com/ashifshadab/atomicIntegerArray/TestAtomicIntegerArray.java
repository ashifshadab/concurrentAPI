package com.ashifshadab.atomicIntegerArray;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class TestAtomicIntegerArray {

	private static AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(10);

	public static void main(final String[] arguments) throws InterruptedException {

		for (int i = 0; i < atomicIntegerArray.length(); i++) {
			atomicIntegerArray.set(i, 1);
		}

		Thread t1 = new Thread(new Increment(atomicIntegerArray));

		Thread t2 = new Thread(new Compare(atomicIntegerArray));

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Values: ");

		for (int i = 0; i < atomicIntegerArray.length(); i++) {
			System.out.println(atomicIntegerArray.get(i));
		}
	}
}
