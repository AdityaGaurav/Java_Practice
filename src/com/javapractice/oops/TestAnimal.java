package com.javapractice.oops;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a = new Dog();
		Animal d = new Bulldog();
		Dog dd = new Bulldog();
		Bulldog b = new Bulldog();
		PetAnimal p=new Dog();
		p.canEat();
		System.out.println("============================");
		a.canEat();
		a.canWalk();
		// a.canBark();

		d.canEat();
		d.canWalk();
//		d.canBark();

		b.canBark();
		b.canEat();
		b.canBark();

		dd.canEat();
		dd.canWalk();
		// dd.canBark();
		
		System.out.println("============================");
		Bulldog a1 =(Bulldog) new Dog(); // run time error java.lang.ClassCastException
		System.out.println("============================");
        a1.canBark();
		a1.canEat();
		a1.canWalk();
		
		Animal.canJump();
		

	}

}
