
package transport;
public abstract class Vehicle 
{
	//Attributes
	private int id;
	protected boolean rented;
	protected double rentalAmount;
	
	//Constructor
	public Vehicle(int id, boolean rented) {
		this.id = id;
		this.rented = rented;
	}
	
	//Copy Constructor
	public Vehicle(Vehicle v)
	{
		this.id=v.id;
		this.rented=v.rented;
		this.rentalAmount=v.rentalAmount;
	}
	
	//Method to return the id of vehicle
	public int getId()
	{
		//if id is negative throw exception
		try {
			if(this.id<0)
			{
				throw new IllegalArgumentException();
			}
			//if not id not negative return id
			else
			{
				return id;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			return -1;
		}
	}
	//Abstract method to calculate the rental amount for child classes
	public abstract double calRentalAmount();
	
}
