package com.javapractice.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRegularExpression {

	public static void regularExpressionChecks() {
		String regexPattern = "[arc]";
		String inputString = "src";
		boolean found = false;
		Pattern ptrn = Pattern.compile(regexPattern);
		Matcher mtch = ptrn.matcher(inputString);
		found = mtch.find();
		if (found == true) {
			System.out.println("String Matched");
		} else {
			System.out.println("Not matched");
		}

	}

	public static void main(String[] args) {
		regularExpressionChecks();
	}
}
