package com.nexwave;

import com.nexwave.hr.HR;

public class App {

	public static void main(String[] args) {

		//
		System.out.println(Thread.currentThread().getName() + " start");

		HR.manageEmployees();

	}

}
