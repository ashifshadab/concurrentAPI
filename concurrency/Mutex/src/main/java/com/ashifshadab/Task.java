package com.ashifshadab;

public class Task implements Runnable {

	String name;

	SequenceGenerator sequenceGenerator;

	public Task(String name, SequenceGenerator sequenceGenerator) {
		super();
		this.name = name;
		this.sequenceGenerator = sequenceGenerator;
	}

	public void run() {

		try {

			System.out.println(name + " is going to call getNextSequence()");

			int sequence = sequenceGenerator.getNextSequence();

			System.out.println(name + " got value after calling getNextSequence() " + sequence);

		} catch (Exception iexc) {

			System.out.println(iexc);
		}

	}

}
