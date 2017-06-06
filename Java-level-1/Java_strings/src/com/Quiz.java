package com;

public class Quiz {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("A");
		sb1.append("B");
		StringBuffer sb2 = sb1;
		sb2.append("C");
		sb2 = sb1;
		StringBuffer sb3 = sb2;
		sb3.append("D");
		sb1 = sb3;
		sb3 = sb1;

		System.out.println(sb1 == sb2);
		System.out.println(sb2 == sb3);
		System.out.println(sb3 == sb1);

		System.out.println(sb1.equals(sb2));
		System.out.println(sb2.equals(sb3));
		System.out.println(sb3.equals(sb1));
	}

}
