package com.javapractice.datastructure;

public class LinearSearch {

	public static int doLinearSearch(int[] inputs, int ele) {
		if (inputs.length == 0) {
			return -1;

		}

		for (int iterate : inputs) {
			if (iterate == ele) {
				System.out.println(iterate);
				return iterate;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] inputs = new int[] { 1, 2,4, 6, 9 };
		System.out.println(doLinearSearch(inputs, 6));
	}

}
