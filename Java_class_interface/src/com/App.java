package com;

import com.car.CarImpl;
import com.wheel.CEATWheel;
import com.wheel.MRFWheel;

public class App {

	public static void main(String[] args) {

		// init

		CarImpl car1 = new CarImpl();
		car1.setWheel(new CEATWheel());

		car1.move();

		CarImpl car2 = new CarImpl();
		car2.setWheel(new MRFWheel());

		car2.move();

		car2.setWheel(new CEATWheel());
		car2.move();

	}

}
