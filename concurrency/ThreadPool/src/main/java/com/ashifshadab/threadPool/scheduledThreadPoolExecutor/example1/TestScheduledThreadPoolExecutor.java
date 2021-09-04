package com.ashifshadab.threadPool.scheduledThreadPoolExecutor.example1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestScheduledThreadPoolExecutor {

	public static void main(String[] args) {

		final ScheduledThreadPoolExecutor scheduler = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(1);

		final ScheduledFuture<?> beepHandler = scheduler.scheduleAtFixedRate(new BeepTask(), 2, 2, TimeUnit.SECONDS);
		
		scheduler.schedule(new BeepHandler(scheduler, beepHandler), 10, TimeUnit.SECONDS);

	}

}
