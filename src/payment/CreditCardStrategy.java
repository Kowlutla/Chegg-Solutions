package payment;

public class CreditCardStrategy implements PaymentStrategy
{
	//Attributes of credit card 
	private String name;
	private int cardNumber;
	private String expiry;
	private String cvv;
	
	//Constructor using variables
	public CreditCardStrategy(String name, int cardNumber, String expiry, String cvv) 
	{
		this.name = name;
		this.cardNumber = cardNumber;
		this.expiry = expiry;
		this.cvv = cvv;
	}
	
	//Method to pay price
	public void pay(double price)
	{
		System.out.println("\nItem purchased in Credit Card strategy \nAmount paid to user is: "+price);
		System.out.println("Credit Card Details: ");
		System.out.println("Name: "+name);
		System.out.println("card number: "+cardNumber);
		System.out.println("Expiry: "+expiry);
		System.out.println("CVV: "+cvv);
	}
}
