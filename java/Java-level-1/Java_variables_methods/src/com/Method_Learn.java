package com;

class Pqr {

	static void sta1() {

	}

	static void sta2() {
		sta1();
		new Pqr().ins1();
	}

	void ins1() {
		ins2();
		sta1();
	}

	void ins2() {

	}

}

public class Method_Learn {

	public static void main(String[] args) {

	}

}
