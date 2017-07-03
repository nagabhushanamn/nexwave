package com;

public final class BankOperations implements ClerkInter, CustomerInter, BankEmployeeInter, MamangerInter {

	@Override
	public void withDraw() {
		System.out.println("Cust: Wihhdraw");

	}

	@Override
	public void deposit() {
		System.out.println("-- Cust: Deposit");

	}

	@Override
	public void openAccount() {
		System.out.println("Bank : Open Account");

	}

	@Override
	public void lockerAccess() {
		System.out.println("-- Locker access Given");

	}

	public void clearkOperations() {
		System.out.println("-- All CLeark Operations");
	}

}
