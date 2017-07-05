package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp_Learn {

	public static void main(String[] args) {

		// String colorPattern = "^\\s*#?([A-F0-9]{6}|[A-F0-9]{3})\\s*$";
		// String colorCode = " DEF ";

		// System.out.println(colorCode.matches(colorPattern));

		// -----------------------------------------------------------------

		String comment = "this is hell training";

		Pattern pattern = Pattern.compile(".. ");
		Matcher matcher = pattern.matcher(comment);

		if (matcher.matches()) {
			System.out.println("there is hell world");
		}

		String newComment = matcher.replaceAll("*");
		System.out.println(newComment);

	}

}
