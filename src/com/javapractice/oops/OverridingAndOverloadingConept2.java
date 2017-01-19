package com.javapractice.oops;

public class OverridingAndOverloadingConept2 extends OverridingAndOverloadingConept {

	// Overriding Method
	public void overrideMethod() {
		System.out.println("This Method is from OverridingAndOverloadingConept2 ");
	}

	// Overloaded Method
	public String overrideMethod(String str) {

		return str;

	}

	// Overloaded Method
	public void overrideMethod(OverridingAndOverloadingConept2 opr) {
		System.out.println("Overloaded method from OverridingAndOverloadingConept2");
	}

	// Overloaded Method
	public int overrideMethod(int a, int b) {
		int c = a + b;
		return c;

	}

}
