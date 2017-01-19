package com.javapractice.learningtime;

public class DataTypesAndLiterals {
	static byte firstNumber;
	static short secondNumber;
	static int thirdNumber;
	static long fourthNumber;
	static float fifthNumber;
	static double sixthNumber;
	static char inputChar;

	public static void defaultValueOfDataTypes() {
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		System.out.println(fourthNumber);
		System.out.println(fifthNumber);
		System.out.println(sixthNumber);
		System.out.println(inputChar);

	}

	public static void ValueOfDataTypes() {

		byte firstNumber = 1;
		short secondNumber = 22;
		int thirdNumber = 333;
		long fourthNumber = 4444L;
		float fifthNumber = 0.12f;
		double sixthNumber = 0.056;
		char ch=67;
		 int a=ch;
		 int b=9;
		 int c=a+b;
		 System.out.println(c);
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		System.out.println(fourthNumber);
		System.out.println(fifthNumber);
		System.out.println(sixthNumber);

	}

	public static void automaticTypeCastingOfDataTypes() {
		// variable declaration and initialization
		byte firstNumber = 1;
		short secondNumber = 22;
		int thirdNumber = 333;
		long fourthNumber = 4444L;
		float fifthNumber = 11.12f;
		double sixthNumber = 123.056;
		System.out.println("Before Casting");
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		System.out.println(fourthNumber);
		System.out.println(fifthNumber);
		System.out.println(sixthNumber);
		System.out.println("==================");
		// type casting
		secondNumber = firstNumber;
		thirdNumber = secondNumber;
		fourthNumber = thirdNumber;
		fifthNumber = fourthNumber;
		sixthNumber = fifthNumber;
		System.out.println("After Casting");
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		System.out.println(fourthNumber);
		System.out.println(fifthNumber);
		System.out.println(sixthNumber);

	}

	public static void typeCastingOfDataTypes() {
		byte firstNumber = 1;
		short secondNumber = 22;
		int thirdNumber = 333;
		long fourthNumber = 4444L;
		float fifthNumber = 11.12f;
		double sixthNumber = 68.056;

		char chr=(char)sixthNumber;
		System.out.println(chr);
		firstNumber = (byte) secondNumber;
		secondNumber = (short) firstNumber;
		firstNumber = (byte) thirdNumber;
		fourthNumber = (int) fifthNumber;
		secondNumber = (short) fourthNumber;
		firstNumber = (byte) sixthNumber;

		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		System.out.println(fourthNumber);
		System.out.println(fifthNumber);
		System.out.println(sixthNumber);

	}

	public static void main(String[] args) {

		typeCastingOfDataTypes();
	}

}
