import java.util.Scanner;

public class XmasTree {
	
	 public static void main(String[] args) {
		 int number; 
		 Scanner scanner = new Scanner(System.in); 
		 System.out.println("Please Enter The Desired Number Of Rows :");
		 number = scanner.nextInt(); 
		 for (int i = 0; i < number; i++) 
		 { 
			 for (int j = number - i; j > 1; j--)
			 { 
				 System.out.print(" "); 
			 }
			 for (int j = 0; j <= i; j++) 
			 { 
				 System.out.print("* "); 
			 } 
			 System.out.println(); 
		}
		 
		for(int i = 1;i <= number;i++)
		{
		     for(int j = number-3;j >= 1;j--)
		     {
		      
		          System.out.print(" ");
		     }
		     for(int k= 1;k <= number;k++)
		     {
		          System.out.print("* ");
		     }
		     System.out.println();
		 }
	 }

}
