package com.ashifshadab.lockSupportExample;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

public class MyLockUsingLockSupport {

	private final AtomicBoolean locked = new AtomicBoolean(false);
	private final Queue<Thread> queue = new ConcurrentLinkedQueue<>();

	static {
		// Reduce the risk of "lost unpark" due to classloading
		Class<?> ensureLoaded = LockSupport.class;
	}

	public void unlock() {
		locked.set(false);
		LockSupport.unpark(queue.peek());
	}

	public void lock() {
		boolean wasInterrupted = false;
		// publish current thread for unparkers
		queue.add(Thread.currentThread());

		// Block while not first in queue or cannot acquire lock
		while (queue.peek() != Thread.currentThread() || !locked.compareAndSet(false, true)) {
			LockSupport.park(this);
			// ignore interrupts while waiting
			if (Thread.interrupted())
				wasInterrupted = true;
		}

		queue.remove();
		// ensure correct interrupt status on return
		if (wasInterrupted)
			Thread.currentThread().interrupt();
	}

}
