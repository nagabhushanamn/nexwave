package com.concurrent;

import java.util.ArrayList;
import java.util.Vector;

public class Vector_vs_ArrayList {

	public static void main(String[] args) {

		testVector(new Vector<>());
		testArrayList(new ArrayList<>());

	}

	private static void testVector(Vector<String> vector) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			vector.addElement("item");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	private static void testArrayList(ArrayList<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add("item");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
