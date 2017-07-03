package com;

public class Test {

	public static void main(String[] args) {

		// System.out.println("--- test");
		CustomerInter cust = new BankOperations();
		cust.deposit();
		cust.withDraw();

		BankEmployeeInter bankEmp = new BankOperations();
		bankEmp.openAccount();

		MamangerInter mg = new BankOperations();
		mg.lockerAccess();

		ClerkInter c = new BankOperations();

		c.clearkOperations();

	}
}
