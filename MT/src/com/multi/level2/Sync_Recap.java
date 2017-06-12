package com.multi.level2;

import java.util.concurrent.TimeUnit;

class Xyz {

	private static Object key1 = new Object();
	private static Object key2 = new Object();

	public static void sta1() {
		synchronized (key1) {

			String name = Thread.currentThread().getName();
			System.out.println(name + " => in (sta1)");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " <= out");

		}
	}

	public static void sta2() {
		synchronized (key2) {

			String name = Thread.currentThread().getName();
			System.out.println(name + " => in (sta2)");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " <= out");

		}
	}

	public void ins1() {
		synchronized (key1) {

			String name = Thread.currentThread().getName();
			System.out.println(name + " => in (ins1)");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ins2();
			System.out.println(name + " <= out (ins1)");

		}
	}

	public void ins2() {
		synchronized (key2) {

			String name = Thread.currentThread().getName();
			System.out.println(name + " => in (ins2)");
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " <= out (ins2)");

		}
	}

}

public class Sync_Recap {
	public static void main(String[] args) {

		Xyz xyz1 = new Xyz();
		Xyz xyz2 = new Xyz();

		Thread thread1 = new Thread(() -> {
			// Xyz.sta1();
			xyz1.ins1();
		}, "T1");
		Thread thread2 = new Thread(() -> {
			// Xyz.sta2();
			xyz2.ins2();
		}, "T2");
		thread1.start();
		thread2.start();

	}

}
