package com.ashifshadab.scheduledExecutorServiceInterface.example1;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public class BeepHandler implements Runnable {

	ScheduledExecutorService scheduler;
	ScheduledFuture<?> beepHandler;

	public BeepHandler(ScheduledExecutorService scheduler, ScheduledFuture<?> beepHandler) {
		super();
		this.scheduler = scheduler;
		this.beepHandler = beepHandler;
	}

	@Override
	public void run() {

		beepHandler.cancel(true);
		scheduler.shutdown();

	}

}
