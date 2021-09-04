package com.ashifshadab.stampedLock.example1.usingReadWriteLock;

import java.util.concurrent.locks.StampedLock;

/**
 * This example uses the write lock in order to get an exclusive lock 
 * for a counter and there is also a read lock which tries to read the value of the counter.
 * **/

public class WriteThread implements Runnable {

	MyLockUsingStampedLock myLockUsingStampedLock;

	StampedLock stampedLock;

	public WriteThread(MyLockUsingStampedLock myLockUsingStampedLock, StampedLock stampedLock) {
		super();
		this.myLockUsingStampedLock = myLockUsingStampedLock;
		this.stampedLock = stampedLock;
	}

	@Override
	public void run() {

		long stamp = stampedLock.writeLock();
		try {
			myLockUsingStampedLock.increment();
			
		} finally {
			stampedLock.unlockWrite(stamp);
		}

	}

}
