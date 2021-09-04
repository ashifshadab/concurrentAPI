package com.ashifshadab.condition.examle1;

public class Producer extends Thread {

	private final SharedFiFoQueue queue;

	public Producer(SharedFiFoQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		String[] numbers = { "1", "12","2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12","13","2", "3", "4" };

		try {
			for (String number : numbers)
				queue.add(number);

			// Terminate the execution.
			queue.add(null);

		} catch (InterruptedException ex) {
			System.err.println("An InterruptedException was caught: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
