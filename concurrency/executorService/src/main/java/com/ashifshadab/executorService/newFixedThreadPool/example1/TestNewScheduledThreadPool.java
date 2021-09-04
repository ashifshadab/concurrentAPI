package com.ashifshadab.executorService.newFixedThreadPool.example1;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.ashifshadab.executorService.newSingleThreadExecutor.example1.TaskThread;

public class TestNewScheduledThreadPool {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		byUsingExecuteMethod(executorService);

		// byUsingSubmitMethod(executorService);

		// byUsingInvokeAnyMethod(executorService);

		// byUsingInvokeAny(executorService);

		executorService.shutdown();

		// executorService.shutdownNow();

	}

	private static void byUsingInvokeAny(ExecutorService executorService) {

		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Task 1";
			}
		});
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Task 2";
			}
		});
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Task 3";
			}
		});

		try {
			java.util.List<Future<String>> futures = executorService.invokeAll(callables);
			for (Future<String> future : futures) {
				System.out.println("future.get = " + future.get());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	private static void byUsingInvokeAnyMethod(ExecutorService executorService) {

		Set<Callable<String>> callables = new HashSet<Callable<String>>();
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Task 1";
			}
		});

		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Task 2";
			}
		});

		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Task 3";
			}
		});

		try {
			String result = executorService.invokeAny(callables);
			System.out.println("result = " + result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	private static void byUsingSubmitMethod(ExecutorService executorService) {

		executorService.submit(new TaskThread());

		executorService.submit(new TaskThread());

		executorService.submit(new TaskThread());

		executorService.submit(new TaskThread());

		executorService.submit(new TaskThread());
	}

	private static void byUsingExecuteMethod(ExecutorService executorService) {

		executorService.execute(new TaskThread());

		executorService.execute(new TaskThread());

		executorService.execute(new TaskThread());

		executorService.execute(new TaskThread());

		executorService.execute(new TaskThread());
	}
}
