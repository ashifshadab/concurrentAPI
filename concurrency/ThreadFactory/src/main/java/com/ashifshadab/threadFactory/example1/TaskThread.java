package com.ashifshadab.threadFactory.example1;

public class TaskThread implements Runnable {

	@Override
	public void run() {

		System.out.println("My name is : " + Thread.currentThread().getName());

	}

}
