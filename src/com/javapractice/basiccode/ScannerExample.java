package com.javapractice.basiccode;

import java.util.Scanner;

public class ScannerExample {

	public static void useScanner() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first Integer");
		int i = scan.nextInt();

		System.out.println("Enter first Double");
		double d = scan.nextDouble();
		scan.nextLine();

		System.out.println("Enter String: next");
		String s = scan.next();

		System.out.println("Enter String: nextLine");
		String s2 = scan.nextLine();

		System.out.println("Enter Second Integer");
		int i2 = scan.nextInt();

		System.out.println("Enter String: nextLine");
		String str = scan.nextLine();

		System.out.println("Enter Integer");
		int i3 = scan.nextInt();

		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(str);
		System.out.println(i3);

		scan.close();

	}
	

	public static void main(String[] args) {
		useScanner();

	}

}
