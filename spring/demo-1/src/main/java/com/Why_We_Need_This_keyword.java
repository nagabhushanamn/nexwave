package com;

class Person {
	String name = "Nag";

	public void sayName() {
		//String name="Local"; // context
		System.out.println("im " + name);
		System.out.println("im "+this.name);
	}
}

public class Why_We_Need_This_keyword {
	public static void main(String[] args) {
		new Person().sayName();
	}
}
