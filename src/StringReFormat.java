import java.util.Scanner;

public class StringReFormat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Asking to enter name
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		// passing name to stringReformat method
		System.out.print("Reformatted: ");
		name = stringReformat(name);
		// printing reformatted name
		System.out.println(name);
		System.out.println();
		sc.close();
	}

	// Method to reformat the name
	public static String stringReformat(String name) {
		String firstname = "";// to hold first name
		String lastname = "";// to hold the last name
		String initial = "";// to hold initial
		int index = 0;
		// traverse through complete name
		for (int i = 0; i < name.length(); i++) {
			// extracting each character
			char character = name.charAt(i);
			// if current character is ','
			// consider all string before ',' is last name
			if (character == ',') {
				lastname = name.substring(0, i);
				index = i + 1;
			}
			// if current character is '.'
			// consider character before '.' is initial
			else if (character == '.') {
				initial = name.substring(i - 1, i);
			}
			// consider all name without last name as first name
			else {
				firstname = name.substring(index);
			}

		}
		index = 0;
		// finding index where initial present
		for (int i = 0; i < firstname.length(); i++) {
			if (firstname.charAt(i) == '.') {
				index = i - 1;
			}
		}
		// if initial in first name remove initial from first name
		if (index != 0) {
			firstname = firstname.substring(0, index - 1);
		}
		return (firstname + " " + initial + " " + lastname).substring(1);

	}

}
