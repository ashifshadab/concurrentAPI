package com.ashifshadab.executor.basicExample1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *FixedThreadPool is another special type of executor 
 *that is a thread pool having a fixed number of threads. 
 *By this executor, the submitted task is executed by the n thread. 
 *In case when we need to execute more tasks after submitting previous tasks, 
 *they store in the LinkedBlockingQueue until previous tasks are not completed. 
 *The n denotes the total number of thread which are supported by the underlying processor. 
 * **/
public class FixedThreadPool {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		
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
