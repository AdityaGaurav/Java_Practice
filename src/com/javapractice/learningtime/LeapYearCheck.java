package com.javapractice.learningtime;

import java.util.Scanner;

public class LeapYearCheck {
	/*
	 * A leap year is a year that has one extra day in it
	 * To determine whether a year is a leap year, follow these steps: 1.If the
	 * year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
	 * 2.If the year is evenly divisible by 100, go to step 3. Otherwise, go to
	 * step 4.
	 * 
	 * 3.If the year is evenly divisible by 400, go to step 4. Otherwise, go to
	 * step 5. 4.The year is a leap year (it has 366 days). The 5.year is not a
	 * leap year (it has 365 days).
	 */

	public void isLeapYear(int year) {
		if (year % 4 == 0) {
			System.out.println(year + " is  a leap year");
		} else if (year % 100 == 0) {
			System.out.println(year + " is  a leap year");

		} else if (year % 400 == 0) {
			System.out.println(year + " is  a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an Year");
		int year = scn.nextInt();
		new LeapYearCheck().isLeapYear(year);
		scn.close();
	}

}
