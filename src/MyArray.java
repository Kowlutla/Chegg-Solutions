import java.util.Random;
import java.util.Scanner;
public class MyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.print("Enter min: ");
		int min = sc.nextInt();
		System.out.print("Enter max: ");
		int max = sc.nextInt();
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = rand.nextInt((max - min) + 1) + min;
		}
		System.out.println("Random array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\nMean: ");
		System.out.format("%.2f",getMean(array));
		
		System.out.print("\nstandard Deviation:");
		System.out.format("%.2f",calculateSD(array));
	}
	// Method to get the mean of array of elements
	public static double getMean(int[] array) {
		// initialize sum to 0
		int sum = 0;
		// find the sum of each element in array
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		// return mean as total sum/no of elements in array
		return (double) sum / array.length;
	}
	public static double calculateSD(int[] array) {
		
		double  standardDeviation = 0.0;
		double mean=getMean(array);
		
		for(double num: array) {
            standardDeviation += Math.pow(num - mean, 2);
        }
		return Math.sqrt(standardDeviation/array.length);
	}
}
