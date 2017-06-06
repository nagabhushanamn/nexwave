package com;

final class FinalClass {

}

class X {
	final void m() {

	}
}

class Y extends X {

}

class A {

	final static int C_STA = 100;
	final static int R_STA;
	final int R_INS;

	static {
		R_STA = 200;
	}

	public A(int v) {
		this.R_INS = v;
	}

}

public class Final_Keyword {

	public static void main(String[] args) {

		// final int C_LOC = 12;
		//
		// final int R_LOC;
		// R_LOC = 13 + 12;

	}

}
