package com.javapractice.arrays;

import java.util.Scanner;

public class StroeNumberInArray {
	Scanner scan = new Scanner(System.in);

	public void storeNuberInArray() {
		System.out.println("Enter toatl count of numbers:");
		int totalno = Integer.parseInt(scan.nextLine());
		int[] list = new int[totalno];

		for (int element = 0; element < list.length; element++) {

			System.out.println("Element at list[" + element + "]:");
			list[element] = Integer.parseInt(scan.next());
		}

		scan.close();
	}

	public static void main(String[] args) {
		StroeNumberInArray store = new StroeNumberInArray();
		store.storeNuberInArray();
	}

}
