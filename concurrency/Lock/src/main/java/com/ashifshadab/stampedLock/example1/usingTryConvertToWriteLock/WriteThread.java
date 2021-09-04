package com.ashifshadab.stampedLock.example1.usingTryConvertToWriteLock;

/**
 * StampedLock Example using tryConvertToWriteLock method
 **/

public class WriteThread implements Runnable {

	Distance distance;

	public WriteThread(Distance distance) {
		super();
		this.distance = distance;
	}

	@Override
	public void run() {
		distance.moveIfAtOrigin(0.1, 0.5);
	}

}
