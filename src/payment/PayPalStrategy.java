package payment;

public class PayPalStrategy implements PaymentStrategy
{
	//attributes of pay pal
	private String username;
	private String password;
	
	//constructor using variables
	public PayPalStrategy(String username, String password)
	{
		this.username = username;
		this.password = password;
	} 
	
	//Method to pay price
	public void pay(double price)
	{
		System.out.println("\nItem purchased in paypal strategy \nAmount paid to user is: "+price);
		System.out.println("Paypal details: ");
		System.out.println("User Name: "+username);
		System.out.println("Password: "+password);
	}
}
