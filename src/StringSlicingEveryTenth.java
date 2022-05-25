
import java.util.Scanner;
public class StringSlicingEveryTenth {

	public static void main(String[] args) {
		
		//user defined string which contains all upper case, lower case and digits 
		final String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the starting Position: ");//reading starting position  
		int start=sc.nextInt();
		System.out.println("Enter the ending position: ");//reading ending position
		int end=sc.nextInt();
		String sliced_string=stringSlicing(characters,start,end);//string returned by the method stringSlicing
		
		System.out.println("Every tenth characters between positions "+start+" and "+end);//printing the resulted string
		System.out.println(sliced_string);
		sc.close();
	}

	//Method that slice the given string every 10th character from given starting position to ending position
	private static String stringSlicing(String characters, int start, int end) {
		
		char array[]=characters.toCharArray();//convert string to character array
		
		String sliced_string="";//take an empty string
		int index=start;
		while(index<array.length && index<=end)//condition for taking characters index should start from given start position
		{										//and does not exceed the string length and ending position
			sliced_string=sliced_string+array[index];//add the character at index position in character array to sliced_string 
			index+=10;//increment index by 10 to read the next character at 10th position
		}
		return sliced_string;//return the string which contain characters between start index to end index which are present at 10th position
	}
}
