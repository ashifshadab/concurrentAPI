package com.ashifshadab.lockSupportExample;

public class Test {

	public static void main(String[] args) {

		MyLockUsingLockSupport myLockUsingLockSupport = new MyLockUsingLockSupport();
		
		Worker worker1 = new Worker("Raj", myLockUsingLockSupport);
		
		Worker worker2 = new Worker("Simran", myLockUsingLockSupport);
		
		Worker worker3 = new Worker("Mohit", myLockUsingLockSupport);
		
		Worker worker4 = new Worker("Veena", myLockUsingLockSupport);
		
		worker1.start();
		
		worker2.start();
		
		worker3.start();
		
		worker4.start();

	}

}
