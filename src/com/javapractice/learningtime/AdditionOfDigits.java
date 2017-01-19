package com.javapractice.learningtime;

import java.util.Scanner;

public class AdditionOfDigits {

	public void addDigitsOfNumber(int number) {

		int tmpNumber = number, remainder, sum = 0;

		while (tmpNumber != 0) {
			remainder = tmpNumber % 10;
			sum = sum + remainder;
			tmpNumber = tmpNumber / 10;
		}

		System.out.println("Sum of Number is " + sum);

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = scn.nextInt();
		new AdditionOfDigits().addDigitsOfNumber(number);
		scn.close();
	}

}
