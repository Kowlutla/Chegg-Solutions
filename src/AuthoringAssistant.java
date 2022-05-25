import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthoringAssistant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//(1) Prompt the user to enter a string of their choosing. Store the text in a string. Output the string.
		System.out.println("Enter a sample text: ");
		String s=sc.nextLine();
		System.out.println("You entered: ");
		System.out.println(s);
		char option;
		do
		{
			option=printMenu();
			switch(option)
			{
				case 'c':
				{
					int non_white_spaces=getNumOfNonWSCharacters(s);
					System.out.println("Number of non-whitespace characters: "+non_white_spaces);
					System.out.println();
					break;
				}
				case 'w':
				{
					int words= getNumOfWords(s);
					System.out.println("No of words: "+words);
					System.out.println();
					break;
				}
				case 'f':
				{
					System.out.println("Enter a word or phrase to be found: ");
					String phrase=sc.nextLine();
					int instances=findText(phrase,s);
					System.out.println("\""+phrase+"\" instances "+instances);
					System.out.println();
					break;
				}
				case 'r':
				{
					s=replaceExclamation(s);
					System.out.println("Edited String: ");
					System.out.println(s);
					System.out.println();
					break;
				}
				case 's':
				{
					s=shortenSpace(s);
					System.out.println("Edited text: ");
					System.out.println(s);
					System.out.println();
					break;
				}
				default:
				{
					break;
				}
			}
		}while(option!='q');
		sc.close();
	}
	/*(2) Implementing a printMenu() method, which outputs a menu of user options for analyzing/editing the string, 
	 * and returns the user's entered menu option
	 * */
	public static char printMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("MENU :\nc - Number of non-whitespace characters \nw - Number of words \nf - Find text \nr - Replace all !'s \ns - Shorten spaces \nq - Quit Choose an option: ");
		System.out.print("Choose an Option: ");
		char option=sc.next().charAt(0);
		return option;
	}
	//(3) Implementing the getNumOfNonWSCharacters() method
	public static int getNumOfNonWSCharacters(String s)
	{
		String temp=s.replaceAll(" ", "");
		return temp.length();
	}
	//(4) Implementing the getNumOfWords() method
	public static int getNumOfWords(String s)
	{
		String array[]=s.split(" ");
		return array.length;
	}
	//(5) Implementing the findText() method,
	public static int findText(String ftext,String s)
	{
		int count=0;
		Pattern p=Pattern.compile(ftext);
		Matcher matcher=p.matcher(s);
		while(matcher.find())
		{
			count++;
		}
		return count;
	}
	//(6) Implementing the replaceExclamation() method.
	public static String replaceExclamation(String s)
	{
		s=s.replaceAll("!", ".");
		return s;
	}
	//(7) Implementing the shortenSpace() method
	public static String shortenSpace(String s)
	{
		s=s.replaceAll("\\s{2,}", " ").trim();
		return s;
	}
}
