package com.ashifshadab.scheduledExecutorServiceInterface.example1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TestScheduledExecutorService {
	
	public static void main(String args []) {
	
	ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    ScheduledFuture<?> beepHandler = 
       scheduler.scheduleAtFixedRate(new BeepTask(), 2, 2, TimeUnit.SECONDS);
    
   
    scheduler.schedule(new BeepHandler(scheduler, beepHandler), 10, TimeUnit.SECONDS);
    

	}

}
