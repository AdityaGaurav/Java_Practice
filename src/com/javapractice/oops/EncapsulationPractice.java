package com.javapractice.oops;

public class EncapsulationPractice extends InheritancePractice {
	private int radius;
//	Downcasting
//EncapsulationPractice2 ep = (EncapsulationPractice2) new EncapsulationPractice();

	public void setRadius(int radius) {
		
		if (radius > 0 && radius < 100) {
			this.radius = radius;
		} else {
			System.out.println("Range of radius should be betweeen 0-100.");
			System.exit(0);
		}

	}

	public int getRadius() {
		return radius;
	}

	public double calculateArea() {
		int radiusCircle = getRadius();
		double area = (3.14 * radiusCircle * radiusCircle);
		return area;
	}

}
