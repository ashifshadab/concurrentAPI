package com.ashifshadab.basicExample1;

import java.util.concurrent.Exchanger;

public class MakeString implements Runnable {

	String name;

	Exchanger<String> exchanger;

	String textString;

	public MakeString(String name, Exchanger<String> exchanger) {
		super();
		this.name = name;
		this.exchanger = exchanger;
		this.textString = new String();
	}

	@Override
	public void run() {

		char charString='A';
		
		for(int i=0; i<3;i++) {
			
			for(int j=0;j<5; j++) {
				textString += charString++;
			}
			
			try {
				
				System.out.println(name+" Pass the data:"+textString);
				
				textString=exchanger.exchange(textString);
				
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
