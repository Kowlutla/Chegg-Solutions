import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// creating random object
		Random rand = new Random();
		// creating array of integer to store 50 random integers
		int array[] = new int[50];
		// Reading 50 random numbers under 1000 and store them in array
		// Reading numbers under 1000 because better understanding
		for (int i = 0; i < 50; i++) {
			array[i] = rand.nextInt(1000);
		}

		// printing original order of numbers
		System.out.println("Original order: ");
		for (int i = 0; i < 50; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// calling getMinimum method to get minimum
		int minimum = getMinimum(array);
		// calling getMaximum method to get maximum
		int maximum = getMaximum(array);
		// printing maximum and minimum numbers
		System.out.println("Maximum Number: " + maximum);
		System.out.println("Minimum Number: " + minimum);

		System.out.print("Enter key to search: ");
		int key = sc.nextInt();
		boolean searchresult = searchKey(array, key);
		System.out.println(searchresult);

		// taking another array to copy all elements of present array
		int anotherarray[] = new int[50];
		for (int i = 0; i < 50; i++) { // coping each element to another array
			anotherarray[i] = array[i];
		}
		// calling method to sort array
		sortArray(anotherarray);
		// printing above sorted array
		System.out.println("Sorted Order: ");
		for (int i = 0; i < 50; i++) {
			System.out.print(anotherarray[i] + " ");
		}
		System.out.println();
		sc.close();

	}

	// Method to return the maximum value in array
	public static int getMaximum(int array[]) {
		// assign minimum integer value as maximum
		int maximum = Integer.MIN_VALUE;
		// look for all numbers in array
		for (int i = 0; i < 50; i++) {
			// if current number is greater assign current value as maximum
			if (array[i] > maximum) {
				maximum = array[i];
			}
		}
		// return maximum value
		return maximum;
	}

	// Method to return the maximum value in array
	public static int getMinimum(int array[]) {
		// assign maximum integer value as minimum
		int minimum = Integer.MAX_VALUE;
		// look for all numbers in array
		for (int i = 0; i < 50; i++) {
			// if current number is greater assign current value as maximum
			if (array[i] < minimum) {
				minimum = array[i];
			}
		}
		// return maximum value
		return minimum;
	}

	// Method to sort array(Bubble sort)
	public static void sortArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > (array[j + 1])) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	// Method to search for key is present in array or not
	public static boolean searchKey(int[] array, int key) {
		// loop through each number in array
		for (int i = 0; i < array.length; i++) {
			// if current number is key return true
			if (array[i] == key) {
				return true;
			}
		}
		// if no number matches the key return false
		return false;
	}
}
