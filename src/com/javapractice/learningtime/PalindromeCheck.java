package com.javapractice.learningtime;

import java.util.Scanner;

public class PalindromeCheck {
	Scanner scn = new Scanner(System.in);

	public boolean checkPalindrome() {

		System.out.println("Enter Number");
		int inputNumber = scn.nextInt();

		int reverseNumber = 0, tempNumber;
		tempNumber = inputNumber;

		while (tempNumber != 0) {

			reverseNumber = reverseNumber * 10;
			System.out.println("reverseNumber under while loop " + reverseNumber);
			
			reverseNumber = reverseNumber + tempNumber % 10;
			System.out.println("reverseNumber in 2nd line under while loop " + reverseNumber);
			
			tempNumber = tempNumber / 10;
			System.out.println("tempNumber under while loop " + reverseNumber);
		}

		if (inputNumber == reverseNumber){
			System.out.println("Number is palindrome");
		return true;
		}
		
			System.out.println("Number is not a plaindrome number");
		return false;
	}
	
	
	public void listOfPalindromeNumber(){
		
		System.out.println("Enter Range");
		
			
		}
		
			
		
	

	public static void main(String[] args) {
		new PalindromeCheck().checkPalindrome();

	}
}
