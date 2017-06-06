package com;

class V {

}

class C extends V {

}

class B extends V {

}

public class ReferenceCasting {

	public static void main(String[] args) {

		// C c = new C();
		// B b = new B();
		//
		// V v = new C();
		// v = new B();

		V v = new C();

		if (v instanceof C) {
			C c = (C) v;
			System.out.println("Happy casting");
		} else {
			System.out.println("Not Possible");
		}

	}

}
