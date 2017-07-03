package com;

public class Person {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is Garbage collected");
	}

	void test() {
		System.out.println("Test");
	}

}
