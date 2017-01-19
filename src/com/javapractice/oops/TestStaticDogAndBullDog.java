package com.javapractice.oops;

public class TestStaticDogAndBullDog {
	/*
	 * No, you cannot override static method in Java because method overriding
	 * is based upon dynamic binding at runtime and static methods are bonded
	 * using static binding at compile time. Though you can declare a method
	 * with same name and method signature in sub class which does look like you
	 * can override static method in Java but in reality that is method hiding.
	 * Java won't resolve method call at runtime and depending upon type of
	 * Object which is used to call static method, corresponding method will be
	 * called. It means if you use Parent class's type to call static method,
	 * original static will be called from patent class, on ther other hand if
	 * you use Child class's type to call static method, method from child class
	 * will be called. In short you can not override static method in Java. If
	 * you use Java IDE like Eclipse or Netbeans, they will show warning that
	 * static method should be called using class name and not by using object
	 * becaues static method can not be overridden in Java.
	 * 
	 */

	public static void main(String[] args) {
//		Dog d = new Bulldog();
		Dog.canTalk();

//		Bulldog bd = new Bulldog();
		Bulldog.canTalk();

	}
}
