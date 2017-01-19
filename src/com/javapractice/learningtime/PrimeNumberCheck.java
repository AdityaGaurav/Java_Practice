package com.javapractice.learningtime;

import java.util.Scanner;

public class PrimeNumberCheck {

	/*
	 * A prime number is a whole number greater than 1, whose only two
	 * whole-number factors are 1 and itself.
	 */
	public void isPrimeNumber(int number) {
		int numberToCheck = number, count = 1;
		while (count < numberToCheck) {
			if (numberToCheck / count == 0) {
				System.out.println(numberToCheck + " is not a Prime Number");
				count++;
				
			}else
				System.out.println(numberToCheck+" is a prime number");
		

		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number");
		int inputNumber = scn.nextInt();
		new PrimeNumberCheck().isPrimeNumber(inputNumber);
		scn.close();

	}
}
