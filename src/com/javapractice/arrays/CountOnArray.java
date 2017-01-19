package com.javapractice.arrays;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class CountOnArray {

	public static int repetitionOfNumber() {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter size of array");
		int n = scn.nextInt();
		int[] inputNumbers = new int[n];

		System.out.println("Enter the numbers");

		for (int arrayIterator = 0; arrayIterator < n; arrayIterator++) {
			inputNumbers[arrayIterator] = scn.nextInt();
		}

		if (inputNumbers == null || inputNumbers.length == 0) {
			System.out.println("");

		}

		int count = 1, element = inputNumbers[0];

		for (int i = 0; i < inputNumbers.length; i++) {

			if (inputNumbers[i] == element) {
				count++;
			} else {
				count--;
			}

			if (count == 0) {
				element = inputNumbers[i];
				count = 1;
			}

		}

		scn.close();

		return element;

	}

	public static void main(String[] args) {
		int number = repetitionOfNumber();
		System.out.println(number + " is");
	}

}
