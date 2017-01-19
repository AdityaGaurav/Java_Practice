package com.javapractice.mathematicalopration;

import java.util.Scanner;

//import java.math.BigInteger;

public class MathsOperations {

	public void powerOfElement() {
		int element = 2;
		double res = Math.pow(element, 2);
		System.out.println(res);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Eneter the value of q: ");
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("Eneter the value of a: ");
			int a = in.nextInt();
			System.out.println("Eneter the value of b: ");
			int b = in.nextInt();
			System.out.println("Eneter the value of n: ");
			int n = in.nextInt();
			

			for (int k = 0; k < n; k++) {

				a += (int) (Math.pow(2, k) * b);
				System.out.printf("%d ", a);

			}
			System.out.println("");
		}
		in.close();
	}
}
