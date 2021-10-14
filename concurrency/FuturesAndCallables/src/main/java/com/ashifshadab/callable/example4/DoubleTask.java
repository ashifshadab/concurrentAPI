package com.ashifshadab.callable.example4;

import java.util.concurrent.Callable;

public class DoubleTask implements Callable<Double> {

	@Override
	public Double call() throws Exception {
		double result =0d;
		
		for(double i=0d; i<200d;i++) {
			result=result+i;
		}
		Thread.sleep(5000);
		return result;
	}

}
