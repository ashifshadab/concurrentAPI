package com.ashifshadab.basicExample2;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {

	public static void main(String[] args) {

		CountDownLatch countDownLatch = new CountDownLatch(4);

		System.out.println("::::::::::::STARTING APPLICATION TestCountDownLatch::::::::::::::");

		new Thread(new Task("Raju", countDownLatch)).start();

		new Thread(new Task("Shyam", countDownLatch)).start();

		new Thread(new Task("Payal", countDownLatch)).start();

		new Thread(new Task("Mohit", countDownLatch)).start();

		try {

			countDownLatch.await();

			System.out.println("All services are up");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Further processing");
	}

}
