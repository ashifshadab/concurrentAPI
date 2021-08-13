package com.ashifshadab.basicExamle1;

public class PredeterminedExecutionPoint implements Runnable {

	String name;

	public PredeterminedExecutionPoint(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println("All Thread are arrived at barrier, now Process further");

		for (int i = 0; i < 5; i++) {
			System.out.println(name + " is Printing " + i);
		}
		System.out.println(name + " finieshed Printing ");
	}

}
