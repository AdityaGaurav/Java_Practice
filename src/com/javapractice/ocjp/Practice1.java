package com.javapractice.ocjp;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {

	public static void main(String[] args) {
		Practice1 prc = new Practice1();
		int[] a = new int[5];
		prc.arrayCase(a);
		System.out.print(a.length);

	}

	public void aarayListCase() {
		// String abc;
		// int a;
		List<Integer> elements = new ArrayList<>();
		elements.add(10);
//		int firstElmnt = elements.get(1);
		// System.out.println(abc);
		// System.out.println(a);

	}

	public void switchMethodcase() {
		int cardVal = 9;
		switch (cardVal) {
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("Hit");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Double");
			break;
		case 15:
		case 16:
			System.out.println("Surrender");
			break;
		default:
			System.out.println("Stand");
		}
	}

	public void stringCase() {
		StringBuffer sb1 = new StringBuffer("javachamp");
		StringBuffer sb2 = new StringBuffer("javachamp");
		boolean stmt1 = sb1.equals(sb2);
		System.out.println(stmt1+" ");
		boolean stmt2 = sb1 == sb2;
		System.out.println(stmt2);
		String s1 = new String("javachamp");
		String s2 = new String("javachamp");
		boolean stmt3 = s1.equals(s2);
		System.out.println(stmt3);
		boolean stmt4 = s1 == s2;
		System.out.println(stmt4);
	}

	public void arrayCase(int[] a1) {
		int[] b = new int[3];
		// a = b;
		// System.out.println(a.length);
		System.out.println(b.length);
	}

}
