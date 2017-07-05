package com.multi.level1;

import java.util.Scanner;

//class Work implements Runnable {
//
//	@Override
//	public void run() {
//		System.out.println("work by " + Thread.currentThread().getName());
//	}
//}
//
//class Worker extends Thread {
//
//	public Worker(String string) {
//		super(string);
//	}
//
//	public void run() {
//		System.out.println("work by " + Thread.currentThread().getName());
//	}
//
//}

class Task1 {
	public void doTask1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name ?");
		String name = sc.nextLine();
		System.out.println("Hello " + name);
		sc.close();
	}
}

class Task2 {
	public void doTask2() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}

public class Multi_Thread_Appln {

	public static void main(String[] args) {

		// System.out.println(Thread.currentThread().getName() + "-start");
		//
		// Work work = new Work();
		// Thread thread = new Thread(work, "T1");
		//
		// thread.start(); // new-stack
		//
		// System.out.println(Thread.currentThread().getName() + "- other
		// work");

		// -------------------------------------------------------------

		// System.out.println(Thread.currentThread().getName() + "-start");
		// Worker worker = new Worker("T1");
		// worker.start();
		//
		// System.out.println(Thread.currentThread().getName() + "- other
		// work");

		// -------------------------------------------------------------

		System.out.println(Thread.currentThread().getName() + "-start");

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " start");
				Task1 task1 = new Task1();
				task1.doTask1();

			}
		}, "T1");

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " start");
				Task2 task2 = new Task2();
				task2.doTask2();

			}
		}, "T2");

		thread1.start();
		thread2.start();

		System.out.println("can cont with other work..");

	}

}
