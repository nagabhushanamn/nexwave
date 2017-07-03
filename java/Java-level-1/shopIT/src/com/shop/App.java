package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// Init
		BillingImpl billComp = new BillingImpl();

		// Use

		String[] cart = { "234345", "45543" };
		double totalPrice = billComp.getTotalPrice(cart);

		System.out.println("Total : " + totalPrice);
		System.out.println("Happy shopping");

	}

}
