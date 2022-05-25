import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CplusToJava {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		//length of arrays
		int s1,s2;
		s1=sc.nextInt();
		s2=sc.nextInt();
		//declaring arrays
		Integer array1[]=new Integer[s1];
		Integer array2[]=new Integer[s2];
		
		//reading values into array1
		for(int i=0;i<s1;i++)
		{
			int temp=sc.nextInt();
			array1[i]=temp;
		}
		
		//reading values into array2
		for(int i=0;i<s2;i++)
		{
			int temp=sc.nextInt();
			array2[i]=temp;
		}
		
		//sorting arrays in descending order
		Arrays.sort(array1,Collections.reverseOrder());
		Arrays.sort(array2,Collections.reverseOrder());
		
		//for each element in array1
		for(int i:array1)
		{
			//decrement elements of array2 to from 0 to current element of array1
			for(int j=0;j<i;j++)
			{
				array2[j]--;
			}
			//sort array2 in descending order
			Arrays.sort(array2,Collections.reverseOrder());
		}
		
		
		//check all values in array two are 0 or not
		boolean works=true;
		for(int i:array2)
		{
			works&=(i==0);
		}
		
		//if all values of array2 are 0
		if(works)
		{
			System.out.println("Yes");
		}
		//if all elements are not 0's
		else
		{
			System.out.println("No");
		}
		sc.close();
	}

}
