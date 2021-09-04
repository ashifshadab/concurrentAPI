package com.ashifshadab.reentrantLock.example1;

import java.util.concurrent.locks.ReentrantLock;

public class WorkerThread implements Runnable {

	ReentrantLock reentrantLock;

	public WorkerThread(ReentrantLock reentrantLock) {
		super();
		this.reentrantLock = reentrantLock;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName()+ " is waiting for get Lock");
		
		reentrantLock.lock();
		
		System.out.println(Thread.currentThread().getName() + " got the Lock");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Any Threads waiting to acquire this lock " + reentrantLock.hasQueuedThreads());
		
		System.out.println(reentrantLock.getQueueLength()+ " numbers of thread waiting to acquire lock");
		
		System.out.println(Thread.currentThread().getName() + " Realeas the Lock");
		
		reentrantLock.unlock();
	}

}
