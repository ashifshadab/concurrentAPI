package com.ashifshadab.reentrantReadWriteLock.example1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReaderThread implements Runnable {
	
	ReentrantReadWriteLock reentrantReadWriteLock;
	
	Console console;
	
	

	public ReaderThread(ReentrantReadWriteLock reentrantReadWriteLock, Console console) {
		super();
		this.reentrantReadWriteLock = reentrantReadWriteLock;
		this.console = console;
	}



	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " is going to accquire the Read Lock");
		
		reentrantReadWriteLock.readLock().lock();
		
		System.out.println(Thread.currentThread().getName() + " accquire the read Lock");
		
		console.print();
		
		reentrantReadWriteLock.readLock().unlock();
		
		System.out.println(Thread.currentThread().getName() + " release the read Lock");

	}

}
