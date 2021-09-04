package com.ashifshadab.stampedLock.example1.usingReadWriteLock;

import java.util.concurrent.locks.StampedLock;

/**
 * This example uses the write lock in order to get an exclusive lock 
 * for a counter and there is also a read lock which tries to read the value of the counter.
 * **/

public class TestStampedLock {

	public static void main(String[] args) {

		MyLockUsingStampedLock myLockUsingStampedLock = new MyLockUsingStampedLock();
		
		StampedLock stampedLock = new StampedLock();
		
		
		WriteThread writeThread = new WriteThread(myLockUsingStampedLock, stampedLock);
		
		ReadThread readThread = new ReadThread(myLockUsingStampedLock, stampedLock);
		
		// 3 write tasks
		new Thread(writeThread).start();
		new Thread(writeThread).start();
		new Thread(writeThread).start();
		
		// 1 read task
		new Thread(readThread).start();
		
	}

}
