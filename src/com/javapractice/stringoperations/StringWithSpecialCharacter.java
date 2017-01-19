package com.javapractice.stringoperations;

import java.time.LocalDate;
import java.time.Month;

public class StringWithSpecialCharacter {
	
	public static void removeSpecialCharacter() {
		String regex = "'@d|ty@'";
		regex = regex.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(regex);

	}
	
	public  static void stringMatching(){
		
		String s1="java";
//		String s2="abc";
		StringBuilder sb1 = new StringBuilder(); 
		sb1.append("ja").append("va");
		System.out.println(sb1.toString().equals(s1));
		System.out.println(sb1);
	}

	public static void main(String[] args) {
		stringMatching();
		System.out.println(LocalDate.of(2015, 4, 1));
		System.out.println(LocalDate.of(2015, Month.APRIL, 1));
	}

}
