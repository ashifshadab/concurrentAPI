package com.ashifshadab.basicExample2;

import java.util.concurrent.Exchanger;

public class Exchange implements Runnable{

	String name;
	
	Exchanger<String> exchanger;
	
	String textString;

	
	

	public Exchange(String name, Exchanger<String> exchanger, String textString) {
		super();
		this.name = name;
		this.exchanger = exchanger;
		this.textString = textString;
	}




	@Override
	public void run() {

		String previousString= this.textString;
		
		try {
			
			String exchangedString=exchanger.exchange(previousString);
			
			System.out.println(name+
                    " exchanged " + previousString + " with " + exchangedString
            );
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
