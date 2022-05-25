import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LongestWordInFile {

	public static void main(String[] args) throws IOException {
		// getting file
		File file = new File("data.txt");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");// asking number n
		int n = sc.nextInt();
		// calling method to get the length of longest word whose length is greater than
		// or equal to n
		int long_word_length = getLongestWordLength(file, n);
		// printing longest word length
		System.out.println(
				"Length of longest word in file whose length is greater than " + n + " is: " + long_word_length);
		sc.close();
	}

	
	// Method to return the length of longest word
	public static int getLongestWordLength(File file, int n) throws IOException {

		// scanner object to read the data of file
		Scanner input = new Scanner(file);
		// max_length to hold the longest word length in file
		int max_length = -1;
		// read the each word in file
		while (input.hasNext()) {
			String s = input.next();
			// check if the string length greater than or equal to n
			if (s.length() >= n) {
				// check if the string length is greater than max_length
				if (s.length() > max_length) {
					max_length = s.length();
				}
			}
		}
		input.close();
		// return max length
		return max_length;
	}
}
