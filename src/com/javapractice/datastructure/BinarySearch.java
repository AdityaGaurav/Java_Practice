package com.javapractice.datastructure;

public class BinarySearch {
	public static int doBinarySearch(int[] inputs, int eleToSearch) {

		int low = 0;
		int high = inputs.length - 1;

		while (low <= high) {
			
			int mid = (high + low) / 2;

			if (inputs[mid] == eleToSearch) {
				return mid;

			} else if (inputs[mid] > eleToSearch) {
				high = mid - 1;

			} else {
				low = mid + 1;

			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] inputs = new int[] { 1, 3, 7, 44 };

		System.out.println(doBinarySearch(inputs, 44));
	}

}
