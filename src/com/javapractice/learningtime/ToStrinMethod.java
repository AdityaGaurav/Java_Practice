package com.javapractice.learningtime;

public class ToStrinMethod {

	int totalSize;
	String name;

	public ToStrinMethod(int n, String s) {
		this.name = s;
		this.totalSize = n;
	}

	public String toString() {
		return name + " has" + totalSize + " vehicles";
	}

}
