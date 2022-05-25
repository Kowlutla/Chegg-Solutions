
package personInheritence;

public class Person {
	//Attributes of Person 
	String FirstName;
	String LastName;
	String Address;
	String Email;
	
	//default constructor which initializes all attributes to their default values
	public Person()
	{
		this.FirstName=null;
		this.LastName=null;
		this.Address=null;
		this.Email=null;
	}
	//constructor of person
	public Person(String firstName, String lastName, String address, String email) {
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		Email = email;
	}
	//Method to display the properties
	public void display()
	{
		System.out.println("First Name:  "+this.FirstName);
		System.out.println("Last Name:  "+this.LastName);
		System.out.println("Address:  "+this.Address);
		System.out.println("Email:  "+this.Email);
	}
}
