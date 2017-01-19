package com.javapractice.datastructure;

public class RecusiveAlgorithm {

	public static int sumOfNumbers(int n) {
		if (n <= 0) {
			return 0;
		}

		return n + sumOfNumbers(n - 1);
	}
	
	public static int factorialOfNumber(int n){
		if(n==0 || n== 1){
		return 1;
		}

		return n* factorialOfNumber(n-1);
	}
	public static void main(String[] args){
        int n=factorialOfNumber(5);
        System.out.println(n);

        }
}
