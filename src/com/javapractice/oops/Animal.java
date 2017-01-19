package com.javapractice.oops;

public interface Animal {
	
    int totalCount=4;
    static int FixCount=5;
    
	public abstract void canEat();

	void canWalk();
	
	default public void myFirstDfaultMethod(){
		System.out.println("Hi this is my first default method");
	}
	
	static void canJump(){
		System.out.println("Hey, we can jump");
	}

}
