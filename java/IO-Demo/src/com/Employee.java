package com;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 10;
	private int empId;
	private String empName;
	private double salary;
	private transient String info;

	private Department dept;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public void f1() {
	}

	public void f2() {
	}

	public void f4() {
	}

	public void f9() {
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Enmp Id: " + empId);
		System.out.println("Emp name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("Info: " + info);
		System.out.println("Dept Id: " + dept.getDeptid());
		System.out.println("Dept name: " + dept.getDeptName());

		System.out.println("--------------------------------------");

	}
}
