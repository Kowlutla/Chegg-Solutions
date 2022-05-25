
import java.util.Arrays;

public class ex3CopyArray {

	public static void main(String[] args) {
		// Original Array
		int[] my_array = { 25, 10, 55, 65, 36, 92, 77, 8, 13, 79 };
		// creating new array to copy original array
		int[] new_array = new int[10];
		// printing original array
		System.out.println("Source Array: " + Arrays.toString(my_array));
		// iterating my_array and copying each element to new_array
		for (int i = 0; i < 10; i++) {
			new_array[i] = my_array[i];
		}
		// printing new_array
		System.out.println("New Array: " + Arrays.toString(new_array));
	}

}
