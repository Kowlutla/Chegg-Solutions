package shape;

public class Circle extends Shape implements Comparable
{
	//variable radius
	double radius;
	//default constructor 
	public Circle(){
		super();
	}
	//Parameterized constructor
	public Circle(double radius){
		this.radius=radius;
	}
	//overridden method from super class Shape
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}
	//method to set Radius
	public void setRadius(double radius){
		this.radius=radius;
	}
	//method to get radius
	public double getRadius(){
		return radius;
	}
	//Compare to method which helps to sort list of objects based on area in ascending order
	@Override
	public int compareTo(Object o) {
		Circle c=(Circle)o;
		if(this.area()>(c.area()))
		{
			return 1;
		}
		else if(this.area()<c.area())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
