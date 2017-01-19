package com.javapractice.arrays;

import java.util.Scanner;

public class TwoDimensionalArray {
	Scanner scn = new Scanner(System.in);
	/*
	 * An array is a container object that holds a fixed number of values of a
	 * single type.
	 */

	public void differentArrayDiclaration() {
		// dataType[] arrayRefVar = new dataType[arraySize];
		/*
		 * Each item in an array is called an element, and each element is
		 * accessed by its numerical index.
		 */
		int[] arry = new int[2];
		arry = new int[] { 1, 2, 2 };

		int[] array = { 1, 2, 3 };
		int array1[] = { 1, 2, 3 };
		int[] array2;
		array2 = new int[] { 1 };

		int arrayaddition = array[0] + array[1];
		System.out.println(arrayaddition + array1[0]);
		System.out.println("Element at array2[]" + array2[0]);
		System.out.println("Element at arry[]" + arry[0]);
		/*
		 * byte[] anArrayOfBytes; short[] anArrayOfShorts; long[]
		 * anArrayOfLongs; float[] anArrayOfFloats; double[] anArrayOfDoubles;
		 * boolean[] anArrayOfBooleans; char[] anArrayOfChars; String[]
		 * anArrayOfStrings;
		 */

	}

	public void arrayInLoop() {
		int[] array = new int[] { 1, 2, 3, 4 };
		for (int i = 0; i < array.length; i++) {
			System.out.println("Elements are" + array[i]);
		}

	}

	public void howToUseArray() {

	}

	public void mulitDimensionalArrayDiclaration() {
		int[][] twod = new int[4][];
		twod[0] = new int[10];
		twod[1] = new int[10];
		twod[2] = new int[10];
		twod[3] = new int[10];
		int rowLength = twod[0].length;
		System.out.println(rowLength);
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
		System.out.println(arr);

		boolean[][] booleans = new boolean[2][2];
		System.out.println("booleans[0][0] : " + booleans[0][0]);
		byte[][] bytes = new byte[2][2];
		System.out.println("bytes[0][0] : " + bytes[0][0]);
		char[][] chars = new char[1][1];
		System.out.println("chars[0][0] : " + (int) chars[0][0]);
		short[][] shorts = new short[2][2];
		System.out.println("short[0][0] : " + shorts[0][0]);
		int[][] ints = new int[3][2];
		System.out.println("ints[0][0] : " + ints[0][0]);
		long[][] longs = new long[2][2];
		System.out.println("longs[0][0] : " + longs[0][0]);
		float[][] floats = new float[1][2];
		System.out.println("floats[0][0] : " + floats[0][0]);
		double[][] doubles = new double[2][2];
		System.out.println("doubles[0][0] : " + doubles[0][0]);
		Object[][] objects = new Object[2][2];
		System.out.println("objects[0][0] : " + objects[0][0]);

	}

	public void twoDArrayRepresentaion() {
		int twoD[][] = new int[4][5];
		int i, j, k = 0;
		for (i = 0; i < twoD.length; i++)
			for (j = 0; j < twoD[0].length; j++) {
				twoD[i][j] = k;
				k++;
			}
		// Simple for loop
		for (i = 0; i < twoD.length; i++) {
			for (j = 0; j < twoD[0].length; j++) {
				System.out.print(twoD[i][j] + " ");
				System.out.println();
			}
		}

		// advanced for loop
		/*
		 * Since your array 'twoD' is an array of array. So, when you iterate
		 * over it, you will first get an array, and then you can iterate over
		 * that array to get individual elements.
		 * 
		 * So, your outer loop has int[] as type, and hence that declaration. If
		 * you iterate through your u in one more inner loop, you will get the
		 * type int: -
		 * 
		 */
		
		System.out.println("advanced for loop==================");
		for(int[] u: twoD){
			for(int ele : u){
				System.out.printf("%1d ",ele);
			}
			System.out.println("");
		}
	}

	public void inputArray() {
		int totalNumber = 0;
		int[] numberPool = new int[totalNumber];

		System.out.println("Enter the limit");
		totalNumber = scn.nextInt();
		System.out.println("Enter numbers");
		for (int numberCount = 0; numberCount < numberPool.length; numberCount++) {
			numberPool[numberCount] = scn.nextInt();

		}

	}

	public static void main(String args[]) {
		int[][] twod = new int[4][6];
		twod[0] = new int[12];
		twod[1] = new int[20];
		int rowLength = twod[0].length;
		int rowLength1 = twod[1].length;
		int rowLength2 = twod[2].length;
		System.out.println(rowLength);
		System.out.println(rowLength1);
		System.out.println(rowLength2);
		twod[1][19] = 19;
		System.out.println("twod[1][19]=19; " + twod[1][19]);
		 TwoDimensionalArray ary= new TwoDimensionalArray();
		 ary.twoDArrayRepresentaion();
	}
}
