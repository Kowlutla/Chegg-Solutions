import java.util.Scanner;

public class PhoneNumberConverter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Asking user to enter phone number in XXX-XXXX-XXX format
	    System.out.println("Please enter the Phone number in this format: (XXX-XXX-XXXX) ");
	    
	    String phoneNumber=sc.nextLine();
	    //printing Input phone number
	    System.out.println("Input Phone Number: "+phoneNumber);
	    //convert the input phone number by calling convertPhone number method
	    String convertedNumber=convertPhoneNumber(phoneNumber);
	    //print the converted phone number
	    System.out.println("Output Phone Number: "+convertedNumber);
	    sc.close();
	}

	//Method to convert entered XXX-XXXX-XXX format to Equivalent phone number
	private static String convertPhoneNumber(String phoneNumber) {
		//converting each character to upper case
		phoneNumber=phoneNumber.toUpperCase();
		//result to hold converted number
		String result="";
		for(int i=0;i<phoneNumber.length();i++){
			char letter=phoneNumber.charAt(i);
			//if current letter is character we need to modify current letter and concat with result
			if(Character.isLetter(letter)) {
	            switch(letter) {
	            	//if letter is A, B, and C => 2
		            case 'A' : case 'B' : case 'C' : result+= 2; break;
		            
		            //if letter is D, E, and F => 3
		            case 'D' : case 'E' : case 'F' : result+= 3; break;
		            
		            //if letter is G, H, and I => 4
		            case 'G' : case 'H' : case 'I' : result+= 4; break;
		            
		            //if letter is J, K, and L => 5
		            case 'J' : case 'K' : case 'L' : result+= 5; break;
		            
		            //if letter is M, N, and O => 6
		            case 'M' : case 'N' : case 'O' : result+= 6; break;
		            
		            //if letter is P, Q, R, and S => 7
		            case 'P' : case 'Q' : case 'R' : case 'S' : result+= 7; break;
		            
		            //if letter is T, U and V => 8
		            case 'T' : case 'U' : case 'V' : result+= 8; break;
		            
		            //if letter is W, X,Y, and Z => 9
		            case 'W' : case 'X' : case 'Y' : case 'Z' : result+= 9; break;
	            }
	        }
			//if not character nothing to change concat current letter to result
			else{
				result=result+phoneNumber.charAt(i);
			}
		}
		//return result
		return result;
	}

}
