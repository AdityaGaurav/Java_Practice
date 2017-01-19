package com.javapractice.arrays;

public class ArrayOnFire {
	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4 };
		int[] myArray = inputArray;
		System.out.println(myArray[2]);
		myArray[3] = 89;
		System.out.println(myArray[3]);
	}
}
