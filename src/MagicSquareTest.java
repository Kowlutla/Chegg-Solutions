import java.util.Scanner;

public class MagicSquareTest {

	public static void main(String[] args) {
		
		//int array[][]=new int[5][5];
		Scanner sc=new Scanner(System.in);
		System.out.print("M: ");
		int m=sc.nextInt();
		System.out.print("N: ");
		int n=sc.nextInt();
		int array[][]=new int[m][n];
		System.out.println("Enter elements: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(MagicSquare.isItSquare(array));
		
		int sum=MagicSquare.sumDiagonal(array, true);
		System.out.println(sum);
		
		System.out.println(MagicSquare.sumRowI(array, 2));
		
		System.out.println(MagicSquare.sumColumnJ(array, 2));
		System.out.println(MagicSquare.hasNumber(array, 45));
		sc.close();

	}

}
class MagicSquare
{
	
	//to check 2D array is square or not
	public static boolean isItSquare(int[][] array)
	{
		int no_of_rows=array.length;//to find no of rows in array
		for(int i=0;i<no_of_rows;i++)
		{
			int cols_in_row=array[i].length; //to find the no of columns in each row
			if(cols_in_row!=no_of_rows)//if no of columns not equal to no of rows then it is not square
			{
				return false;
			}
		}
		return true;//if rows and columns are of same length array is square
	}
	
	
	
	
	//To find Diagonal Sum
	public static int sumDiagonal(int [][]array,boolean bool)
	{
		int diagonal_sum=0;
		if(bool==true) //if boolean value is true Upper left to lower Right
		{
			for(int i=0;i<array.length;i++)//to Move Upper to Lower
			{
				for(int j=0;j<array[i].length;j++) //To Move left to right
				{
					if(i==j) //to find the diagonal index
					{
						diagonal_sum+=array[i][j];
					}
				}
			}
		}
		else //if boolean value id false lower left to upper right
		{
			for(int i=array.length-1;i>=0;i--) //To move Lower to upper 
			{
				for(int j=0;j<array[i].length;j++) // To Move left to right
				{
					if(i==array.length-j-1)//to find diagonal index
					{
						diagonal_sum+=array[i][j];
					}
				}
			}
		}
		return diagonal_sum;//returning diagonal sum
	}
	

	//To find the sum of ith Row
	public static int sumRowI(int array[][],int i)
	{
		
		//Assuming Rows starts from 0.
		
		int  row_sum=0;
		int row_array[]=array[i];//to get array of ith row
		for(int k=0;k<row_array.length;k++)
		{
			row_sum+=row_array[k];
		}
		return row_sum; //returning sum of ith row elements
	}
	
	
	//To find the sum of Values of jth Columns
	public static int sumColumnJ(int array[][],int j)
	{
		
		//Assuming Columns starts from 0
		int col_sum=0;
		for(int row=0;row<array.length;row++)
		{
			for(int col=0;col<array[row].length;col++)
			{
				if(col==j)//Column equals to given column
				{
					col_sum+=array[row][col];
				}
			}
		}
		return col_sum; //return the sum of jth columns elements
	}
	
	
	//to check the given value present in twoD array or not
	public static boolean hasNumber(int array[][],int value)
	{
		//traversing each element
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				if(array[i][j]==value)//if value found return true
				{
					return true;
				}
			}
		}
		return false;//if value not found return false
	}
}








