package com;

import java.io.IOException;

public class GC2 {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("--- test 123");
	}

	public static void main(String[] args) throws IOException {

		Runtime rt = Runtime.getRuntime();

		System.out.println("Total Memort: " + rt.totalMemory());

		/*
		 * Person p1 = new Person(); Person p2 = new Person(); Person p3 = new
		 * Person();
		 */

		for (int i = 1; i <= 100000; i++) {
			Person p = new Person();
		}
		
		System.out.println("Available: "+rt.freeMemory());

		// p1 = null;

		// p2 = null;

		// System.gc();
		// p3 = null;
		//System.gc();

	}

}
