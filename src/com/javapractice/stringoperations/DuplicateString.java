package com.javapractice.stringoperations;

public class DuplicateString {
	public static void duplicateCharacterInString(String input) {

		if (input.length() == 0 || input == null) {

		}

		char[] chars = input.toCharArray();
		int count = 0, length = 0;
		char c;

		c = chars[length];

		for (int i = 0; i < chars.length - 1; i++) {

			if (c == chars[i]) {
				count++;

			}

		}

		if (count < 0) {
			System.out.println(chars[i] + count);
		}
	}

	}

	public static void main(String[] args) {
		duplicateCharacterInString("aditya");

	}

}
