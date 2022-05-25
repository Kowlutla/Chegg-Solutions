package com.Chegg.Geometry;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double radius;

	/* Construct a default CircleFromSimpleGeometricObject Object */
	public CircleFromSimpleGeometricObject() {
		super();
	}

	/*Construct a default CircleFromSimpleGeometricObject with specified radius*/
	public CircleFromSimpleGeometricObject(double radius) {
		super();
		this.radius = radius;
	}
	
	/*Construct a default CircleFromSimpleGeometricObject with
	 *  specified radius, color and filled values*/
	public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	/* Return radius */
	public double getRadius() {
		return radius;
	}

	/* Set new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/* Return Area*/
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/* Return Diameter*/
	public double getDiameter() {
		return 2 * radius;
	}

	/* Return perimeter*/
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/* Print Circle Info*/
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}

}
