package com.ashifshadab.callable.example3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		Future<Integer> sumOfFuture;
		
		Future<Double> hypotOfFuture;
		
		Future<Integer> factorialOfFuture;
		
		System.out.println("STARTING");
		
		sumOfFuture = executorService.submit(new Sum(10));
		
		hypotOfFuture = executorService.submit(new Hypot(3, 4));
		
		factorialOfFuture = executorService.submit(new Factorial(5));
		
		try {
			
			System.out.println("Sum : "+ sumOfFuture.get());
			
			System.out.println("Hypot : "+ hypotOfFuture.get());
			
			System.out.println("Factorial : "+ factorialOfFuture.get());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		
		executorService.shutdown();
		
		System.out.println("DONE");
	}

}
