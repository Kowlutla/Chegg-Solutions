package com.Chegg.StarSeacrh;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class StarSerach {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("scores.txt");// reading file
			modifiedStarSearch(file);// passing file to method to get average
		}
		// catch the exception if file not found
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	// Method modifiedStarSearch
	public static void modifiedStarSearch(FileReader file) {
		Scanner sc = new Scanner(file);// scanner object to read the values in file
		double high = Integer.MIN_VALUE;// to hold the high value in file
		double low = Integer.MAX_VALUE;// to hold the low value in file
		double sum = 0;// to hold the sum of valid values
		int count = 0;// to hold the count of valid values
		while (sc.hasNext())// loop till the last value
		{
			double value = sc.nextDouble();// take current value in file
			if (value >= 0 && value <= 10)// check if value is in range or not
			{
				sum += value;// add the value to the sum
				if (value > high)// if current value is greater than high
				{
					high = value;// assign value to high
				}
				if (value < low)// if current value is less than low
				{
					low = value;// assign value to low
				}
				count++;// increment count
			}
		}
		sum = sum - high - low;// dropping low and high scores
		count = count - 2;// because we dropped two values
		double average = sum / count;// calculating average
		System.out.print("Average: ");// printing average statement
		System.out.format("%.3f", average);// printing resulted average up to 3 decimals
		sc.close();
	}
}
