package com.javapractice.learningtime;

import java.util.Scanner;

public class DrawPattern {

	public void drawPatternAsPerInput(int inputRow) {
		int rowIterator, columnIterator, count = 1;
		for (rowIterator = 0; rowIterator < inputRow; rowIterator++) {
			
			for (columnIterator =1; columnIterator <= rowIterator; columnIterator++) {
				System.out.print("  ");
			}

			for (columnIterator = 0; columnIterator < 3; columnIterator++) {
				System.out.print(count);
				count++;
			}

			

			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The Row Size");
		int inputRow = scn.nextInt();
		new DrawPattern().drawPatternAsPerInput(inputRow);
		scn.close();
	}

}
