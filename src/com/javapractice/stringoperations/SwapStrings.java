package com.javapractice.stringoperations;

public class SwapStrings {
	
	public void swapString(){
		String a= "Hello";
		String b = "World";
		b=b.concat(a);
		a=b.substring(0,a.length());
		System.out.println(a);
		b=b.substring(5, b.length());
		System.out.println(b);
	}
	
	public static void main(String[] args){
		new SwapStrings().swapString();
	}

}
