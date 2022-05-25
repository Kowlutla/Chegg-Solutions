package searchMethods;

import java.io.*;
import java.util.*;

public class SearchComparisions {

	public static void main(String[] args) throws IOException {
		//Considering file contain any string type
		String data[]=new String[100];//data structure to store data in file
		int count=0;//shows how many string objects present in file
		//Reading data from file
		try 
		{
			File file=new File("data.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line;
			
			while((line=br.readLine())!=null)
			{
				data[count++]=line.trim().toLowerCase();//for case sensitivity
			}
		} 
		catch (FileNotFoundException e) {	
			System.out.println("File Not Found");
		}
		
		System.out.println("Sequential search data of file: ");
		long startTime=System.nanoTime();
		String searchData="sudeepthi";
		boolean isPresent=seqenctialSearchStr(data,searchData,count);
		System.out.println("sudeepthi present or not: "+isPresent);
		long endTime=System.nanoTime();
		System.out.println("Time Taken for Sequential Search: "+(endTime-startTime)+" nano seconds");
		
		System.out.println("Binary search of data of file: ");
		startTime=System.nanoTime();
		isPresent=binarySearchStr(data,count,searchData);
		System.out.println("sudeepthi is Present or not : "+isPresent);
		endTime=System.nanoTime();
		System.out.println("Time Taken for Binary Search Search: "+(endTime-startTime)+" nano seconds");
		
		//searching for random number 
		Random rand=new Random();
		int randomNumbers[]=new int[10000];
		for(int i=0;i<10000;i++)
		{
			randomNumbers[i++]=rand.nextInt(100000);//storing 10000 elements random numbers
		}
		
		System.out.print("Enter number to search: ");
		int searchNum=new Scanner(System.in).nextInt();
		
		//calculating time taken by sequential search
		startTime=System.nanoTime();
		isPresent=seqenctialSearchNumber(randomNumbers,searchNum);
		System.out.println(searchNum+" present : "+isPresent);
		endTime=System.nanoTime();
		System.out.println("Time taken by sequential search of random numbers: "+(endTime-startTime)+" nano seconds");
		
		//calculating time taken by binary search
		Arrays.parallelSort(randomNumbers);
		startTime=System.nanoTime();
		isPresent=binarySearch(randomNumbers,0,10000,searchNum);
		System.out.println(searchNum+" present : "+isPresent);
		endTime=System.nanoTime();
		System.out.println("Time taken by Binary search of random numbers: "+(endTime-startTime)+" nano seconds");
	}



	//Method to Search data in file Sequential search
	private static boolean seqenctialSearchStr(String[] data, String searchData,int length) {
		
		for(int i=0;i<length;i++)
		{
			if(data[i].equalsIgnoreCase(searchData))
			{
				return true;
			}
		}
		return false;//if no element matched return false;
	}
	//Binary Search to search data in file
	private static boolean binarySearchStr(String[] data, int length,String searchData) {
		 int l = 0, r =length - 1; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	            int res = searchData.compareTo(data[m]);   
	            if (res == 0)  // Check if x is present at mid 
	                return true; 
	            if (res > 0) // If x greater, ignore left half 
	                l = m + 1; 
	            else // If x is smaller, ignore right half 
	                r = m - 1; 
	        } 
	        return false; 
	}
	//Method to search number Sequential search
	private static boolean seqenctialSearchNumber(int[] randomNumbers, int searchNum) {
		
		for(int i=0;i<randomNumbers.length;i++)//loop through each element 
		{
			if(randomNumbers[i]==searchNum)//if element found return true
			{
				return true;
			}
		}
		return false;//if no element matched return false;
	}
	//Method to search number in random integer array
	private static boolean binarySearch(int[] randomNumbers, int first, int last, int searchNum){
		if(first<=last)
		{
			int mid=(first+last)/2;
			if( randomNumbers[mid]==searchNum)// Check if x is present at mid 
			{
				return true;
			}
			if(searchNum< randomNumbers[mid])// If x lesser than mid , ignore right half 
			{
				return binarySearch( randomNumbers,first,mid-1,searchNum);
			}
			return binarySearch( randomNumbers,mid+1,last,searchNum);//else If greater than mid , ignore left half 
		}
		return false;
	}
}
	
