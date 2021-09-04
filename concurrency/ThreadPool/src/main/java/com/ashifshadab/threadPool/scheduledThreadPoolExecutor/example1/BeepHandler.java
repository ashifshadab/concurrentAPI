package com.ashifshadab.threadPool.scheduledThreadPoolExecutor.example1;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class BeepHandler implements Runnable {
	
	ScheduledThreadPoolExecutor scheduler;
	
	ScheduledFuture<?> beepHandler;
	
	
	public BeepHandler(ScheduledThreadPoolExecutor scheduler, ScheduledFuture<?> beepHandler) {
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
