package com.javapractice.oops;

public class TestOLAndOR {

	// Overloaded Method
	public void overrideMethod(OverridingAndOverloadingConept2 opr) {
		System.out.println("Overloaded method from OverridingAndOverloadingConept2: TestOLAndOR");
	}

	// Overloaded Method
	public void overrideMethod(OverridingAndOverloadingConept opr) {
		System.out.println("Overloaded method from OverridingAndOverloadingConept: TestOLAndOR");
	}

	public static void main(String[] args) {

		OverridingAndOverloadingConept2 oop = new OverridingAndOverloadingConept2();
		OverridingAndOverloadingConept oor = new OverridingAndOverloadingConept();
		OverridingAndOverloadingConept or = new OverridingAndOverloadingConept2();

		System.out.println("Overriding methods");
		oop.overrideMethod();
		or.overrideMethod();
		oor.overrideMethod();

		System.out.println("\nOverloaded methods:");

		oop.overrideMethod(oor);
        oop.overrideMethod(oop);

		or.overrideMethod(oop);
		or.overrideMethod(oor);
		
		System.out.println("\nOverloaded methods from current class:");
		TestOLAndOR tlr= new TestOLAndOR();
		tlr.overrideMethod(or);
		tlr.overrideMethod(oop);
		tlr.overrideMethod(oor);

	}

}
