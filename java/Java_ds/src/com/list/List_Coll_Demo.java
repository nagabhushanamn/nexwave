package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class CompareTest {
	public void listCompare(List<String> list) {

		for (int i = 0; i < 10000; i++) {
			list.add("hello....");
		}

		long start = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			int rn = (int) Math.floor(Math.random() * 1000);
			list.add(rn, "World");
		}

		long end = System.currentTimeMillis();

		System.out.println(end - start);
		System.out.println("done");

	}
}

public class List_Coll_Demo {

	public static void main(String[] args) {

		CompareTest compareTest = new CompareTest();
		compareTest.listCompare(new ArrayList<>());
		compareTest.listCompare(new LinkedList<>());

	}

}
