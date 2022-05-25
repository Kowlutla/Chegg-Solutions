package shape;

public class Ellipse extends Circle implements Comparable
{
	double minorRadius;//variable minor radius
	public Ellipse(double radius,double minorRadius)//constructor for Eclipse which get the radius from super class Circle
	{
		super(radius);
		this.minorRadius=minorRadius;
	}
	public double getMinorRadius()//Method to get Minor Radius
	{
		return minorRadius;
	}
	public void setMinorRadius(double minorRadius)//Method to set the Minor radius
	{
		this.minorRadius=minorRadius;
	}
	public double area()//Method to get the area of Ellipse
	{
		return super.area()*minorRadius/radius; 
	}
	public boolean isCircle()//Method to check whether the ellipse is circle or not
	{
		return radius==minorRadius; //return true if radius and minor radius are same else return false
	}
	//Compare to method which helps to sort list of objects based on area in ascending order
	public int compareTo(Object o)
	{
		Ellipse e=(Ellipse)o;
		if(this.area()>(e.area()))
		{
			return 1;
		}
		else if(this.area()<e.area())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
