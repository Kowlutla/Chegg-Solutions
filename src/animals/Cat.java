package animals;

public class Cat extends Animal
{
	private String breed;
	public Cat()
	{
		
	}
	
	public Cat(int age,String name,String breed)
	{
		super(age,name);
		this.breed=breed;
	}
	
	//toString method to return the cat object as string
	public String toString()
	{
		//super.toString()->method to invoke parent class toString method
		String s=super.toString();
		//add breed property to the string
		s=s+"Breed: "+breed;
		//return string
		return s;
	}
}
