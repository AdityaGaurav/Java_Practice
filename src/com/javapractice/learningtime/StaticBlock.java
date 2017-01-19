package com.javapractice.learningtime;

public class StaticBlock {

	static {
		i = 100;
		System.out.println("Inside Static Block");
		printMyBody();
	}
	static int i;

	public static void printMyBody() {
		System.out.println(i + " is the value of i. Define in static block");

	}

	public StaticBlock() {
		System.out.println("Constructor of Class");
	}

	public static void main(String args[]) {
		new StaticBlock();

	}

}
