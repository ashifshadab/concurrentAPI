package com.ashifshadab.callable.example1;

import java.util.concurrent.Callable;

public class FactorialService implements Callable<Long> {

	private int number;

	public FactorialService(int number) {
		this.number = number;
	}

	@Override
	public Long call() throws Exception {

		return factorial();
	}

	private Long factorial() throws InterruptedException {
		long result = 1;

		while (number != 0) {
			result = number * result;
			number--;
			Thread.sleep(100);
		}
		return result;
	}

}
