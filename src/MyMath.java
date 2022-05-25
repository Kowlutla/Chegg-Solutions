import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class MyMath {
	public static void main(String args[]) {
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
		double mean = getMean(array);//get mean
		System.out.println("\nMean: " + mean);
		double median = getMedian(array);//get median
		System.out.println("Median: " + median);
		int mode = getMode(array);//get mode
		System.out.println("Mode: " + mode);
		double iqr=getInterquartileRange(array);//get inter quartile range
		System.out.println("Inter quartile Range: "+iqr);
	}
	//Method to get the mean of array of elements
	public static double getMean(int[] array) {
		//initialize sum to 0
		int sum = 0;
		//find the sum of each element in array
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		//return mean as total sum/no of elements in array
		return (double) sum / array.length;
	}
	//Method to return the median of array of numbers
	public static double getMedian(int array[])
	{
		// First we sort the array 
	    Arrays.sort(array); 
	    int n=array.length;
	    // check for even case 
	    if (n % 2 != 0) 
	       return (double)array[n/2]; 
	      //if array length is not even
	    return (double)(array[(n-1)/2] + array[n/2])/2.0; 
	}
	//Method to get mode of array 
	public static int getMode(int array[]) {
		//map used to record the each occurrence of each element
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int max = 1;
		int mode = 0;
		for (int i = 0; i < array.length; i++) {
			if (hm.get(array[i]) != null) {
				int count = hm.get(array[i]);
				count++;
				hm.put(array[i], count);
				if (count > max) {
					max = count;
					mode = array[i];
				}
			}
			else
				hm.put(array[i], 1);
		}
		//return element which occurs more no of times
		return mode;
	}
	// Method to  calculate InterquartileRange 
	public static int getInterquartileRange(int array[]) {
		Arrays.sort(array);
		// Index of median
		// of entire data
		int n = array.length;
		int mid_index = getMedianIndex(array, 0, n);

		// Median of first half
		int Q1 = array[getMedianIndex(array, 0, mid_index)];

		// Median of second half
		int Q3 = array[getMedianIndex(array, mid_index + 1, n)];

		// IQR calculation
		return (Q3 - Q1);
	}
	// Function to give
	// index of the median
	private static int getMedianIndex(int array[], int l, int r) {
		int n = r - l + 1;
		n = (n + 1) / 2 - 1;
		return n + l;
	}
}
