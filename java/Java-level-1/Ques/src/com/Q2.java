package com;

public class Q2 {

	public static void main(String[] args) {

		String ssn = "453-23-2342";

		// String pattern = "\\d{3}-\\d{2}-\\d{4}";
		//
		// if (ssn.matches(pattern)) {
		// System.out.println("valid");
		// } else {
		// System.out.println("Invalid ssn");
		// }

		// -----------------------------------
		//
		// System.out.println(Character.isDigit('1'));
		// System.out.println("0987654321".indexOf('4'));

		// -----------------------------------------------

		boolean isValid = true;

		int len = ssn.length();

		if (len == 11) {

			for (int i = 0; i < len; i++) {

				if (i == 3 || i == 6) {
					if (ssn.charAt(i) != '-') {
						isValid = false;
						break;
					}
				} else {
					if ("1234567890".indexOf(ssn.charAt(i)) == -1) {
						isValid = false;
						break;
					}
				}
			}
			
			System.out.println(isValid);

		}

	}

}
