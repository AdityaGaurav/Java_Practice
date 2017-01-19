package com.javapractice.arrays;

import java.util.Scanner;

public class OpertionOnMatrix {
	static Scanner scan = new Scanner(System.in);
	int rows;
	int columns;

	public OpertionOnMatrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}

	public int[][] createMatrix(int rows, int columns) {
		// creation of matrix
//		int row = rows;
//		int column = columns;
		System.out.println("Size of Matrix is" + rows + "*" + columns);
		int[][] matrix = new int[rows][columns];
		for (int rowiterator = 0; rowiterator < rows; rowiterator++) {
			for (int columniterator = 0; columniterator < columns; columniterator++) {
				System.out.println("Enter element in matrix at [" + rowiterator + "][" + columniterator + "]");
				matrix[rowiterator][columniterator] = Integer.parseInt(scan.nextLine());
			}
		}
		return matrix;

	}

	public void printMatrix(int[][] matrix) {
		int row = matrix.length;
		int columns = matrix[0].length;
		for (int rowiterator = 0; rowiterator < row; rowiterator++) {
			for (int columniterator = 0; columniterator < columns; columniterator++) {
				System.out.println(matrix[rowiterator][columniterator] + "");
			}
			System.out.println();
		}

	}

	public int[][] createfristMatrix(int rows, int columns) {
		int[][] firstMatrix = createMatrix(rows, columns);
		System.out.println("First Matrix is ");
		printMatrix(firstMatrix);
		return firstMatrix;

	}

	public int[][] createsecondMatrix(int rows, int columns) {
		int[][] secondMatrix = createMatrix(rows, columns);
		System.out.println("Second Matrix is ");
		printMatrix(secondMatrix);
		return secondMatrix;
	}

	public int[][] additionOfMatrix(int rows, int columns) {
		int row = rows;
		int column = columns;
		int[][] finalMatrix = new int[row][column];
		int[][] firstMatrix = createfristMatrix(row, column);

		int[][] secondMatrix = createsecondMatrix(row, column);
		printMatrix(secondMatrix);

		for (int rowiterator = 0; rowiterator < rows; rowiterator++) {
			for (int columniterator = 0; columniterator < column; columniterator++) {
				finalMatrix[rowiterator][columniterator] = firstMatrix[rowiterator][columniterator]
						+ secondMatrix[rowiterator][columniterator];
			}

		}
		System.out.println("Matrix After Addition");
		printMatrix(finalMatrix);
		return finalMatrix;
	}

	public static void main(String[] args) {
		System.out.println("Enter the size of Matrix:");
		System.out.println("Enter the nuber of rows");
		int rows = Integer.parseInt(scan.nextLine());
		System.out.println("Enter the nuber of columns");
		int columns = Integer.parseInt(scan.nextLine());
		OpertionOnMatrix matrix = new OpertionOnMatrix(rows, columns);
		matrix.additionOfMatrix(rows, columns);

	}

}
