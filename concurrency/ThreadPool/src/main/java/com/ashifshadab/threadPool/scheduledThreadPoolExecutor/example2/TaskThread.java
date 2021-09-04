package com.ashifshadab.threadPool.scheduledThreadPoolExecutor.example2;

import java.util.Calendar;

public class TaskThread implements Runnable {

	String taskName;

	public TaskThread(String taskName) {
		super();
		this.taskName = taskName;
	}

	@Override
	public void run() {

		System.out.println("Task name : " + this.taskName + " Current time: " + Calendar.getInstance().get(Calendar.SECOND));

	}

}
