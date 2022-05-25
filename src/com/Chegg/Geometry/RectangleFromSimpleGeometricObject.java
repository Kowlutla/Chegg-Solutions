package com.Chegg.Geometry;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double width;
	private double height;

	/* Construct a default RectangleFromSimpleGeometricObject   */
	public RectangleFromSimpleGeometricObject() {

	}

	/* Construct a default RectangleFromSimpleGeometricObject with specified width and height */
	public RectangleFromSimpleGeometricObject(double width, double height) {
		this.width = width;
		this.height = height;
	}

	/* Construct a default RectangleFromSimpleGeometricObject with specified width,height,color and filled values */
	public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
		setColor(color);
		setFilled(filled);
		this.width = width;
		this.height = height;
	}

	/* Return width*/
	public double getWidth() {
		return width;
	}

	/* Set new width*/
	public void setWidth(double width) {
		this.width = width;
	}

	/* Return height*/
	public double getHeight() {
		return height;
	}

	/*Set new height*/
	public void setHeight(double height) {
		this.height = height;
	}

	/*Return area*/
	public double getArea() {
		return width * height;
	}

	/* Return perimeter*/
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
