
package com.Chegg.Geometric;

public class Rectangle extends GeometricObject {
	// attributes
	private double width;
	private double height;

	// Constructor
	public Rectangle(int object_ID, double width, double height, String color) {
		super(object_ID, color);
		this.width = width;
		this.height = height;
	}

	// Override method to calculate area of rectangle
	@Override
	double getArea() {

		return width * height;
	}

	/*
	 * Override method toString which return the properties of super class and sub
	 * class
	 */
	@Override
	public String toString() {
		return super.toString() + "\t" + width + "\t" + height;
	}

}
