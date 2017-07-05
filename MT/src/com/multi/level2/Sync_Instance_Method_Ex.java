package com.multi.level2;

class Employee {

	String name;

	public synchronized void doWork1() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started...work1 with " + this.name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " work1-end....");

	}

	public synchronized void doWork2() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started...work2 with " + this.name);
		System.out.println(name + " work2-end....");
	}

}

public class Sync_Instance_Method_Ex {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.name = "E1";

		Employee employee2 = new Employee();
		employee2.name = "E2";

		Thread thread1 = new Thread(() -> {
			employee1.doWork1();
		}, "T1");

		Thread thread2 = new Thread(() -> {
			employee1.doWork2();
		}, "T2");

		Thread thread3 = new Thread(() -> {
			employee2.doWork1();
		}, "T3");

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
