package com.javapractice.basiccode;

public class StaticBlock {
	static int a;
	       int b;
	static {
		System.out.println("Hi");
		System.out.println(a);
		
	}

	public static int staticMethod() {
     System.out.println("============");
      int c = 5+8;
      a=c;
      System.out.println(a);
		return a;
	}
	
	

	public static void main(String[] a) {
		staticMethod();
	}
}
