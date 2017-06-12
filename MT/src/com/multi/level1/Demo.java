package com.multi.level1;

public class Demo {
	public static void main(String[] args) {
		try {
			method();
			System.out.println("After method call");
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	 static void method() {
		String s = "5.68";
		int i = Integer.parseInt(s);
		int k = 12;
	}
}
