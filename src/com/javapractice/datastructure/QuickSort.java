package com.javapractice.datastructure;

public class QuickSort {

	int[] numbers;

	public int[] doSort(int[] inputNumbers) {

		if (inputNumbers == null || inputNumbers.length == 0) {
			return inputNumbers;
		}
		this.numbers = inputNumbers;
		int low = 0;
		int high = numbers.length - 1;
		doQuickSort(low, high);
		return numbers;

	}

	public void doQuickSort(int low, int high) {
		int pivotEle = numbers[low + (high - low) / 2];
		int lowTemp = low;
		int highTemp = high;
		while (lowTemp <= highTemp) {
			while (numbers[lowTemp] < pivotEle) {
				lowTemp++;
			}

			while (numbers[highTemp] > pivotEle) {
				highTemp--;
			}

			if (lowTemp <= highTemp) {
				exchangeNumbers(lowTemp, highTemp);
				lowTemp++;
				highTemp--;
			}
		}
		if (lowTemp < high) {
			doQuickSort(lowTemp, high);
		}
		if (low < highTemp) {
			doQuickSort(low, highTemp);
		}

	}

	public void exchangeNumbers(int i, int j) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
	}

	public static void main(String[] args) {
		QuickSort qc = new QuickSort();
		int[] inputArray = new int[] { 26, 44, 1, 12, 99, 3, 18, 55 };
		int[] sortedArray = qc.doSort(inputArray);
		for (int ele : sortedArray) {
			System.out.printf("%d ", ele);
		}
	}
}
