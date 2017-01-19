package com.javapractice.learningtime;

public class TypeCastingAndConversion {

	public static void main(String[] args) {

		// Order of Automatic Type conversion is
		// byte->short->int->long->float->double->

		byte t = 10;
		int a = 254;
		float f = 20.0f;
		char c = 'b';

		byte b = (byte) a;
		int d = (int) f;
		short g = (short) t;
		int j = c;
		char k = (char) a;
		// byte c = (short)a; Not Possible. Range of STR(Source Type Range) ex.
		// short is less than DTR(Destination Type Range) ex. byte
		System.out.println(b);
		System.out.println(d);
		System.out.println(j);
		System.out.println(g);
		System.out.println(k);
	}

}
