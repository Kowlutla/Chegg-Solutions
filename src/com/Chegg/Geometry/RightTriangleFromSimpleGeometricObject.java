package com.Chegg.Geometry;

public class RightTriangleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double sideA = 3; // default values
	private double sideB = 4; // default values
	private double sideC = 5; // default values

	/* Construct a default RightTriangleFromSimpleGeometricObject Object */
	public RightTriangleFromSimpleGeometricObject() {
	}

	/* Construct a default RightTriangleFromSimpleGeometricObject Object with specified sideA ,sideB and calculate SideC */
	public RightTriangleFromSimpleGeometricObject(double sideA, double sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
	}

	/* Construct a default RightTriangleFromSimpleGeometricObject Object with specified sideA ,sideB,color,filled and calculate SideC */
	public RightTriangleFromSimpleGeometricObject(double sideA, double sideB, String color, boolean filled) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
		setColor(color);
		setFilled(filled);
	}
	/*Return side A */
	public double getSideA() {
		return this.sideA;
	}

	/*Return side B */
	public double getSideB() {
		return this.sideB;
	}

	/*Return side C */
	public double getSideC() {
		return Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
	}

	/*set side A */
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	/*set side B */
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	/* return The perimeter */
	public double getPerimeter() {
		return this.sideA + this.sideB + getSideC();
	}

	/*Return the area using Heron's formula */
	public double getArea() {
		double s = (this.sideA + this.sideB + getSideC()) / 2;
		double temp = s * (s - sideA) * (s - sideB) * (s - getSideC());
		double area = Math.sqrt(temp);
		return area;

	}
}
