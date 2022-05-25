import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOperations {

	public static void main(String[] args) throws  IOException //throwing IOException explicitly
	{
		
		int numbers[]=new int[100];//array with at most 100 elements 
		InputStreamReader isr=new InputStreamReader(System.in);//InputStreamReader object
		BufferedReader br=new BufferedReader(isr);//Bufferedreader Object to read elements
		boolean hasMore=true;//used to check need to more elements or not
		int index=0;//keep track of how many elements enter into array
		System.out.println("Enter elements into array: ");
		while(hasMore)//while not entering 0
		{
			int element=Integer.parseInt(br.readLine());//reading element
			numbers[index++]=element;//storing element in array
			if(element==0)//if entered element is 0 then to stop reading elements
			{
				hasMore=false;
			}
		}
		//NOTE:YOU CAN READ THE STARTING AND ENDING INDEX FOR EACH METHOD USING BUFFEREDREADER OBJECT
		
		
		int startIndex=0;// starting index for  all prolems
		int endIndex=index;// the ending index for all problems
		
		//finding min of array of elements between range
		System.out.print("The minimum number is :");
		System.out.println(findMin(numbers,startIndex,endIndex));
		
		
		//to compute largest even element of array of elements between range
		System.out.print("The Largest Even Integer in the Sequence: ");
		System.out.println(computeLargestEven(numbers,startIndex,endIndex));
	
		//to count the odd element of array of elements between range
		System.out.print("Count of Odd numbers in sequence: ");
		System.out.println(countOddNumbers(numbers,startIndex,endIndex));
		
		
		
		//to compute largest even element of array of elements between range
		int firstNumber=5;
		System.out.print("Sum of numbers that are greater than 5 is ");
		System.out.println(sumOfNumbersLargerThanFirst(numbers,startIndex,endIndex,firstNumber));		
		
	}
	
	
	//to find the minimum element in range in array
	public static int findMin(int[]numbers,int startIndex,int endIndex)
	{
		if(startIndex==endIndex)//if start index reaches the end return that value
		{
			return numbers[startIndex];
		}
		else
		{
			return Math.min(numbers[startIndex], findMin(numbers,startIndex+1,endIndex));//return the minimum of current value and value return by calling 
																						//function recursively
		}
	}
	
	//Method to count the odd number in array
	public static int countOddNumbers(int[]numbers,int startIndex,int endIndex)
	{
		if (startIndex == endIndex)//if starting index reaches the end  
		{
	        if (numbers[startIndex] % 2 != 0) //if that number is odd return 1 and if not return 0
	        {
	            return 1;
	        } else {
	            return 0;
	        }
	    } else {
	        return countOddNumbers(numbers, startIndex, endIndex - 1)+countOddNumbers(numbers, endIndex, endIndex );//recursively call for next value
	    }
	}

	//Method to compute the largest even number
	public static int computeLargestEven(int[] elements, int startIndex, int endIndex)
	{
		if(startIndex==endIndex)//if starting index reaches the end  
		{
			if(elements[startIndex]%2==0)
			{
				return elements[startIndex];
			}
		}
		return Math.max(elements[startIndex], computeLargestEven(elements,startIndex+1,endIndex));//return the end index value   
	}

	//Method to find sum of numbers larger than given number
	public static int sumOfNumbersLargerThanFirst(int[] elements, int startIndex, int endIndex, int firstNumber)
	{
		if(startIndex==endIndex)//if start index reaches to end index
		{
			if(elements[startIndex]>firstNumber)//if value at that index is greater than first number return that number
			{
				return elements[startIndex];
			}
			else
			{
				return 0;//else return 0
			}
		}
	return sumOfNumbersLargerThanFirst(elements, startIndex, endIndex - 1,firstNumber)+sumOfNumbersLargerThanFirst(elements, endIndex, endIndex,firstNumber );
		//add the number which is greater than first number and compute next greater number and add them
	}
}
