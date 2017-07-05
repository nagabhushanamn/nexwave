package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerDemo {
	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("d:/FO/ser.txt");

			SalariedEmployee emp = new SalariedEmployee();

			emp.setEmpId(1024);
			emp.setEmpName("Rushira");
			emp.setSalary(133435);
			emp.setInfo("Password List: praveen,abc");
			emp.setDaysWorked(4);

			Department d = new Department();
			d.setDeptid(11);
			d.setDeptName("HR");

			emp.setDept(d);

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(emp);

			System.out.println("--- Done ---");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}
}
