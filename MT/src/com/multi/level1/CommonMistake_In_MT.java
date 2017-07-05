package com.multi.level1;

class SomeWork implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " working...");
	}
}

public class CommonMistake_In_MT {

	public static void main(String[] args) {

		Thread thread = new Thread(new SomeWork());
		// thread.run(); //
		thread.start();

	}
}
