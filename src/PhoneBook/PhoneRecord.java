package PhoneBook;


//Phone record Class
public class PhoneRecord {

	//Variables in Phone record class
	public String firstName;
	public String lastName;
	public String number;
	
	//Constructor which simply constructs the string
	public PhoneRecord()
	{
		this.firstName=null;
		this.lastName=null;
		this.number=null;
	}
	
	
	//Constructor accepts values for first name, last name and phone number.
	public PhoneRecord(String firstName,String lastName,String number)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.number=number;
		
	}
}
