package com.car;

import com.wheel.Wheel;

/*
 *  OO principal :
 *  
 *  closed for modification , open for extension
 * 
 * 
 */

public class CarImpl {

	private Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();
		System.out.println("Car moving....");
	}

}
