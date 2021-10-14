package com.ashifshadab.executorCompletionService.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCompletionServiceDemo {

	public static void main(String[] args) {

		MultiplyingTask multiplyingTask1 = new MultiplyingTask(10, 20, 2000l, "Task 1");
		MultiplyingTask multiplyingTask2 = new MultiplyingTask(30, 40, 4000l, "Task 2");
		MultiplyingTask multiplyingTask3 = new MultiplyingTask(40, 50, 3000l, "Task 3");
		MultiplyingTask multiplyingTask4 = new MultiplyingTask(50, 60, 1000l, "Task 4");

		ExecutorService executorService = Executors.newFixedThreadPool(4);
		CompletionService<Integer> executorCompletionService = new ExecutorCompletionService<>(executorService);
		List<Future<Integer>> futures = new ArrayList<Future<Integer>>();
		futures.add(executorCompletionService.submit(multiplyingTask1));
		futures.add(executorCompletionService.submit(multiplyingTask2));
		futures.add(executorCompletionService.submit(multiplyingTask3));
		futures.add(executorCompletionService.submit(multiplyingTask4));

		for (int i = 0; i < futures.size(); i++) {
			try {
				Integer result = executorCompletionService.take().get();
				System.out.println("Result: " + result);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		executorService.shutdown();

	}

}
