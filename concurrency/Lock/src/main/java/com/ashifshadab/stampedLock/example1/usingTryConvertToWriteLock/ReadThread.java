package com.ashifshadab.stampedLock.example1.usingTryConvertToWriteLock;

/**
 * StampedLock Example using tryConvertToWriteLock method
 **/

public class ReadThread implements Runnable {

	Distance distance;

	public ReadThread(Distance distance) {
		super();
		this.distance = distance;
	}

	@Override
	public void run() {
		System.out.println(distance.distanceFromOrigin());
	}

}
