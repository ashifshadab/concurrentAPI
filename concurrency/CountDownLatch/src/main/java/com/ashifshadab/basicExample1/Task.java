package com.ashifshadab.basicExample1;

import java.util.concurrent.CountDownLatch;

public class Task implements Runnable {

	String name;
	CountDownLatch countDownLatch;

	public Task(String name, CountDownLatch countDownLatch) {
		super();
		this.name = name;
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {

		System.out.println(name+" STARTING JOB");

		try {

			for (int i = 0; i < 3; i++) {

				System.out.println(name + " : " + i);

				countDownLatch.countDown();

				// Now,allow a context switch
				//Thread.sleep(10);
			}

		} catch (Exception iexc) {

			System.out.println(iexc);
		}
		System.out.println(name+" Finished JOB");
	}

}
