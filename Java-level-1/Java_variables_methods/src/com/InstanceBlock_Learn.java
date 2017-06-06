package com;

class Product {

	private int id;
	private String name;
	private double price;
	private String description;

	{
		System.out.println("common-work");
	}

	public Product(int id, String name) {
		super();
		// System.out.println("common-work");
		this.id = id;
		this.name = name;
	}

	public Product(int id, String name, double price) {
		super();
		// System.out.println("common-work");
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product(int id, String name, double price, String description) {
		super();
		// System.out.println("common-work");
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}

}

public class InstanceBlock_Learn {

	public static void main(String[] args) {

		new Product(2342, "Laptop");
		new Product(2342, "Laptop", 10000.00);

	}

}
