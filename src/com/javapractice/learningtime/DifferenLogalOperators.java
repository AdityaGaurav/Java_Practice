package com.javapractice.learningtime;

import java.util.Scanner;

public class DifferenLogalOperators {

	public void getConditionalOperator() {
		int num;
		System.out.println("Enter the number");
		Scanner scn = new Scanner(System.in);
		num = scn.nextInt();
		String result = (num % 2 == 0) ? "Number is even" : "Number is odd";
		System.out.println(result);
		scn.close();

	}

	public static void main(String[] args) {
		new DifferenLogalOperators().getConditionalOperator();

	}

}
