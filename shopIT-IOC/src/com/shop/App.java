package com.shop;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpln_v1;
import com.shop.pm.PriceMatrixImpln_v2;

public class App {

	public static void main(String[] args) {

		// Init - 'Some-One'
		PriceMatrix priceMatrixV1 = new PriceMatrixImpln_v1();
		PriceMatrix priceMatrixV2 = new PriceMatrixImpln_v2();

		Billing billComp = new BillingImpl(priceMatrixV2);

		// Use

		String[] cart = { "234345", "45543" };
		double totalPrice = billComp.getTotalPrice(cart);

		System.out.println("Total : " + totalPrice);
		System.out.println("Happy shopping");

	}

}
