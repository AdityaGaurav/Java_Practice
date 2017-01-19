package com.javapractice.datastructure;

public class BubbleSort {

	public static int[] doBubbleSort(int[] inputs) {
		int tmp;
		

		if (inputs.length == 0) {
			return inputs;
		}

		for (int i = 0; i < inputs.length; i++) {

			for (int j = 1; j < (inputs.length - i); j++) {

				if (inputs[j - 1] > inputs[j]) {

					tmp = inputs[j - 1];
					inputs[j - 1] = inputs[j];
					inputs[j] = tmp;
				}

			}
		}

		return inputs;
	}

	public static void main(String[] args) {
		int[] inputs = new int[] { 12, 6, 22, 11, 4, 2 };
		int[] sortedArray = doBubbleSort(inputs);
		for (int ele : sortedArray) {
			System.out.printf("%d ",ele);
		}
	}

}
