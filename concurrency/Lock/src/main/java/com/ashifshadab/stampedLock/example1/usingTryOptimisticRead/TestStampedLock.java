package com.ashifshadab.stampedLock.example1.usingTryOptimisticRead;

import java.util.concurrent.locks.StampedLock;

/**
 * Using tryOptimisticRead method - StampedLock example.
 * **/

public class TestStampedLock {

	public static void main(String[] args) {
		
		StampedLock stampedLock = new StampedLock();
		
		
		WriteThread writeThread = new WriteThread(stampedLock);
		
		ReadThread readThread = new ReadThread(stampedLock);
		

		new Thread(writeThread).start();
		
		new Thread(readThread).start();
		
		new Thread(writeThread).start();
		
		
		
	}

}
