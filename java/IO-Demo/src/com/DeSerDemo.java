package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerDemo {
	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("d:/FO/ser.txt");

			ObjectInputStream ois = new ObjectInputStream(fis);

			SalariedEmployee e1 = (SalariedEmployee) ois.readObject();
			e1.display();
			System.out.println("--- Days Worked: "+e1.getDaysWorked());

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}
}
