package com.ashifshadab.atomicLong;

public class TestAtomicLong {

	public static void main(String[] args) {

		Counter counter = new Counter();
		
		WorkerThread workerThread = new WorkerThread(counter);
		
		new Thread(workerThread).start();

	}

}
