package com.ashifshadab.lockSupportExample;

public class Worker extends Thread {

	String name;

	MyLockUsingLockSupport myLockUsingLockSupport;

	public Worker(String name, MyLockUsingLockSupport myLockUsingLockSupport) {
		super();
		this.name = name;
		this.myLockUsingLockSupport = myLockUsingLockSupport;
	}

	public void run() {
		
		myLockUsingLockSupport.lock();
		
		System.out.println(name + " Acquire Lock ");
		
		try {
			
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(name + " Printing ::"+i);
		}
		
		System.out.println(name + " releasing Lock");
		myLockUsingLockSupport.unlock();
	}
}
