
public class Shapes {
	//Method to print Hollow square  
	public static void squareHollow(int n)
	{
		// outer loop to handle number of rows 
        //  n in this case 
		for(int i=1;i<=n;i++)
		{
			// Inner loop to handle number of Columns 
	        //  n in this case 
			for(int j=1;j<=n;j++)
			{
				//print * at 1st row,nth row,1st col and nth col
				if(i==1 || j==1 || i==n || j==n)
				{
					System.out.print(" * ");
				}
				else//print space
				{
					System.out.print("   ");
				}
			}
			//print new line to print in next row
			System.out.println();	
		}
	}
	
	//Method to print upper left triangle
	public static void triangleUL(int n)
	{
		// outer loop to handle number of rows 
        //  n in this case 
		for(int i=n;i>0;i--)
		{
			//  inner loop to handle number of columns 
            //  values changing according to outer loop   
			for(int j=1;j<=i;j++)
			{
				//printing star
				System.out.print("*");
			}
			//print new line to print in next row
			System.out.println();
		}
	}
	
	//Method to print upper right triangle
	public static void triangleUR(int n)
	{
		// outer loop to handle number of rows 
        //  n in this case 
		for (int i= n; i>= 1; i--)
	    {
			//Inner loop to print spaces 
			//  values changing according to outer loop 
			for (int j=n; j>i;j--)
			{
				System.out.print(" ");
			}
			//Inner loop to print Start * 
			// values changing according to outer loop 
			for (int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			//print new line to print in next row
			System.out.println();
	    }
	}

}
