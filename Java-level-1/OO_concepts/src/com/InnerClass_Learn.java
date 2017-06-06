package com;

/*
 * 
 *  Inner Classes
 *  ---------------
 *  
 *  why we inner-classes ?
 *  
 *  
 *  -> for tight-encapsulation classes
 *  -> to access private members of class into other
 *  
 *  
 *  ----------------------------------------------------
 *  
 *  
 *  types
 *  
 *   a. non-static class
 *   b. static class
 *   c. local class
 *   d. anonymous class
 *   
 *  
 * 
 */

class Outer {
	private static int out_sta = 1;
	private int out_ins = 2;

	public static void staMethod() {

	}

	public void insMethod() {
		new Inner().insMethod1();
	}

	public static class Inner {
		private static int ins_sta = 1;
		private int out_ins = 2;

		public static void insMethod2() {

		}

		public void insMethod1() {
			System.out.println(out_ins);
			System.out.println(out_sta);
			// insMethod();
		}
	}
}

public class InnerClass_Learn {

	public static void main(String[] args) {

		Outer.Inner oi = new Outer.Inner();
		oi.insMethod1();

		// --------------------------------------

		// int i = 100;
		//
		// class LocalInner {
		// void ins() {
		// System.out.println(i);
		// }
		// }
		// new LocalInner().ins();

		// ------------------------------------------
	}

}
