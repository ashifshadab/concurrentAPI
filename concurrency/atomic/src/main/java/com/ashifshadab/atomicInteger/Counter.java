package com.ashifshadab.atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	private AtomicInteger atomicIntegerValue = new AtomicInteger(0);

	private int nomalIntegerValue = 0;

	public void incrementAtomicIntegerValue() {
		atomicIntegerValue.getAndIncrement();
	}

	public int getAtomicIntegerValuee() {
		return atomicIntegerValue.get();
	}

	public void incrementNomalIntegerValue() {
		nomalIntegerValue++;
	}

	public int getNomalIntegerValue() {
		return nomalIntegerValue;
	}
}
