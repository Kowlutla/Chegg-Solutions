
package com.Chegg.Geometric;

abstract public class GeometricObject implements Comparable<GeometricObject> {

	private int object_ID;
	private String color;

	// constructor
	public GeometricObject(int object_ID, String color) {
		this.object_ID = object_ID;
		this.color = color;
	}

	// abstract method to get area
	abstract double getArea();

	//return information of id and color
	public String toString() {
		return object_ID + "\t" + color;
	}

	//method which useful to sort the objects based on object_ID in ascending order
	public int compareTo(GeometricObject o) {
		if (this.object_ID > o.object_ID) {
			return 1;
		} else if (this.object_ID < o.object_ID) {
			return -1;
		} else {
			return 0;
		}
	}

}
