package com.Chegg.PalindromeFile;

import java.io.*;

public class FilePalindromes {

	public static void main(String[] args) throws IOException {
		
		FileReader fr;
		BufferedReader br;
		try {
			fr=new FileReader("input.txt");
			br=new BufferedReader(fr);
			String s="";
			while((s=br.readLine())!=null)
			{
				if(isPalindrome(s))
				{
					System.out.println(s);
				}
			}
		} catch (FileNotFoundException e) {
		}

	}
	
	public static boolean isPalindrome(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        /* check for first and last char of String:
         * if they are same then do the same thing for a substring
         * with first and last char removed. and carry on this
         * until you string completes or condition fails
         * Function calling itself: Recursion
         */
        return isPalindrome(s.substring(1, s.length()-1));

        /* If program control reaches to this statement it means
         * the String is not palindrome hence return false.
         */
        return false;
    }

}
