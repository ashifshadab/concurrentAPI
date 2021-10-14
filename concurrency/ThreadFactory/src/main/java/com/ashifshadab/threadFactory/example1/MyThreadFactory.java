package com.ashifshadab.threadFactory.example1;

import java.util.concurrent.ThreadFactory;

/**
 * An object that creates new threads on demand. 
 * Using thread factories removes hardwiring of calls to new Thread, 
 * enabling applications to use special thread subclasses, priorities, etc.
 * 
 * Why use ThreadFactory?
 * We can give the threads more meaningful custom names. It helps in analyzing their purposes and how they work.
 * We can have the statistics about the created threads like the count of threads and other details. 
 * We can restrict the creation of new threads based on the statistics.
 * **/
public class MyThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable runnable) {

		return new Thread(runnable);
	}

	public static void main(String[] args) {

		MyThreadFactory myThreadFactory = new MyThreadFactory();

		Thread dancingThread = myThreadFactory.newThread(new TaskThread());

		Thread singingThread = myThreadFactory.newThread(new TaskThread());

		Thread clappingThread = myThreadFactory.newThread(new TaskThread());

		dancingThread.start();

		singingThread.start();

		clappingThread.start();

	}

}
