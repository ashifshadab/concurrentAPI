package com.ashifshadab.stampedLock.example1.usingReadWriteLock;

/**
 * This example uses the write lock in order to get an exclusive lock 
 * for a counter and there is also a read lock which tries to read the value of the counter.
 * **/

public class MyLockUsingStampedLock {

	int counter = 0;

	public int getValue() {
		return counter;
	}

	public void increment() {
		counter++;
		System.out.println("in increment " + counter);

	}
}
