package com.javapractice.learningtime;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

	public int additon(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;

	}

	public int subtraction(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;

	}

	public int division(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;

	}

	public int multiplication(int firstNumber, int secondNumber) {

		return firstNumber * secondNumber;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		try {
			System.out.println("Enter First Number");
			int firstNumber = scn.nextInt();
			System.out.println("Enter Second Number");
			int secondNumber = scn.nextInt();
			int choice;
			

			do {
				System.out.println(
						"Enter A number of ur choice:\n 1.additon \n 2.subtraction\n 3.division\n 4.multiplication  ");
				choice = scn.nextInt();


				switch (choice) {
				
				case 1:
					int additonResult = new SimpleCalculator().additon(firstNumber, secondNumber);
					System.out.println("Result is " + additonResult);
					break;

				case 2:
					int subtractionResult = new SimpleCalculator().subtraction(firstNumber, secondNumber);
					System.out.println("Result is " + subtractionResult);
					break;

				case 3:
					int multiplicationResult = new SimpleCalculator().multiplication(firstNumber, secondNumber);
					System.out.println("Result is " + multiplicationResult);
					break;

				case 4:
					int divisionResult = new SimpleCalculator().division(firstNumber, secondNumber);
					System.out.println("Result is " + divisionResult);
					break;

				case 5:
					System.exit(0);

				default:
					System.out.println("Wrong choice");
					break;

				}
			} while (choice != 5);
		} catch (InputMismatchException e) {
			System.out.println("Incorrect Input");

		}

		scn.close();

	}
}
