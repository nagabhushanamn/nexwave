package com.multi.level2;

class Person {

	private static Object key = new Object();

	String name;

	void m1() {

		synchronized (Person.class) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " start m1() using " + this.name);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + " end m1()");
		}
	}

	void m2() {

		synchronized (Person.class) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " start m2() using " + this.name);

			System.out.println(name + " end m2()");
		}
	}

}

public class Sync_Block_Ex {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "P1";
		Person p2 = new Person();
		p2.name = "P2";

		Thread thread1 = new Thread(() -> {
			p1.m1();
		}, "T1");
		Thread thread2 = new Thread(() -> {
			p2.m1();
		}, "T2");

		thread1.start();
		thread2.start();

	}
}
