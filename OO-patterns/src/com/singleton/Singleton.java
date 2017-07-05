package com.singleton;

public class Singleton {
	// private static Boss boss = new Boss();
	private static Singleton boss = null;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (boss == null) {
			boss = new Singleton();
		}
		return boss;
	}
}
