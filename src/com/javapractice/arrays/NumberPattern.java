package com.javapractice.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberPattern {

	Scanner scn = new Scanner(System.in);

	/*
	 * This method will able to draw below mentioned star pattern * ** ***
	 */

	public void drawPattern() {
		int totalRows = 4;
		for (int rowitrator = 0; rowitrator <= totalRows; rowitrator++) {
			for (int columniterator = 0; columniterator < rowitrator; columniterator++) {
				System.out.print(columniterator);
			}
			System.out.println();
		}

	}

	/*
	 * This method will result below mentioned pattern 1 23 456 78910
	 */
	public void drawNumberPattern() {
		System.out.println("Enter Number of Rows");
		int totalRows = scn.nextInt();
		int number = 1;
		for (int rowitrator = 0; rowitrator <= totalRows; rowitrator++) {

			for (int columniterator = 0; columniterator < rowitrator; columniterator++) {
				System.out.print(number + "");
				number++;
			}
			System.out.println();
		}

	}

	/*
	 * 1 12 123
	 */
	public void drawNumberPatternTwo() {
		System.out.println("Enter Number of Rows");
		int totalRows = scn.nextInt();

		for (int rowitrator = 0; rowitrator <= totalRows; rowitrator++) {
			int number = 1;

			for (int columniterator = 0; columniterator < rowitrator; columniterator++) {
				System.out.print(number + "");
				number++;
			}
			System.out.println("");
		}

	}

	/*
	 * 1111 1122 1333 4444
	 */
	public void drawNumberPatternThree() {
		System.out.println("Enter Number of Rows");
		int totalRows = scn.nextInt();

		for (int rowitrator = 1; rowitrator <= totalRows; rowitrator++) {
			for (int columniterator = 1; columniterator <= totalRows - rowitrator; columniterator++) {
				System.out.print(1 + "");
			}
			for (int columniterator = 1; columniterator <= rowitrator; columniterator++) {
				System.out.print(rowitrator + "");
			}
			System.out.println("");
		}

	}

	/*
	 * 1 *23 **456
	 * 
	 */
	public void drawNumberPatternFour() {
		System.out.println("Enter Number of Rows");
		int totalRows = scn.nextInt();
		int number = 1;
		for (int rowitrator = 0; rowitrator <= totalRows; rowitrator++) {

			for (int columniterator = 2; columniterator <= rowitrator; columniterator++) {
				System.out.print("*");
			}

			for (int columniterator = 0; columniterator < rowitrator; columniterator++) {
				System.out.print(number);
				number++;
			}

			System.out.println();
		}

	}

	public void drawNumberPatternFive() {
		try {
			System.out.println("Enter Number of Rows");
			int totalRows = scn.nextInt();

			int number = 1;
			for (int rowitrator = 0; rowitrator <= totalRows; rowitrator++) {
				for (int columniterator = 0; columniterator < rowitrator; columniterator++) {
					System.out.print("**");
				}

				for (int columniterator = 0; columniterator < 3; columniterator++) {
					System.out.print(number);
					number++;
				}

				System.out.println();
			}
		} catch (InputMismatchException e) {
			System.out.println("Incorrect Input ");
			
		}

	}

	public static void main(String[] args) {
		new NumberPattern().drawNumberPatternFive();
	}
}
