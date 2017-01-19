package com.javapractice.stringoperations;

/*
 * How to reverse String in Java with or without StringBuffer Example
 */
public class StringG1 {

	public static String reverseStringWithoutUsingAPI(String input) {

		String str = input;
		char[] ch = str.toCharArray();
		char[] tempCH = new char[input.length()];

		int length = input.length();
		System.out.println(length);
		try {
			for (int i = 0; i < ch.length; i++) {

				tempCH[i] = ch[length];

				length--;
			}

			str = String.valueOf(tempCH);

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return str;
	}

	public static String secondApproachToReverse(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		String reverse = "";

		for (int i = input.length() - 1; i > 0; i--) {
			reverse = reverse + input.charAt(i);
		}

		return reverse;

	}

	public static String reverseInPlace(String input) {
		
		String reverse = "";
		char[] ch = input.toCharArray();
		int j = 0;

		for (int i = 0; i < input.length() - 1; i++) {
			while (ch[i] == ' ') {
				j++;
			}
			int k = j;
			char[] tmpCH = new char[k];
			
			while (i < k) {
				tmpCH[i] = ch[k];
				i++;
				k--;
			}
			reverse+=String.valueOf(tmpCH);
			i=j+1;
			j++;
          
		}
		return reverse;
	}

	public static String inPlaceReverse(final String input) {
		final StringBuilder builder = new StringBuilder(input);
		int length = builder.length();
		for (int i = 0; i < length / 2; i++) {
			final char current = builder.charAt(i);
			final int otherEnd = length - i - 1;
			builder.setCharAt(i, builder.charAt(otherEnd));
			// swap
			builder.setCharAt(otherEnd, current);
		}
		return builder.toString();
	}

	public static void main(String[] args) {

		System.out.println(reverseInPlace("Aditya gaurav"));
	}
}
