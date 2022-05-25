
import java.util.*;
public class RandomDemo {
	public static void main(String[] args) {
		final int SEED=42;//seed value
		Random rng = new Random(SEED);//setting seed value to random number generator
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the size of the rectangle to be used in the calculation of Pi? ");
		double size = sc.nextDouble();//reading size from user
		double lowerLimit = -1.0*(size/2.0);//calculating lower limit
		double upperLimit = size/2.0;//calculating upper limit

		double xCoordinate = (upperLimit-lowerLimit)*rng.nextDouble() + lowerLimit;//calculating x coordinate
		double yCoordinate = (upperLimit-lowerLimit)*rng.nextDouble() + lowerLimit;//calculating y coordinate
		  
		System.out.println("The coordinate of the point is:");
		System.out.println("("+xCoordinate+","+yCoordinate+")");//printing coordinates
		sc.close();
	}
}
