
public class Module8Lab {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter a String s1: ");
		String s1 = input.nextLine();

		System.out.print("Enter a String s2: ");
		String s2 = input.nextLine();

		long startTime = System.currentTimeMillis();

		int index = matchBruteForce(s1, s2);

		long endTime = System.currentTimeMillis();
		long exeTime = endTime - startTime;
		if (index >= 0) {
			System.out.println("Matched at index: " + index);
		} else {
			System.out.println("UnMatched");
		}
		System.out.printf("Execution time is %d ms\n", exeTime);
		input.close();
		
		System.out.println(1/Math.pow(2,31));
	}

	/*the worst-case time complexity is O(n) where n is s.length()
	 * 
	 * @param s String
	 * @param pattern String
	 * 
	 * @return int
	 */
	public static int match(String s, String pattern) {
		// look for substring of length of length pattern length
		for (int i = 0; i <= s.length() - pattern.length(); i++) {
			// extract substring of length pattern length in s
			String sub = s.substring(i, i + pattern.length());
			// if sub string is the pattern then result the starting index of substring
			if (sub.equals(pattern)) {
				return i;
			}
		}
		// if pattern not found
		return -1;
	}

	
	/*
	 * Brute force method to find index of matching pattern Time complexity of this
	 * algorithm is O(n*k) 
	 * where n-length of s
	 *       k-length of pattern
	 */
	public static int matchBruteForce(String s, String pattern) {
		int k;
		//
		for (int i = 0; i < s.length(); i++) {
			for (k = 0; k < pattern.length(); k++) {
				if (s.charAt(i + k) != pattern.charAt(k)) {
					break;
				}
			}
			if (k == pattern.length()) {
				return i;
			}
		}
		return -1;

	}

}
