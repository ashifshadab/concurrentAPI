package com.ashifshadab.reentrantReadWriteLock.example1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestReentrantReadWriteLock {

	public static void main(String[] args) {

		ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
		
		Console console = new Console();
		
		
		WriterThread writerThread1 = new WriterThread(reentrantReadWriteLock, console);
		
		WriterThread writerThread2 = new WriterThread(reentrantReadWriteLock, console);
		
		WriterThread writerThread3 = new WriterThread(reentrantReadWriteLock, console);
		
		ReaderThread readerThread1 = new ReaderThread(reentrantReadWriteLock, console);
		
		ReaderThread readerThread2 = new ReaderThread(reentrantReadWriteLock, console);
		

		//new Thread(readerThread1).start();
		//new Thread(readerThread2).start();
		
		new Thread(writerThread1).start();
		new Thread(writerThread2).start();
		new Thread(writerThread3).start();
		
		new Thread(readerThread1).start();
		new Thread(readerThread2).start();

	}

}
