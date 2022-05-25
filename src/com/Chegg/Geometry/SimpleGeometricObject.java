package com.Chegg.Geometry;

public class SimpleGeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/* Construct a default geometric Object */
	public SimpleGeometricObject() {
		dateCreated = new java.util.Date();
	}

	/* Construct a default geometric Object with specified color and filed value */
	public SimpleGeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/* Return color */
	public String getColor() {
		return color;
	}

	/* Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/*
	 * Return filled. Since filled is boolean its get method is named as isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/* set a new Filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/* Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/* Return a string representation of this object */
	public String toString() {
		return "created on " + dateCreated + "\nColor: " + color + " and filled: " + filled;
	}

}
