package com.ashifshadab.basicExample1;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
	
	public static void main(String args[]) {
		
		Semaphore semaphore=new Semaphore(1);
		
		new Thread(new Increamentor("Increaser",semaphore)).start();
		
		new Thread(new Decreamentor("Decreaser",semaphore)).start();
	}

}
