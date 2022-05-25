package exercise4;

import java.util.Scanner;

public class Projectile {

	//private final variable G
	final private double G=9.8;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//prompt user to input the projectile initial velocity ve
		System.out.print("Enter initial velocity: ");
		double ve=sc.nextDouble();
		//creating object of trajectory
		Projectile p=new Projectile();
		//calling calculateMaxHeight()method using Trajectory class
		double hmax=p.calculateMaxHeight(ve);
		//printing maximum height returned by method
		System.out.println("Maximum Height: "+hmax);
		sc.close();
	}

	//private Method to calculate maximum height
	private double calculateMaxHeight(double ve)
	{
		double hmax=ve/(2*G);
		return hmax;
	}
}
