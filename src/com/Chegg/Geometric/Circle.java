
package com.Chegg.Geometric;

public class Circle extends GeometricObject {
	// Attributes
	private double radius;

	// Constructor
	public Circle(int object_ID, double radius, String color) {
		super(object_ID, color);
		this.radius = radius;
	}

	// Override method to calculate area of circle
	@Override
	double getArea() {
		return radius * radius * Math.PI;
	}

	/*
	 * Override method toString which return the properties of super class and sub
	 * class
	 */
	@Override
	public String toString() {
		return super.toString() + "\t" + radius;
	}
}
