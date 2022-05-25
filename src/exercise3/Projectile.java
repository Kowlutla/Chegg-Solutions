package exercise3;

import java.util.Scanner;


public class Projectile {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//prompt user to input the projectile initial velocity ve
		System.out.print("Enter initial velocity: ");
		double ve=sc.nextDouble();
		//creating object of trajectory
		Trajectory t=new Trajectory();
		//calling calculateMaxHeight()method using Trajectory class
		double hmax=t.calculateMaxHeight(ve);
		//printing maximum height returned by method
		System.out.println("Maximum Height: "+hmax);
		sc.close();
	}

}
