package com.ashifshadab.callable.example4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		Future<Integer> integerResult = executorService.submit(new IntegerCounterTask());

		Future<Double> doubleResult = executorService.submit(new DoubleTask());

		Future<String> stringTask = executorService.submit(new StringTask());

		System.out.println("Integer Value is: " + integerResult.get() + " Double Value is: " + doubleResult.get()
				+ " String result is: " + stringTask.get());
		
		executorService.shutdown();

	}

}
