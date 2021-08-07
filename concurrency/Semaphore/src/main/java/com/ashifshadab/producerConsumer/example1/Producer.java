package com.ashifshadab.producerConsumer.example1;

public class Producer implements Runnable {

	Queue queue;

	public Producer(Queue queue) {
		super();
		this.queue = queue;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			queue.put(i);
		}

	}

}
