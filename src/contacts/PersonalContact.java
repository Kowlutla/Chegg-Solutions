package contacts;

/*this class Encapsulates the data that represents the
 * personal contact information
 * */
public class PersonalContact {
	private String name;
	private String email;
	private String phone;
	//constructor initializes the all variables
	public PersonalContact(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	//constructor initializes the name and phone 
	public PersonalContact(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	//this method returns the contact name
	public String getName() {
		return name;
	}
	//this method returns the contact email
	public String getEmail() {
		return email;
	}
	//this method returns the contact phone
	public String getPhone() {
		return phone;
	}
	
	/*returns a string representation of this object in form
	 *name, phone, email
	 */
	public String toString()
	{
		return name+", "+phone+", "+email;
	}
}
