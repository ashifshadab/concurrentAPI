package com.ashifshadab.stampedLock.example1.usingTryConvertToWriteLock;

import java.util.concurrent.locks.StampedLock;

/**
 * StampedLock Example using tryConvertToWriteLock method
 **/

public class TestStampedLock {

	public static void main(String[] args) {

		StampedLock stampedLock = new StampedLock();

		Distance distance = new Distance(stampedLock);

		WriteThread writeThread = new WriteThread(distance);

		ReadThread readThread = new ReadThread(distance);

		new Thread(writeThread).start();

		new Thread(readThread).start();

	}

}
