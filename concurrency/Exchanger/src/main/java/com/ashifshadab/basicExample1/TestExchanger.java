package com.ashifshadab.basicExample1;

import java.util.concurrent.Exchanger;

public class TestExchanger {

	public static void main(String[] args) {

		Exchanger<String> exchanger = new Exchanger<String>();
		
		new Thread(new UseString("Rohit", exchanger)).start();
		
		
		new Thread(new MakeString("Mohit", exchanger)).start();

	}

}
