package exercise2;

public class Trajectory 
{
	//static final variable G
	private static final double G=9.8;
	
	//Method to calculate maximum height
	public static double calculateMaxHeight(double ve)
	{
		double hmax=ve/(2*G);
		return hmax;
	}
		
}
