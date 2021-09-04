package com.ashifshadab.executorInterface.example1;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestExecutorInterface {

	public static void main(String[] args) {

		Executor executor = Executors.newCachedThreadPool();
		
		executor.execute(new TaskThread());
		
		executor.execute(new TaskThread());
		
		executor.execute(new TaskThread());
		
		executor.execute(new TaskThread());
		
		executor.execute(new TaskThread());
		
		ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;
		
		pool.shutdown();

	}

}
