package com.ashifshadab.typesOfSemaphore.binarySemaphore;

public class BinarySemaphore {

	private boolean locked = false;

	private int initial;

	public BinarySemaphore(int initial) {
		super();
		this.initial = initial;
		locked = (initial == 0);
	}

	public synchronized void waitForNotify() throws InterruptedException {
		while (locked) {
			wait();
		}
		locked = true;
	}

	public synchronized void notifyToWakeup() {
		if (locked) {
			notify();
		}
		locked = false;
	}

}
