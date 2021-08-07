package com.ashifshadab.producerConsumer.example1;

public class ProducerConsumerTest {

	public static void main(String[] args) {

		Queue queue = new Queue();

		new Thread(new Consumer(queue), "Consumer").start();

		new Thread(new Producer(queue), "Producer").start();

	}

}
