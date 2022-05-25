package truck;
import java.util.ArrayList;
public class Truck {
	// instance variables
	private String manufacturer;
	private String model;
	private int year;
	// constructors
	public Truck() 
	{
	}
	public Truck(String manufacturer, String model, int year) 
	{
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
	}
	// accessors
	public String getmanufacturer() {
		return manufacturer;
	}
	public String getmodel() {
		return model;
	}
	public int getyear() {
		return year;
	}
	
	// mutators
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public String toString() {
		return "manufacturer: " + manufacturer + ", model: " + model + ", year: " + year;
	}

	// create a list given two parallel arrays of Truck and models and year
	public static ArrayList<Truck> createList(String[] manufacturer, String[] model, int[] year)
	{
		ArrayList<Truck> tp = new ArrayList<Truck>();
		for (int i = 0; i < manufacturer.length; i++) 
		{
			if (i >= model.length)
			{
				System.out.println("Error! model array index out of bounds.");
				
			}
			else if (i >= year.length)
			{
				System.out.println("Error! year array index out of bounds.");
			}
			else
			{
				tp.add(new Truck(manufacturer[i], model[i], year[i]));
			}
		}
		return tp;
	}
	
	
	
	// Main method for unit test
	public static void main(String[] args)
	{
		final String[] manufacturers = {
		"Ford", "Ford", "Toyota", "GMC", "Honda", "Chevrolet" };
		final String[] models = {
		"F150", "F250", "Tundra", "Sierra", "Ridgeline", "Silverado" };
		final int[] years = {
		2010, 2012, 2014, 2016, 2017, 2018 };
		System.out.println("Original list: ");
		ArrayList<Truck> truckList = Truck.createList(manufacturers, models, years);
		for (Truck t1 : truckList)
		{
			System.out.println(t1);
		}
		
		System.out.println("\nNew List: ");
		Truck t = truckList.get(4); // should be Honda
		t.setYear(2015); // new year
		truckList.set(4, t); // change the truck in the list
		
		for (Truck t1 : truckList)
		{
			System.out.println(t1);
		}
	}
}
