package com;

import java.util.ArrayList;

public class Demo {

	/*
	 * Wraper classes ---------------- PT WT ----------------- int Integer short
	 * Short long Long double Double float Float char Character boolean Boolean
	 * byte Byte
	 * 
	 * 
	 * 
	 *
	 */

	/*
	 * int x=10; Integer i=new Integer(x); Integer i2=(Integer)x; //int
	 * y=(int)i;
	 */

	public static void main(String[] args) {

		int x;
		Integer i1 = new Integer(200);
		
		x=i1;
		
		float f=i1.floatValue();
		double d=i1.doubleValue();
		
		Float fff=new Float(45);
		int iii=fff.intValue();
		
		int y=100; // Integer y=new Integer(100);
		
		ArrayList ar=new ArrayList();
		ar.add(new Integer(1000));
		
	

	}

}
