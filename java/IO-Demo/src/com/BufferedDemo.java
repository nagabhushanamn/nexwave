package com;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;

public class BufferedDemo {

	public static void main(String[] args) {

		try {

			InputStreamReader isr = new InputStreamReader(System.in);

			BufferedReader br = new BufferedReader(isr);
			
			
			System.out.println("Ennter a No: ");
			int x=Integer.parseInt(br.readLine());
			System.out.println("Enter a String: ");
			String s1=br.readLine();
			System.out.println("Enter a Char: ");
			char ch=(char)br.read();
			System.out.println("No is "+x);
			System.out.println("String is "+s1);
			System.out.println("Char: "+ch);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
