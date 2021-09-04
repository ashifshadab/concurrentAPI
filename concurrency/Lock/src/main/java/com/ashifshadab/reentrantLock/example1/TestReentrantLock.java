package com.ashifshadab.reentrantLock.example1;

import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock {

	public static void main(String[] args) {

		ReentrantLock reentrantLock = new ReentrantLock();
		
		WorkerThread workerThread1 = new WorkerThread(reentrantLock);
		
		WorkerThread workerThread2 = new WorkerThread(reentrantLock);
		
		WorkerThread workerThread3 = new WorkerThread(reentrantLock);
		
		WorkerThread workerThread4 = new WorkerThread(reentrantLock);
		
		WorkerThread workerThread5 = new WorkerThread(reentrantLock);
		
		new Thread(workerThread1).start();
		
		new Thread(workerThread2).start();
		
		new Thread(workerThread3).start();
		
		new Thread(workerThread4).start();
		
		new Thread(workerThread5).start();
		
		

	}

}
