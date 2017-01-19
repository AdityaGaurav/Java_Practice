package com.javapractice.geeksforgeeks;

import java.util.Arrays;

/*
 * Chocolate Distribution Problem
 * 
 * Given an array of n integers where each value represents number of chocolates in a 
 * packet. Each packet can have variable number of chocolates. There are m students, 
 * the task is to distribute chocolate packets such that :
   Each student gets one packet.
   The difference between the number of chocolates in packet with maximum chocolates and 
   packet with minimum chocolates given to the students is minimum.
 *  
 * 
 */

public class Puzzle1 {
	public int calculateMinimumDifference(int[] a, int student, int chocolateGroups) {
		// Largest number of chocolates
		int minDifference = Integer.MAX_VALUE;
		// if there are no chocolates or number
		// of students is 0
		if (student == 0 || chocolateGroups == 0) {
			return -1;
		}

		// Number of students cannot be more than
		// number of packets
		if (chocolateGroups < student) {
			return -1;
		}
		// Sort the given packets
		Arrays.sort(a);
		// Find the subarray of size m such that
		// difference between last (maximum in case
		// of sorted) and first (minimum in case of
		// sorted) elements of subarray is minimum.
		int first = 0, last = 0;

		for (int i = 0; i + student - 1 < chocolateGroups; i++) {

			int diff = a[i + student - 1] - a[i];

			if (diff < minDifference) {

				minDifference = diff;
				first = i;
				last = i + student - 1;

			}
		}

		return (a[last] - a[first]);
	}

	public static void main(String[] args) {

		int[] array = { 12, 4, 7, 19, 11, 15, 22, 42, 13 };
		;
		int student = 3;
		int chocolateGroups = array.length;// total element in an array ex. here
											// it is 9 so 9 group of chocolate
		System.out.println(
				"minimum difference is " + new Puzzle1().calculateMinimumDifference(array, student, chocolateGroups));

	}

}
