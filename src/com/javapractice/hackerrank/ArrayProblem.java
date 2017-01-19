package com.javapractice.hackerrank;

import java.util.Scanner;

//
//	import java.io.*;
//	import java.util.*;
//	import java.text.*;
//	import java.math.*;
//	import java.util.regex.*;

public class ArrayProblem {

	public void printTwoDMatrix(int[][] a) {
		int[][] b = a;
		System.out.println("Element in mAtrix");
		for (int[] twoD : b) {
			for (int ele : twoD) {
				System.out.print(ele + " ");

			}
			System.out.println("");
		}

	}

	public void findHourGlass(int[][] a) {
		int[][] b = a;
		int sumOfHourGlass, a1 = 0;

		for (int i = 0; i < b.length / 2; i++) {
			for (int j = 0; j < b[0].length / 2; j++) {
				a1 += b[i][j];

			}
		}

		sumOfHourGlass = a1;
		a1 = 0;
		for (int i = (b.length / 2) ; i < b.length; i++) {
			for (int j = (b.length / 2) ; j < b[0].length; j++) {
				a1 += b[i][j];
			}
		}

		if (sumOfHourGlass < a1) {
			sumOfHourGlass = a1;
		}
		
		System.out.println("Sum "+sumOfHourGlass);

	}
	
	public int findHourGlass1(int[][] arr){
		int sum = Integer.MIN_VALUE;
		
		
			
			for(int i = 0; i < arr.length - 2; i++){
				int sum1;
				sum1 = arr[i][0] + arr[i][ 1] + arr[i][2] + arr[i + 1][1] + arr[i + 2][0]
						+ arr[i + 2][1] + arr[i + 2][2];
				if(sum1 > sum ){
					sum = sum1;
				}
				
				for(int j = 1; j < arr.length - 2; j++){
				
				
					sum1 = sum1 -arr[i][j-1]-arr[i+1][j] - arr[i+2][j-1] + arr[i][j+2]+arr[i+1][j+1] +arr[i+2][j+2] ;
					if(sum1 > sum){
						sum = sum1;
					}
				
				}
			}
			
		
		return sum;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];

		System.out.println(arr.length);
		System.out.println(arr[0].length);

		System.out.println("Enter element");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		new ArrayProblem().printTwoDMatrix(arr);
		
		new ArrayProblem().findHourGlass(arr);
		System.out.println(new ArrayProblem().findHourGlass1(arr));
		in.close();
	}
}
