package com.ashifshadab.atomicInteger;

public class TestAtomicInteger {

	public static void main(String[] args) {

		Counter counter = new Counter();
		
		WorkerThread workerThread = new WorkerThread(counter);
		
		new Thread(workerThread).start();

	}

}
