package com.javapractice.learningtime;

public class InputFromConsole {
	public static void main(String[] args) {

		System.out.println("Enter First Int value " + args[0]);
		System.out.println("Enter Second Int value " + args[1]);

		int result = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println("Result is " + result);
	}

}
