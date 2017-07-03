package com;

public class SalariedEmployee extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 10;
	private int daysWorked;

	public int getDaysWorked() {
		return daysWorked;
	}

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}

}
