package com;

class Abc {

	static int sta = 1;
	int ins = 2;

	static void staMethod() {
		System.out.println(sta);
		// System.out.println(ins);
	}

	void insMethod() {
		System.out.println(sta);
		System.out.println(ins);
	}

}

public class Var_Use_In_Methods {

	public static void main(String[] args) {

		Abc.staMethod();

		new Abc().insMethod();

	}

}
