package com;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing_Unboxing_Ex {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(new Integer(12));
		list.add(12);

		Integer i = 12;

		int j = i.intValue();
		int k = i;

	}

}
