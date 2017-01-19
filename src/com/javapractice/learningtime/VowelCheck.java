package com.javapractice.learningtime;

import java.util.Scanner;

public class VowelCheck {

	public void isVowel() {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The Character");
		char ch = Character.toLowerCase(scn.next().charAt(0));
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is a Vowel");
		} else {
			System.out.println(ch + " is not a Vowel");
		}
		scn.close();
	}

public static void main(String[] args){
	new VowelCheck().isVowel();
}

}
