package binaryFile;
import java.util.*;
import java.io.*;
public class FileArrayDemo {

	public static void main(String[] args) throws Exception  {
		
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		while(!flag)
		{
			try
			{
				//Requests, and reads in the size of an int array called inputNumbers.
				System.out.print("Please enter the number of integers to enter: ");
				int n=sc.nextInt();
				//creates the array and requests and reads in the values of the array.
				int inputNumbers[]=new int[n];
				// creates an output array of the same size called outputNumbers.
				int outputNumbers[]=new int[n];
				//request and read in the name of an output file of type .dat
				System.out.println("Please enter the name of the .dat file you want to write to and then read from; ");
				String outputFile=sc.next();
				File file=new File(outputFile);
				
				//creates the array and requests and reads in the values of the array.
				System.out.println("Pleas enter "+n+" integers : ");
				for(int i=0;i<n;i++)
				{
					inputNumbers[i]=sc.nextInt();
				}
				//Call writeArray with references to the outputfile name and the array inputNumbers.
				FileArray.WriteFile(file, inputNumbers);
				//Call readArray with references to the outputfile name and the array outputNumbers.
				outputNumbers=FileArray.readArray(file, outputNumbers);
				//Print out the output file.
				System.out.println("The numbers read from the file are: ");
				for(int i=0;i<n;i++)
				{
					System.out.print(outputNumbers[i]+" ");
				}
				System.out.println();
				flag=true;
			}
			//Catch any InputMismatchException and print the trace. – In this case set the flag to true
			catch(InputMismatchException e)
			{
				flag=true;
				System.out.println("InputMismatch");
				e.printStackTrace();
				Thread.sleep(100);
				
			}
			//Catch ArrayIndexOutOfBoundsException and print the trace
			catch(ArrayIndexOutOfBoundsException e)
			{	
				e.printStackTrace();
				Thread.sleep(100);
				
			}
			//Catch NegativeArraySizeException and print the trace
			catch(NegativeArraySizeException e)
			{
				System.out.println("NegativeArraySizeException: ");
				e.printStackTrace();
				Thread.sleep(100);
			}
			//Catch any IOException and print the trace
			catch(IOException e)
			{
				e.printStackTrace();
				Thread.sleep(100);
			}
			
			finally
			{
				System.out.println("Program Loop Completed");
			}
		}
		sc.close();

	}

}
