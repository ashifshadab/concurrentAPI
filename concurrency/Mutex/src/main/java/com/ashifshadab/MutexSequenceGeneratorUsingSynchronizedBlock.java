package com.ashifshadab;

public class MutexSequenceGeneratorUsingSynchronizedBlock extends SequenceGenerator {

	private Object mutex = new Object();

	@Override
	public int getNextSequence() {
		synchronized (mutex) {
			return super.getNextSequence();
		}
	}

}
