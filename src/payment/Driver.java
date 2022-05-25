package payment;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//asking user to enter upcCode and price values
		System.out.print("Enter upcCode value: ");
		String upcCode=sc.next();
		System.out.print("Enter Price: ");
		double price=sc.nextDouble();
		
		//creating ItemPuechase object using above values
		ItemPurchase ip=new ItemPurchase(upcCode,price);
		
		System.out.println("Choose Payment type\n1.for credit card\n2.for pay pal");
		System.out.print("Your Choice: ");
		int choice=sc.nextInt();
		//if choice is credit card strategy
		if(choice==1)
		{
			System.out.println("******You choosed Credit card strategy*******");
			//asking to enter credit card details
			System.out.print("Enter Name: ");
			String name=sc.next();
			System.out.print("Enter card number: ");
			int cardNumber=sc.nextInt();
			System.out.print("Enter Expiry: ");
			String expiry=sc.next();
			System.out.print("Enter CVV: ");
			String cvv=sc.next();
			//creating credit card object using above details
			CreditCardStrategy cs=new CreditCardStrategy(name,cardNumber,expiry,cvv);
			//calling payment method by passing credit card object to makePayment() method
			ip.makePayment(cs);
		}
		//if choice is pay pal strategy
		else if(choice==2)
		{
			System.out.println("******You choosed Paypal strategy*******");
			//asking user to enter pay pal details
			System.out.print("Enter username: ");
			String username=sc.next();
			System.out.print("Enter password: ");
			String password=sc.next();
			//creating pay pal object by passing above details
			PayPalStrategy ps=new PayPalStrategy(username,password);
			//calling payment method by passing pay pal object to makePayment() method
			ip.makePayment(ps);
		}
	}
}
