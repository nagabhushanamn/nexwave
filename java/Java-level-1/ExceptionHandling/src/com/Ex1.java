package com;

class Emp {
	void work() {
	}
}

public class Ex1 {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			System.out.println("B");
			int ari = 1 / 1;
			int[] arr = { 10, 20, 30 };
			System.out.println(arr[1]);
			Emp emp = null;
			emp.work();
			System.out.println("C");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			/*
			 *  -> report to end-user, with friendly message
			 *  -> log exception in log.file
			 *  -> re-throw Exception
			 *  -> resource cleaning
			 * 
			 */
			System.out.println("Ari-Ex-" + e.getMessage());
			System.out.println("D");
		} catch (Exception e) {
			System.out.println("Ex-" + e.getMessage());
		}
		System.out.println("E");

	}

}
