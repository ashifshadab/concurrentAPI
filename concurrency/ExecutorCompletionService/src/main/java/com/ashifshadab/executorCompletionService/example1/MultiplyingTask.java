package com.ashifshadab.executorCompletionService.example1;

import java.util.concurrent.Callable;

public class MultiplyingTask implements Callable<Integer> {

	int value1;
	int value2;
	long sleepTime;
	String taskName;

	public MultiplyingTask(int num1, int num2, long sleepTime, String taskName) {
		super();
		this.value1 = num1;
		this.value2 = num2;
		this.sleepTime = sleepTime;
		this.taskName = taskName;
	}

	@Override
	public Integer call() throws Exception {

		System.out.println("Started taskName: " + taskName);

		int result = value1 * value2;

		Thread.sleep(sleepTime);

		System.out.println("Completed taskName: " + taskName);

		return result;
	}

}
