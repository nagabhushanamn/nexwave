package com;

public class Test {
/*
	@Override
	public String toString() {
		return "Now My Own toString got Called";
	}
*/
	static {
		System.out.println("---- static blick of Test");
	}

	public Test() {

		System.out.println("--- Test Class Object Created");

	}

	public void test() {
		System.out.println("--- test method of Test class");
	}

}
