package com.javapractice.geeksforgeeks;

import java.util.Scanner;

public class PuzzleArray1 {

	/*
	 * Max value 
	 * In a given array A[] find the maximum value of (A[i] – i) -
	 * (A[j] – j) where i is not equal to j.
	 * 
	 * i and j vary from 0 to n-1 and N is size of input array A[]. Value of N
	 * is always greater than 1.
	 */

	public static int findMaxDifference(int[] numbers) {

		int tmp = Integer.MIN_VALUE;

		int arrayLength = numbers.length - 1;
		for (int j = 0; j < arrayLength; j++) {

			int result = (numbers[j] - j) - (numbers[j + 1] - (j + 1));
			if (tmp < result) {
				tmp = result;
			}

		}
		return tmp;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		scn.nextInt();
		int n = scn.nextInt();
		int[] numbers = new int[n];

		for (int j = 0; j < n; j++) {
			numbers[j] = scn.nextInt();
		}

		System.out.println(findMaxDifference(numbers));
		scn.close();
	}
}
