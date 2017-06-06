package com;

class Employee {

	static int totalHelloCount; // class

	String name;
	// int totalHelloCount; // instance

	public Employee(String name) {
		super();
		this.name = name;
	}

	public void sayHello() {
		// int totalHelloCount = 0; // local
		totalHelloCount++;
		System.out.println("Hello.." + totalHelloCount);
	}
}

public class Variable_Scope_Learn {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Nag");
		Employee employee2 = new Employee("Praveen");

		employee1.sayHello();

		employee2.sayHello();
		employee2.sayHello();
	}

}
