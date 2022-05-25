package exercise3;

public class Trajectory {
	
	//final variable G
	final private double G=9.8;
	
	//Method to calculate maximum height
	public double calculateMaxHeight(double ve)
	{
		double hmax=ve/(2*G);
		return hmax;
	}

}
