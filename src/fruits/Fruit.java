package fruits;

public class Fruit implements Comparable<Fruit>
{
	//attributes
	protected String name=null;
	protected String colour=null;
	protected double weight=0;
	
	//Constructor
	public Fruit(String name, String colour, double weight) {
		this.name = name;
		this.colour = colour;
		this.weight = weight;
	}
	//Method to get Fruit Name
	public String getName() 
	{
		return name;
	}
	//Method to get Fruit colour
	public String getColour() 
	{
		return colour;
	}
	
	//Method to get Fruit Weight
	public double getWeight() 
	{
		return weight;
	}
	//Method to set Fruit Name
	public void setName(String name) 
	{
		this.name = name;
	}
	//Method to set Fruit colour
	public void setColour(String colour) {
		this.colour = colour;
	}
	//Method to set Fruit weight
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//method to return the object in string form
	public String toString() 
	{
		String fruitDetails=name+" (colour: "+colour+", Weight: "+weight+")";
		return fruitDetails;
	}


	//CompareTo Method which is useful for sorting fruits list based on fruit weight 
	public int compareTo(Fruit fruit) {
		
		//if weight of the fruits are equal return 0
		if(this.weight==fruit.weight)
		{
			return 0;
		}
		//if weight of current fruit is greater return 1
		else if(this.weight>fruit.weight)
		{
			return 1;
		}
		//Otherwise return -1
		else
		{
			return -1;
		}
		
	}
}
