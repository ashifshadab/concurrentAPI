package com.ashifshadab.reentrantReadWriteLock.example1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriterThread implements Runnable {

	ReentrantReadWriteLock reentrantReadWriteLock;

	Console console;

	public WriterThread(ReentrantReadWriteLock reentrantReadWriteLock, Console console) {
		super();
		this.reentrantReadWriteLock = reentrantReadWriteLock;
		this.console = console;
	}

	@Override
	public void run() {

		System.out.println("Is there any thread holds the write Lock " + reentrantReadWriteLock.isWriteLocked());

		System.out.println(Thread.currentThread().getName() + " is going to accquire the Write Lock");

		reentrantReadWriteLock.writeLock().lock();

		System.out.println(Thread.currentThread().getName() + " accquire the Write Lock");

		console.write();

		reentrantReadWriteLock.writeLock().unlock();

		System.out.println(Thread.currentThread().getName() + " release the Write Lock");

	}

}
