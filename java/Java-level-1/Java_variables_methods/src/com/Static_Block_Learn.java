package com;

class Xyz {

	static int staVar = 0;
	int ins = 0;

	static {
		/*
		 * why we need ?
		 * 
		 * =>to initialize static var with computation based on config-files
		 * =>to load any libraries once , if this class loaded
		 * 
		 */
		System.out.println("XYX : static-block");
	}

	static {
		System.out.println("XYX : static-block-2");
	}

	public static void sta() {
		System.out.println("Xyz:sta()");
	}

	public void ins() {
		System.out.println("Xyz:ins()");
	}

}

public class Static_Block_Learn {
	
	static{
		System.out.println("hello...");
	}

	public static void main(String[] args) {

		Xyz.sta();
		Xyz.sta();

	}

}
