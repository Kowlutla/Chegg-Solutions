package shape;

public class Ellipsoid extends Ellipse implements Comparable
{
	double heightRadius;//variable heightRadius
	//Constructor for Ellipsoid which takes radius and minor radius from super class Ellipse
 	public Ellipsoid(double radius,double minorRadius,double heightRadius)
	{
		super(radius,minorRadius);
		this.heightRadius=heightRadius;
	}
 	//Method to return volume of Ellipsoid 
 	//Formula: 4/3*3.14*radius*minorRadius*heightRadius
	public double getVolume()
	{
		return super.area()*heightRadius*4/3;
	}
	//Compare to method which helps to sort list of objects based on volume in ascending order
	public int compareTo(Object o)
	{
		Ellipsoid es=(Ellipsoid)o;//DownCasting
		if(this.getVolume()>(es.getVolume()))
		{
			return 1;
		}
		else if(this.getVolume()<es.getVolume())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
