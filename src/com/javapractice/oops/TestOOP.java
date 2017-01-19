package com.javapractice.oops;

public class TestOOP {

	public static void main(String[] args){
		
		EncapsulationPractice2 ep2 = new EncapsulationPractice2();
		EncapsulationPractice enp = ep2;
		InheritancePractice ip=ep2;
		System.out.println(enp);
		System.out.println(ip);
//		System.out.println("HI");
//		EncapsulationPractice2 ep= new EncapsulationPractice2();
//		ep.couldBeExtended();
	}
}
