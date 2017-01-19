package com.javapractice.learningtime;

//import java.util.Scanner;

public class CountMaxNumber {

	public static void giveMaxCount() {

		int[] inputSize = { 1, 2, 3, 1, 1, 1 };
		int[] duplicate = new int[6];

		duplicate[0] = inputSize[0];
		int count = 0;
		for (int iterator = 0; iterator < inputSize.length; iterator++) {

			while (inputSize[iterator] == duplicate[0]) {
				count++;
				System.out.println(count);
			}
			duplicate[0] = inputSize[iterator];
			count = 0;

		}

	}

}
