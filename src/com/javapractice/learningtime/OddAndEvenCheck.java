package com.javapractice.learningtime;

import java.util.Scanner;

public class OddAndEvenCheck {

	public void isOddOrEven(int n) {
		int inputNumber = n;

		if (inputNumber % 2 == 0) {
			System.out.println(inputNumber + "is even");
		} else {
			System.out.println(inputNumber + "is odd");
		}
	}

	public void findEvenAndOdd() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the limit");
		int arrayLimit = scn.nextInt();
		int[] inputNumbers = new int[arrayLimit];
		int[] evenNumbers = new int[inputNumbers.length];
		int[] oddNumbers = new int[inputNumbers.length];

		for (int i = 0; i < arrayLimit; i++) {
			System.out.println("Enter Numbers");
			inputNumbers[i] = scn.nextInt();

		}

		for (int i = 0; i < inputNumbers.length; i++) {
			if (inputNumbers[i] % 2 == 0) {
				evenNumbers[i] = inputNumbers[i];
			} else {
				oddNumbers[i] = inputNumbers[i];
			}

		}

		System.out.println("List of even number");
		for (int i = 0; i < inputNumbers.length; i++) {

			System.out.println(evenNumbers[i]);
		}
		System.out.println("List of Odd number");
		for (int i = 0; i < oddNumbers.length; i++) {

			System.out.println(oddNumbers[i]);
		}
		scn.close();
	}

	/*
	 * public Object[] generateYourArray() { Scanner scn = new
	 * Scanner(System.in); System.out.println("Enter array size"); int arraySize
	 * = scn.nextInt(); Object[] objt = new Object[arraySize]; scn.close();
	 * return objt;
	 * 
	 * }
	 */

	public static void main(String[] args) {
		new OddAndEvenCheck().findEvenAndOdd();

		// Scanner scn = new Scanner(System.in);
		// System.out.println("Enter a number ");
		// int inputNumber = scn.nextInt();
		// new OddAndEvenCheck().isOddOrEven(inputNumber);
		// scn.close();
		// new OddAndEvenCheck().findEvenAndOdd((int[])generateYourArray());

	}

}
