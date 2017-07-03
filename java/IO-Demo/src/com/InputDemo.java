package com;

import java.util.Scanner;

public class InputDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int x;
		String s1;
		System.out.println("Enter a No: ");
		x=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a String: ");
		s1=sc.nextLine();
		
		System.out.println("No is "+x);
		System.out.println("String is "+s1);
		
		
		
	}

}
