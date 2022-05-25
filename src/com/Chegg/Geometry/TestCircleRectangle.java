package com.Chegg.Geometry;

public class TestCircleRectangle {

	public static void main(String[] args) {
		
		//Circle Object
		CircleFromSimpleGeometricObject circle=new CircleFromSimpleGeometricObject(1);
		//set filled to true
		circle.setFilled(true);
		System.out.println("A circle "+circle.toString());
		System.out.println("The color is "+circle.getColor());
		System.out.println("The radius is "+circle.getRadius());
		System.out.println("The area is "+circle.getArea());
		System.out.println("The diameter is "+circle.getDiameter());
		
		//Rectangle Object
		RectangleFromSimpleGeometricObject rectangle=new RectangleFromSimpleGeometricObject(2,4);
		//set color to green
		rectangle.setColor("Green");
		System.out.println("\nA Rectangle "+rectangle.toString());//printing toString method of rectangle
		System.out.println("the area is "+rectangle.getArea());//printing area of rectangle
		System.out.println("the perimeter is "+rectangle.getPerimeter());//printing perimeter of rectangle
		
		//Right Triangle Object
		RightTriangleFromSimpleGeometricObject triangle =new RightTriangleFromSimpleGeometricObject (2, 5, "blue", true);
		System.out.println("\nA right triangle " + triangle.toString());
		System.out.println("The area is " + triangle.getArea());//printing area
		System.out.println("The perimeter is " + triangle.getPerimeter());//printing perimeter
		
		System.out.println("\nWritten By Sudeepthi Maruvada");
	}

}
