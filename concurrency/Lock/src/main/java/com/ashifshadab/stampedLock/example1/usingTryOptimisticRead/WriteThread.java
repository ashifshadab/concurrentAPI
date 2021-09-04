package com.ashifshadab.stampedLock.example1.usingTryOptimisticRead;

import java.util.concurrent.locks.StampedLock;

/**
 * Using tryOptimisticRead method - StampedLock example.
 **/

public class WriteThread implements Runnable {

	StampedLock stampedLock;

	public WriteThread(StampedLock stampedLock) {
		super();
		this.stampedLock = stampedLock;
	}

	@Override
	public void run() {

		System.out.println("about to get write lock");

		try {
			
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long stamp = stampedLock.writeLock();

		try {

			System.out.println("After getting write lock ");

		} finally {
			stampedLock.unlock(stamp);
			System.out.println("Relinquished write lock ");
		}

	}

}
