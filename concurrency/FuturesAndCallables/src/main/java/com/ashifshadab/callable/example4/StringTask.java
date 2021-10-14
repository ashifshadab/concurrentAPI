package com.ashifshadab.callable.example4;

import java.util.concurrent.Callable;

public class StringTask implements Callable<String> {

	@Override
	public String call() throws Exception {
		return "Have a nice Day";
	}

}
