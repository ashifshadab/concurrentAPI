package com.ashifshadab.executor.basicExample2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The SingleThreadExecutor is a special type of executor that has only a single thread. 
 * It is used when we need to execute tasks in sequential order. 
 * In case when a thread dies due to some error or exception at the time of executing a task, 
 * a new thread is created, and all the subsequent tasks execute in that new one.
 * **/
public class SingleThreadExecutor {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();

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
