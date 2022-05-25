import java.util.Arrays;
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// array of size 3
		// Each element of the array represents one dice
		int array[] = new int[3];
		// to count the no of ones in di
		int countones = 0;
		Random rand = new Random();
		do {
			// generate a number between 1-6
			array[0] = rand.nextInt(6) + 1;
			array[1] = rand.nextInt(6) + 1;
			array[2] = rand.nextInt(6) + 1;
			// printing generated numbers of array
			System.out.println("Dice Results: " + Arrays.toString(array));
			// counting no of 1's in generated number
			countones = compareDies(array);
		} while (countones != 2 && countones != 3);// do this until array not contain 2 or 3 ones

		// printing game ends statement
		System.out.println("* * * * Game ends * * * *");

	}
	// Method to compare the elements of the array
	private static int compareDies(int[] array) {
		// initializes the 1's count to 0
		int count = 0;
		// look for all elements in array
		for (int i = 0; i < 3; i++) {
			// if current element equals to 1
			if (array[i] == 1) {
				// Increment 1's count value
				count++;
			}
		}
		// return 1's count
		return count;
	}
}