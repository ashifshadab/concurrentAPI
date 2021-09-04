package com.ashifshadab.atomicReference;

import java.util.concurrent.atomic.AtomicReference;

public class TestThread {

	private static String message = "hello";
	private static AtomicReference<String> atomicReference;

	public static void main(final String[] arguments) throws InterruptedException {
		atomicReference = new AtomicReference<String>(message);

		new Thread("Thread 1") {

			public void run() {
				atomicReference.compareAndSet(message, "BIG BOSS");
				message = message.concat("-BIG BOSS!");
			};
		}.start();

		System.out.println("Message is: " + message);
		System.out.println("Atomic Reference of Message is: " + atomicReference.get());
	}

}
