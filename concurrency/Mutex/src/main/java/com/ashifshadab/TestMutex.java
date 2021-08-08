package com.ashifshadab;

public class TestMutex {

	public static void main(String[] args) {

		set1();
		set2();
		set3();
		set4();

	}

	private static void set1() {
		System.out.println(":::::::::::::::::::MutexSequenceGeneratorUsingSynchronizedBlock:::::::::::::::::::::");
		MutexSequenceGeneratorUsingSynchronizedBlock object = 
				new MutexSequenceGeneratorUsingSynchronizedBlock();

		new Thread(new Task("Raj", object)).start();

		new Thread(new Task("Mohan", object)).start();

		new Thread(new Task("Shoan", object)).start();

		new Thread(new Task("Mohit", object)).start();
	}
	
	private static void set2() {

		System.out.println("::::::::::::::::::::MutexSequenceGeneratorUsingSynchronizedMethod:::::::::::::::::::::");
		MutexSequenceGeneratorUsingSynchronizedMethod object = 
				new MutexSequenceGeneratorUsingSynchronizedMethod();

		new Thread(new Task("Raj", object)).start();

		new Thread(new Task("Mohan", object)).start();

		new Thread(new Task("Shoan", object)).start();

		new Thread(new Task("Mohit", object)).start();
	}
	
	private static void set3() {
		
		System.out.println(":::::::::::::::::::MutexSequenceGeneratorUsingReentrantLock:::::::::::::::::::::");

		MutexSequenceGeneratorUsingReentrantLock object = 
				new MutexSequenceGeneratorUsingReentrantLock();

		new Thread(new Task("Raj", object)).start();

		new Thread(new Task("Mohan", object)).start();

		new Thread(new Task("Shoan", object)).start();

		new Thread(new Task("Mohit", object)).start();
	}
	
	private static void set4() {

		System.out.println(":::::::::::::::::::MutexSequenceGeneratorUsingSemaphore:::::::::::::::::::::");
		MutexSequenceGeneratorUsingSemaphore object = 
				new MutexSequenceGeneratorUsingSemaphore();

		new Thread(new Task("Raj", object)).start();

		new Thread(new Task("Mohan", object)).start();

		new Thread(new Task("Shoan", object)).start();

		new Thread(new Task("Mohit", object)).start();
	}

}
