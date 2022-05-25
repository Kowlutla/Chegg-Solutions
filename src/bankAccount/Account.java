package bankAccount;

public class Account {
	
	//two private members of Account
	private String username;
	private double balance;
	
	//constructor method requires owner name as parameter
	public Account(String username)
	{
		this.username=username;
		this.balance=0;
		
	}

	//Getter method for balance
	public double getBalance() {
		return balance;
	}

	//Setter method for username
	public void setUsername(String username) {
		this.username = username;
	}

	//Method to deposite amount
	public void deposit(double n)
	{
		this.balance=this.balance+n;
	}
	
	//Method to with draw amount
	public boolean withdraw(double n)
	{
		//if entered amount is more than current balance return false
		if(n>this.balance)
		{
			return false;
		}
		//Otherwise remove the amount withdram from the balance and return true
		else
		{
			this.balance=this.balance-n;
			return true;
		}
	}
	
	//static method to display the menu
	public static void displayMenu()
	{
		System.out.println("-------------Options Menu----------------");
		System.out.println("\nbalance--to check balance");
		System.out.println("\ndeposite--to deposite money");
		System.out.println("\nwithdraw--to withdraw money");
		System.out.println("\nexit--to exit the banking system\n");
		System.out.println("-----------------------------------------");
		
	}
}
