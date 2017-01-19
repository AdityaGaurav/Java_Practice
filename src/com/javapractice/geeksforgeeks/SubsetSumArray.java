package com.javapractice.geeksforgeeks;

public class SubsetSumArray {

	public void findSubsrtSumArray(int[] inputArray, int[] subSetArray) {

		if (inputArray.length < subSetArray.length) {
			System.out.println("Illegal subSetArray");

		}

		int subSetSum = 0;
		for (int i = 0; i < inputArray.length + 1; i++) {
			if (i == 0) {
				subSetSum += inputArray[i] + inputArray[i + 1];
				
				for (int j = 0; j < inputArray.length; j++) {
					if (subSetSum == subSetArray[j]) {

					}
				}
			}
		}

	}

	public static void main(String[] args) {

//		int[] inputArray = { 2, 5, 8 };
//		int[] subSetArray = { 7, 10, 9 };

	}

}
