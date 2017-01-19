package com.javapractice.geeksforgeeks;

import java.math.BigDecimal;

public class JavaPuzzlers {
	public static boolean isOdd(int i) {
		return i % 2 == 1;
	}
	
	@SuppressWarnings("finally")
	static boolean waffle() {
//		Final block is considered to be cleanup block, return is not generally expected in it.
		 try {
		 return true;
		 } finally {
		 return false;
		 }
		 }

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		boolean result=isOdd(67);
		System.out.println(waffle());
		System.out.println('H'+'a');
		System.out.println(2.0-1.10);
		System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.10")));
		System.out.println(12+21);
	}

}
