package com.multi.level1;

class PrintNum implements Runnable {

	// READY_TO_RUN ==> RUNNING
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 500; i++) {
			System.out.println(name + "==>" + i);

			/*
			 * RUNNING ==> READY_TO_RUN
			 * 
			 * or
			 * 
			 * RUNNING ==> NOT_READY_TO_RUN
			 * 
			 */

		}
		// ==> DEAD
	}
}

public class Thread_Scheduler_Demo {

	public static void main(String[] args) {

		PrintNum printNum = new PrintNum();

		Thread thread1 = new Thread(printNum, "Nag"); // New
		Thread thread2 = new Thread(printNum, "Praveen");
		Thread thread3 = new Thread(printNum, "Nexwave");

		thread1.start(); // New ===> READY_TO_RUN
		thread2.start();
		thread3.start();

		String name = Thread.currentThread().getName();
		for (int i = 0; i < 500; i++) {
			System.out.println(name + "==>" + i);
		}

	}

}
