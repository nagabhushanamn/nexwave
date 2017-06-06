package com;

class A {
	public A(int a) {
		super();
		System.out.println("im A");
	}
}

class B extends A {
	public B(int arg) {
		super(arg);
		System.out.println("Im B");
	}
}

class C extends B {
	public C(int arg) {
		super(arg);
		System.out.println("im C");
	}
}

public class Constructor_Exe_Flow {
	public static void main(String[] args) {
		C c = new C(12);
	}
}
