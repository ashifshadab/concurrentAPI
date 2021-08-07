package com.ashifshadab.producerConsumer.example1;

import java.util.concurrent.Semaphore;

public class Queue {

	int number;

	// Start with consumer semaphore unavailable
	static Semaphore seamphoreConsumer = new Semaphore(0);

	static Semaphore seamphoreProducer = new Semaphore(1);

	void get() {

		try {

			seamphoreConsumer.acquire();

			System.out.println("GOT: " + number);

			seamphoreProducer.release();

		} catch (InterruptedException iexc) {

			System.out.println(iexc);
		}
	}

	void put(int value) {

		try {

			seamphoreProducer.acquire();

			this.number = value;

			System.out.println("PUT: " + value);

			seamphoreConsumer.release();

		} catch (InterruptedException iexc) {

			System.out.println(iexc);
		}

	}

}
