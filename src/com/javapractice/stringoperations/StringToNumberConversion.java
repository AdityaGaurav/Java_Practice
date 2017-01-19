package com.javapractice.stringoperations;

public class StringToNumberConversion {

	public void convertStringToNumber() {
		
		// If the string does not contain a parsable integer, a
		// NumberFormatException will be thrown.

		String number = "10";
		System.out.println(number + 5);

		// by using Integer.parseInt(). parseInt(String) returns a primitive int
		int result = Integer.parseInt(number);
		System.out.println(result + 5);

		// by using Integer.valueOf(). valueOf(String) returns a new Integer()
		// object.
		Integer result2 = Integer.valueOf(number);
		System.out.println(result2 + 5);
	}

	public void convertNumberToString() {
		
//		Simplest form
		int i=1001;
		String s1 = "" + i;
		System.out.println(s1);
		System.out.println(s1.length());
		
		System.out.println("===========================");
		int pNumber = 10;
		int nNumber = -10;
		// by Using Integer.toString(int)
		String str1 = Integer.toString(pNumber);
		String str2 = Integer.toString(nNumber);
		System.out.println(str1 + " Integer.toString(int)");
		System.out.println(str1.length());
		System.out.println(str2 + " Integer.toString(int)");
		System.out.println(str2.length());
		System.out.println("========================");

		// by using String.valueof(int)
		String str3 = String.valueOf(pNumber);
		System.out.println(str3 + " String.valueof(int) ");

		double d = 345.80;
		String str4 = Double.toString(d);
		int dot = str4.indexOf('.');
		System.out.println(dot + " digits before decimal point");
		int length = str4.length();
		System.out.println(length);
		int result = str4.length() - dot - 1;
		System.out.println(result + " digits after decimal");
		
		System.out.println("==============");
		double d1 = 858.48;
		String s = Double.toString(d1);

		int dot1 = s.indexOf('.');

		System.out.println(dot1 + " digits " + "before decimal point.");
		System.out.println((s.length() - dot1 - 1) + " digits after decimal point.");

	}

	public static void main(String[] args) {
		StringToNumberConversion stnc = new StringToNumberConversion();
		stnc.convertNumberToString();

	}

}
