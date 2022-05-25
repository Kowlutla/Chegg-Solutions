package exercise1;

import java.util.Scanner;

public class Projectile {

	//static final variable G
	private static final double G=9.8;
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		//prompt user to input the projectile initial velocity ve
		System.out.print("Enter initial velocity: ");
		double ve=sc.nextDouble();
		//calling calculateMaxHeight()method
		double hmax=calculateMaxHeight(ve);
		//printing maximum height returned by method
		System.out.println("Maximum Height: "+hmax);
		sc.close();
	}
	
	//Method to calculate maximum height
	public static double calculateMaxHeight(double ve)
	{
		double hmax=ve/(2*G);
		return hmax;
	}

}
