
package transport;

public class Truck extends Vehicle
{
	//stores the load of truck
	private double load;
	//Constructor
	public Truck(int id,boolean rented,int load)
	{
		super(id,rented);
		this.load=load;
	}
	
	//Copy Constructor
	public Truck(Truck truck)
	{
		super(truck);
		this.load=truck.load;
	}
	//Method to get Load
	public double getLoad()
	{
		return load;
	}
	@Override
	//Method to calculate the rental amount of Truck
	public double calRentalAmount() 
	{
		if(!rented)
		{
			this.rentalAmount=0;
		}
		else
		{
			this.rentalAmount=load*150-20000;
		}
		return rentalAmount;
	}
	//Method print the attributes of Truck
	public void display()
	{
		System.out.println("Id: "+getId());
		System.out.println("Is Rented: "+rented);
		System.out.println("Load: "+load);
		System.out.println("Rental Amount: "+calRentalAmount());	
	}
}
