package com.ashifshadab.basicExample1;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable {

	String name;

	Exchanger<String> exchanger;

	String textString;

	public UseString(String name, Exchanger<String> exchanger) {
		super();
		this.name = name;
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		
		for(int i=0; i<3; i++) {
			
			try {
				
				textString=exchanger.exchange(new String());
				
				System.out.println(name+" Got data:"+textString);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
