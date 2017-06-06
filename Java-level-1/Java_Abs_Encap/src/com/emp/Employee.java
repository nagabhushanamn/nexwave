package com.emp;

// Java Bean

public class Employee {

	private int id;
	private String name;
	private double salary;
	private double bonus;

	public Employee(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 1000 && salary < 10000) {
			this.salary = salary;
			this.bonus = this.salary * 0.2;
		}
	}

	public double getBonus() {
		return bonus;
	}

}
