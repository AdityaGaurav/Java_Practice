package com.javapractice.learningtime;

public class ConstructorPractice {
	int data;
	ConstructorPractice csv;

	public ConstructorPractice(int data) {
		this.data = data;
		System.out.println(data);

	}

	public static void main(String[] args) {
		ConstructorPractice cns = new ConstructorPractice(5);

		System.out.println(cns);
	}

}
