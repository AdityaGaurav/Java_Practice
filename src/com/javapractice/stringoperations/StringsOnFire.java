package com.javapractice.stringoperations;

//import static org.junit.Assert.*;

//import org.junit.Test;

public class StringsOnFire {

	public void stringCreation() {
		String first = "Hello! Aditya";
		String second = new String("Hello! Aditya");
		System.out.println(first);
		System.out.println(second);
		String str = new String("Aditya Gaurav").intern();
		String str1 = "Aditya Gaurav";
		if (str == str1) {
			System.out.println("Both are same: intern()");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void stringChange() {
		String str = "Aditya GAurav";
		String opr = str.substring(7,10);
		System.out.println(opr);
		System.out.println(opr.equals(str.substring(7,10)));
	}

	public static void main(String[] args) {
		String s = null;
		System.out.println(s);
		new StringsOnFire().stringChange();
	}
}
