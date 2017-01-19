package com.javapractice.oops;

public class Dog extends PetAnimal implements Animal {

	public void canEat() {
		System.out.println("Dog can Eat");

	}

	public void canWalk() {
		System.out.println("Dog can Walk");
	}
//	This static method cannot hide the instance method from Dog
	public static  void canTalk(){
		System.out.println("Parent class static method");
	}
	
	public void noOfLegs(){
		System.out.println("Dog has"+totalCount+" legs");
	}
	
	
}
