package payment;

public class ItemPurchase {
	
	//attributes of item
	private String upcCode;
	private double price;
	
	//constructor using item class variables 
	public ItemPurchase(String upcCode, double price) 
	{
		this.upcCode = upcCode;
		this.price = price;
	} 
	
	//Method to make payment which act as abstract type to pay 
	//for pay pal and credit card strategies
	public void makePayment(PaymentStrategy ps)
	{
		ps.pay(price);
	}
}
