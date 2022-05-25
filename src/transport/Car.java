
package transport;

public class Car extends Vehicle
{
	private int mileage;
	//Constructor
	public Car(int id,boolean rented,int mileage)
	{
		super(id,rented);
		this.mileage=mileage;
	}
	//Copy Constructor
	public Car(Car car)
	{
		super(car);
		this.mileage=car.mileage;
	}
	//Method to return the mileage
	public int getMileage()
	{
		return mileage;
	}
	@Override
	//Method to calculate the rental amount of car
	public double calRentalAmount() {
		
		//if car is not rented return 0
		if(!rented)
		{
			return 0;
		}
		//if car is rented return the calculated rented amount
		else
		{
			return mileage/10*100;
		}	
	}
	//Method print the attributes of Car
	public void display()
	{
		System.out.println("Id: "+getId());
		System.out.println("Is Rented: "+rented);
		System.out.println("Mileage: "+mileage);
		System.out.println("Rental Amount: "+calRentalAmount());
	}
}
