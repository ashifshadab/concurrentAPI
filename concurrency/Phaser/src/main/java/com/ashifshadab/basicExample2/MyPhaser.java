package com.ashifshadab.basicExample2;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {

	int numPhases;

	public MyPhaser(int parties, int phaseCount) {
		super(parties);
		numPhases = phaseCount - 1;

	}

	// Override onAdvance() to execute the specified number of phases.

	protected boolean onAdvance(int parties, int registerdParties) {
		
		System.out.println("Phase "+parties+" Completed. \n");

		if (parties == numPhases || registerdParties == 0)
			return true;

		return false;
	}

}
