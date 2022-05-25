package bankAccount;
import java.util.Scanner;
public class  Bank{
	public static void main(String args[])
	{
		//printing welcome message
		System.out.println("****Welcome to Etown Bank****");

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a username to open an account: ");
		String username=sc.nextLine();//asking user name
		Account ac=new Account(username);//create account object with user name
		//display Menu
		Account.displayMenu();
		String option;
		while(true)
		{
			//asking to enter an optiopn from menu
			System.out.print("\nplease enter an option: ");
			option=sc.next().toLowerCase();
			
			//if option is balance then print the balance
			if( option.equals("balance"))
			{
				System.out.print("your account balance is $");
				System.out.format("%.2f",ac.getBalance());//to print upto two decimals
				System.out.println();
			}
			//if option is deposit then deposit amount to account 
			else if(option.equals("deposit"))
			{
				System.out.print("How much would you like to deposite?");
				double amount=sc.nextDouble();
				ac.deposit(amount);
				System.out.print("You have successfully deposited $");
				System.out.format("%.2f", amount);//to print upto two decimals
				System.out.println();
			}
			
			//if option is withdraw
			else if(option.equals( "withdraw"))
			{
				System.out.print("How much would you like to withdraw?");
				double amount=sc.nextDouble();
				//if successfully withdraw amount 
				if(ac.withdraw(amount))
				{
					System.out.print("You have successfully withdraw $");
					System.out.format("%.2f", amount);//to print upto two decimals
					System.out.println();
				}
				//if withdraw is not possible because not having enough balance
				else
				{
					System.out.println("Error: Your account doesn't have enough money to draw!");
				}
			}
			//if option is exit then exit from loop
			else if( option.equals("exit"))
			{
				break;
			}
			//if enter option is invalid
			else 
			{
				System.out.println("Error: Invalid Option!");
			}
		}
		
		//printing thank you message
		System.out.println("Thank you for choosing Etown Bank ");
		sc.close();
	}
}
