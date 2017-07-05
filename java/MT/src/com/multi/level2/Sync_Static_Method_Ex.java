package com.multi.level2;

class A {

	public synchronized static void m1() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " m1-start...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " m1-end....");
	}

	public synchronized static void m2() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " m2-start...");
		System.out.println(name + " m2-end....");
	}

}

public class Sync_Static_Method_Ex {

	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {
			A.m1();
		}, "Nag");

		Thread thread2 = new Thread(() -> {
			A.m1();
		}, "Praveen");
		Thread thread3 = new Thread(() -> {
			A.m2();
		}, "Ria");

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
