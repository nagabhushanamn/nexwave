package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.model.Product;

public class List_Products_Ex {

	public static void main(String[] args) {

		Product product1 = new Product(34345456, "Laptop", 87000.00);
		Product product2 = new Product(17355470, "Apple", 77000.00);
		Product product6 = new Product(17355470, "Apple", 77000.00);
		Product product3 = new Product(34345458, "Orange", 37000.00);
		Product product4 = new Product(84345453, "Banana", 67000.00);
		Product product5 = new Product(24345459, "Grape", 87000.00);

		// ---------------------------------------------------------

		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product6);

		// -----------------------------------------------------------

		// display(products);

		// -----------------------------------------------------------

		Collections.sort(products);
		display(products);

		// ------------------------------------------------------------

		// Collections.sort(products, new Comparator<Product>() {
		// @Override
		// public int compare(Product o1, Product o2) {
		// return o1.getName().compareTo(o2.getName());
		// }
		// });
		
		Collections.sort(products, (o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		});
		
		display(products);

		// -------------------------------------------------------------

	}

	private static void display(List<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
		System.out.println();
	}

}
