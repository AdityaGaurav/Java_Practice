package com.javapractice.learningtime;

public class GeeksClass {
	final static int a11=10;
	final int b=10;
	
	public static void blankFinalVariable(){
		final int a;
		a=30;
		System.out.println(a);
//		a=40;
	}
	
	public  void assignDigitToFinal(int a1){
//		b=a1;
		
		System.out.println("value of b"+b);
		
	}
	
	
	public static void main(String[] args){
		@SuppressWarnings("unused")
		final GeeksClass gc = new GeeksClass();
		@SuppressWarnings("unused")
		GeeksClass gc1 = new GeeksClass();
//		gc=gc1;
		new GeeksClass().assignDigitToFinal(67);
	}

}
