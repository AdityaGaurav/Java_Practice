package com.javapractice.oops;

public class EncapsulationPractice2 extends EncapsulationPractice implements TestPolymorphism {

	public static void main(String[] args) {
		double result;

		EncapsulationPractice2 enp = new EncapsulationPractice2();

		enp.setRadius(101);
		result = enp.calculateArea();
		System.out.println(result + " is area of circle");

	}

	@Override
	public void couldBeExtended() {
		System.out.println("Thanks EncapsulationPractice2. For providing me Body");		
	}
	
	public String toString(){
		return " belong to";
	}
	
	
}
