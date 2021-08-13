package com.ashifshadab.basicExamle1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable {

	String name;

	CyclicBarrier cyclicBarrier;

	public Task(String name, CyclicBarrier cyclicBarrier) {
		super();
		this.name = name;
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {

		System.out.println("Now Turn for thread "+name);
		
		for(int i=10; i>5; i--) {
			System.out.println(name + " is Printing " + i);
		}
		
		try {
			cyclicBarrier.await();
			
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		
		
	}

}
