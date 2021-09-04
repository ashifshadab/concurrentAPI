package com.ashifshadab.atomicLong;

import java.util.concurrent.atomic.AtomicLong;

public class Counter {

	private AtomicLong atomicLong = new AtomicLong(0);

	

	public void increment() {
		atomicLong.getAndIncrement();
	}

	public long value() {
		return atomicLong.get();
	}

	
}
