package com.ashifshadab.executor.basicExample4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * The ScheduledExecutor is another special type of executor 
 * which we use to run a certain task at regular intervals. 
 * It is also used when we need to delay a certain task.
 * **/
public class ScheduledExecutor {

	public static void main(String[] args) {

		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

		System.out.println("::::::STARTING::::::::");
		
		
		executorService.schedule(new Task("Raj"),5,TimeUnit.SECONDS);
		executorService.schedule(new Task("Mohit"),5,TimeUnit.SECONDS);
		executorService.schedule(new Task("Boss"),5,TimeUnit.SECONDS);
		executorService.schedule(new Task("Aazad"),5,TimeUnit.SECONDS);
		executorService.schedule(new Task("Yak"),5,TimeUnit.SECONDS);

		executorService.shutdown();

		System.out.println("::::::DONE::::::::");

	}

}
//https://java2blog.com/java-executor-framework-tutorial-example/
