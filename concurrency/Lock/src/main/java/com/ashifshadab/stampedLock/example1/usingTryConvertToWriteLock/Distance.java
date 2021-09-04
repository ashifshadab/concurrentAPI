package com.ashifshadab.stampedLock.example1.usingTryConvertToWriteLock;

import java.util.concurrent.locks.StampedLock;

/**
 * StampedLock Example using tryConvertToWriteLock method
 **/

public class Distance {

	StampedLock stampedLock;

	double x = 0.0;
	double y = 0.0;

	public Distance(StampedLock stampedLock) {
		super();
		this.stampedLock = stampedLock;
	}

	void moveIfAtOrigin(double newX, double newY) { // upgrade
		// Could instead start with optimistic, not read mode
		long stamp = stampedLock.readLock();
		try {
			while (x == 0.0 && y == 0.0) {
				long ws = stampedLock.tryConvertToWriteLock(stamp);
				if (ws != 0L) {
					stamp = ws;
					x = newX;
					y = newY;
					break;
				} else {
					stampedLock.unlockRead(stamp);
					stamp = stampedLock.writeLock();
				}
			}
		} finally {
			stampedLock.unlock(stamp);
		}
	}

	double distanceFromOrigin() { // A read-only method
		long stamp = stampedLock.tryOptimisticRead();
		double currentX = x, currentY = y;
		if (!stampedLock.validate(stamp)) {
			stamp = stampedLock.readLock();
			try {
				currentX = x;
				currentY = y;
			} finally {
				stampedLock.unlockRead(stamp);
			}
		}
		return Math.sqrt(currentX * currentX + currentY * currentY);
	}

}
