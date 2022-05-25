package personInheritence;

public class Teller extends Person
{
	//Additional attributes of teller
	int hourlyWorked;
	String shift;
	//Employee constructor which takes no parameters.
	// All properties are initialized to their default values
	public Teller() {
		super();
		this.hourlyWorked=0;
		this.shift="day";
	
	}
	//Teller constructor which takes all properties as parameters.
	public Teller(String firstName, String lastName, String address, String email,int hourlyWorked,String shift)
	{
		super(firstName, lastName, address, email);
		this.hourlyWorked=hourlyWorked;
		this.shift=shift;
		// TODO Auto-generated constructor stub
	}
	//Method to display the all properties of teller
	public void display()
	{
		System.out.println("All properties of Teller : ");
		super.display();//calling super method to print properties which contain super class also
		System.out.println("Shift: "+this.shift);
		System.out.println("Hourly Worked: "+this.hourlyWorked);
		
	}
}
