package com.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Owner {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		// final int prime = 31;
		// int result = 1;
		// result = prime * result + ((name == null) ? 0 : name.hashCode());
		// return result;
		return 12345;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class Car {
	private String model;
	private String year;

	public Car(String model, String year) {
		super();
		this.model = model;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + "]";
	}
	//
	// @Override
	// public int hashCode() {
	// final int prime = 31;
	// int result = 1;
	// result = prime * result + ((model == null) ? 0 : model.hashCode());
	// return result;
	// }
	//
	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// Car other = (Car) obj;
	// if (model == null) {
	// if (other.model != null)
	// return false;
	// } else if (!model.equals(other.model))
	// return false;
	// return true;
	// }

}

public class Ex1 {

	public static void main(String[] args) {

		// Car car1 = new Car("i20", "2016");
		// Car car2 = new Car("i20", "2016");

		// System.out.println(car1.hashCode());
		// System.out.println(car2.hashCode());
		//
		// System.out.println(car1.equals(car2));
		//
		// System.out.println(car1 == car2);
		//
		// Set<Car> cars = new HashSet<>();
		// cars.add(car1);
		// cars.add(car2);
		//
		// System.out.println(cars.size());

		// ------------------------------------------

		Car car1 = new Car("BMW", "2016");
		Car car2 = new Car("i20", "2016");

		Owner owner1 = new Owner();
		owner1.name = "Nag";
		Owner owner2 = new Owner();
		owner2.name = "Nag";

		// -----------------------------------------

		Map<Owner, Car> map = new HashMap<Owner, Car>();
		map.put(owner1, car1);
		map.put(owner2, car2);

		// ---------------------------------------------

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Owner name");

		String name = scanner.nextLine();

		Owner key = new Owner();
		key.name = name;

		Car car = map.get(key);

		if (car != null) {
			System.out.println(car);
		} else {
			System.out.println("dream ..");
		}

	}

}
