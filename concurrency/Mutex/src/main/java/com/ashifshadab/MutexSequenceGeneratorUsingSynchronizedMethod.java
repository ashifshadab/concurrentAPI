package com.ashifshadab;

public class MutexSequenceGeneratorUsingSynchronizedMethod extends SequenceGenerator {

	@Override
	public synchronized int getNextSequence() {
		return super.getNextSequence();
	}

}
