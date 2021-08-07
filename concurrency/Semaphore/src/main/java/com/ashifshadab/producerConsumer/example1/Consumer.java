package com.ashifshadab.producerConsumer.example1;

public class Consumer implements Runnable {

	Queue queue;

	public Consumer(Queue queue) {
		super();
		this.queue = queue;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			queue.get();
		}

	}

}
