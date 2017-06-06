package com;

public class Var_Args_Learn {

	public static void main(String[] args) {
		display(12, 13, 14, 14, 12, 14, 15);
	}

	private static void display(int... nums) {
		for (int n : nums) {
			System.out.println(n);
		}
	}

}
