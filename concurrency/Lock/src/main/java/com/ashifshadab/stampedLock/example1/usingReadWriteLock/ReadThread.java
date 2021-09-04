package com.ashifshadab.stampedLock.example1.usingReadWriteLock;

import java.util.concurrent.locks.StampedLock;

/**
 * This example uses the write lock in order to get an exclusive lock 
 * for a counter and there is also a read lock which tries to read the value of the counter.
 * **/

public class ReadThread implements Runnable {

	MyLockUsingStampedLock myLockUsingStampedLock;

	StampedLock stampedLock;

	public ReadThread(MyLockUsingStampedLock myLockUsingStampedLock, StampedLock stampedLock) {
		super();
		this.myLockUsingStampedLock = myLockUsingStampedLock;
		this.stampedLock = stampedLock;
	}

	@Override
	public void run() {

		long stamp = stampedLock.readLock();
	      try{
	        System.out.println("value " + myLockUsingStampedLock.getValue());          
	      }finally{
	    	  stampedLock.unlockRead(stamp);
	      }

	}

}
