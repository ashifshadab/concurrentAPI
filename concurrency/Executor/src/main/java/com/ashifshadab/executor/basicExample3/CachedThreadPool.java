package com.ashifshadab.executor.basicExample3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The CachedThreadPool is a special type of thread pool 
 * that is used to execute short-lived parallel tasks. 
 * The cached thread pool doesn't have a fixed number of threads. 
 * When a new task comes at a time when all the threads are busy in executing some other tasks, 
 * a new thread creates by the pool and add to the executor. 
 * When a thread becomes free, it carries out the execution of the new tasks. 
 * Threads are terminated and removed from the cached when they remain idle for sixty seconds.
 * **/

public class CachedThreadPool {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();

		System.out.println("::::::STARTING::::::::");

		executorService.execute(new Task("Raj"));
		executorService.execute(new Task("Mohit"));
		executorService.execute(new Task("Boss"));
		executorService.execute(new Task("Aazad"));
		executorService.execute(new Task("Yak"));

		executorService.shutdown();

		System.out.println("::::::DONE::::::::");

	}

}
