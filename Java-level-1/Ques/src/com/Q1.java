package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("records.txt"));
		while (scanner.hasNextLine()) {
			String record = scanner.nextLine();
			System.out.println(record);

	  	}

		scanner.close();

	}

}
