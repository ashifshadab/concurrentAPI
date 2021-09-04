package com.ashifshadab.stampedLock.example1.usingTryOptimisticRead;

import java.util.concurrent.locks.StampedLock;

/**
 * Using tryOptimisticRead method - StampedLock example.
 **/

public class ReadThread implements Runnable {

	StampedLock stampedLock;

	public ReadThread(StampedLock stampedLock) {
		super();
		this.stampedLock = stampedLock;
	}

	@Override
	public void run() {

		long stamp = stampedLock.tryOptimisticRead();

		try {

			System.out.println("In optimistic lock " + stampedLock.validate(stamp));

			Thread.sleep(2000);

			System.out.println("In optimistic lock " + stampedLock.validate(stamp));

		} catch (InterruptedException e) {

			e.printStackTrace();

		} finally {

			stampedLock.unlock(stamp);
		}

	}

}
