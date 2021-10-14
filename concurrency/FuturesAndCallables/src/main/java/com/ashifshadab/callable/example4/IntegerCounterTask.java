package com.ashifshadab.callable.example4;

import java.util.concurrent.Callable;

public class IntegerCounterTask implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		
		int result=0;
		
		for(int i=0; i<100; i++) {
			result= result+1;
		}
		Thread.sleep(3000);
		
		return result;
	}

}
