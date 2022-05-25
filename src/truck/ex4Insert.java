package truck;


import java.util.Arrays;
import java.util.Random;

public class ex4Insert {
	public static void main(String[] args) {
		// Original Array
		int[] my_array = { 25, 10, 55, 65, 36, 92, 77, 8, 13, 79 };
		// Insert an element in 3rd position of the array(index->3,value->12)
		int index_position = 3;// index position
		int newValue = 12;// value to be inserted
		// printing original array
		System.out.println("Original Array: " + Arrays.toString(my_array));

		// copy all previous index elements to current index position until the given
		// index position
		for (int i = my_array.length - 1; i > index_position; i--) {
			my_array[i] = my_array[i - 1];
		}
		// insert the new value at given index_position
		my_array[index_position] = newValue;
		// Printing updated array
		System.out.println("New Array: " + Arrays.toString(my_array));
		Random r=new Random();
		//System.out.println(r.nextDouble());
	}
}
