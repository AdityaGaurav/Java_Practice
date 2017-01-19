package com.javapractice.oops;

public class Bulldog extends Dog implements Animal {
	void canBark(){
		System.out.println("Bulldog can Bark");
		
	}
//	his instance method cannot override the static method from Dog
	public  static void canTalk(){
		System.out.println("Child class static method");
	}

}
