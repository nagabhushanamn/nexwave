package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Colln_Methods {

	public static void main(String[] args) {

		// List<String> list = new ArrayList<>();

		// list.add(e)
		// list.add(index, element);
		// list.addAll(c)
		// list.addAll(index, c);

		// list.get(index)

		// list.set(index, element)

		// list.remove(index)
		// list.remove(o);

		// list.size();

		// list.contains(o)
		// list.containsAll(c)

		// list.clear();

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");

		// way-1
		//
		// Iterator<String> iterator = list.iterator();
		// while (iterator.hasNext()) {
		// String string = iterator.next();
		// System.out.println(string);
		// }

		// way-2

		// ListIterator<String> iterator = list.listIterator();
		// while (iterator.hasNext()) {
		// String string = (String) iterator.next();
		// System.out.println(string);
		// }
		// while (iterator.hasPrevious()) {
		// System.out.println(iterator.previous());
		// }

		// way-3

		// --------------------------------------------------
		//
		// List<String> list1 = new ArrayList<>();
		// list1.add("A");
		// list1.add("B");
		// list1.add("C");
		//
		// List<String> list2 = new ArrayList<>();
		// list2.add("A");
		// list2.add("C");
		//
		// // list1.removeAll(list2);
		// list1.retainAll(list2);
		//
		// System.out.println(list1);

		// ---------------------------------------------------------

		List<String> list1 = new ArrayList<>();
		// list.isEmpty()
		// list1.subList(fromIndex, toIndex)
	}

}
