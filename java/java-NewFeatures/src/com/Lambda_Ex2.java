package com;

@FunctionalInterface
interface Adder {
	double add(double n1, double n2);

}

interface Joiner {
	String join(String s1, String s2);
}

class Util {

	// public double testAdd(Adder adder) {
	// double a = 12;
	// double b = 13;
	// return adder.add(a, b);
	// }
	//
	// public String testJoin(Joiner joiner) {
	// String s1 = "Biryani";
	// String s2 = "Meals";
	// return joiner.join(s1, s2);
	// }

	public double test(Adder adder) {
		double a = 12;
		double b = 13;
		return adder.add(a, b);
	}

	public String test(Joiner joiner) {
		String s1 = "Biryani";
		String s2 = "Meals";
		return joiner.join(s1, s2);
	}
}

public class Lambda_Ex2 {

	public static void main(String[] args) {
		
		Adder adder=(n1,n2)->{return 100;};

		Util util = new Util();

		double d = util.test((double n1, double n2) -> n1 + n2 + 1000);
		System.out.println(d);

		String s = util.test((Joiner) (n1, n2) -> n1 + n2 + 1000);
		System.out.println(s);

	}

}
