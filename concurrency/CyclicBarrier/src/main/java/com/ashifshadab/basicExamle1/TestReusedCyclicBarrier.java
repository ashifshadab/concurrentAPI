package com.ashifshadab.basicExamle1;

import java.util.concurrent.CyclicBarrier;

public class TestReusedCyclicBarrier {

	public static void main(String[] args) {

		PredeterminedExecutionPoint predeterminedExecutionPoint = new PredeterminedExecutionPoint("COMMON");

		CyclicBarrier cyclicBarrier = new CyclicBarrier(3, predeterminedExecutionPoint);

		System.out.println(":::::::::::Starting Application:::::::");

		new Thread(new Task("Rohit", cyclicBarrier)).start();

		new Thread(new Task("Shyam", cyclicBarrier)).start();

		new Thread(new Task("Mohan", cyclicBarrier)).start();

		new Thread(new Task("Ghanshyam", cyclicBarrier)).start();

		new Thread(new Task("Mala", cyclicBarrier)).start();

		new Thread(new Task("Pintu", cyclicBarrier)).start();

	}

}
