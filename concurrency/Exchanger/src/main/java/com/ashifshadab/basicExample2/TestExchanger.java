package com.ashifshadab.basicExample2;

import java.util.concurrent.Exchanger;

public class TestExchanger {

	public static void main(String[] args) {

		Exchanger<String> exchanger = new Exchanger<String>();
		
		new Thread(new Exchange("Rohit", exchanger, "Lily")).start();
		
		new Thread(new Exchange("Mohit", exchanger, "Rose")).start();

	}

}
