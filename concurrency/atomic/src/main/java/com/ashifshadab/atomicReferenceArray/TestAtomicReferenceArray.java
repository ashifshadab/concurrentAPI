package com.ashifshadab.atomicReferenceArray;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class TestAtomicReferenceArray {

	private static String[] source = new String[10];
	private static AtomicReferenceArray<String> atomicReferenceArray = new AtomicReferenceArray<String>(source);

	public static void main(final String[] arguments) throws InterruptedException {

		for (int i = 0; i < atomicReferenceArray.length(); i++) {
			atomicReferenceArray.set(i, "item-2");
		}

		Thread t1 = new Thread(new Increment(atomicReferenceArray));
		Thread t2 = new Thread(new Compare(atomicReferenceArray));
		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

}
