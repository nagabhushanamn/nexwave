package com.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.model.Product;

public class Set_Colln_Demo {

	public static void main(String[] args) {

		// Set<String> set=new TreeSet<>();
		// Set<String> set = new HashSet<>();
		// Set<String> set = new LinkedHashSet<>();
		// set.add("Z");
		// set.add("B");
		// set.add("P");
		// set.add("E");
		// set.add("D");
		// set.add("N");
		// set.add("A");
		// set.add("B");
		// set.add("C");
		//
		// System.out.println(set);

		// ----------------------------------------------------

		Product product1 = new Product(34345456, "Laptop", 87000.00);
		Product product2 = new Product(17355470, "Apple", 77000.00);
		Product product6 = new Product(17355470, "Apple", 76000.00);
		Product product3 = new Product(34345458, "Orange", 37000.00);
		Product product4 = new Product(84345453, "Banana", 67000.00);
		Product product5 = new Product(24345459, "Grape", 87000.00);

		// ---------------------------------------------------------

		Set<Product> products = new TreeSet<>((o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		});
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product6);

		display(products);

	}

	private static void display(Set<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
		System.out.println();
	}

}
