package com.javapractice.oops;

public class InheritancePractice  {
	public static void main(String[] gaurav) {

		EncapsulationPractice2 e2 = new EncapsulationPractice2();
		InheritancePractice i1 = new InheritancePractice();
		InheritancePractice i2 = new InheritancePractice();

		if (i1.equals(i2)) {
			System.out.println("Bothe have equal state");
		} else {
			System.out.println("Not quals");
		}
		if (e2 instanceof InheritancePractice) {
			System.out.println("Belongs to class ");
		}

	}

}
