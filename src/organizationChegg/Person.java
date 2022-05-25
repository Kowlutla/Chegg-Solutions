package organizationChegg;

public class Person {
	int id;
	String name;
	String address;
	String mobileNumber;
	String email;
	double salary;
	public Person(int id, String name, String address, String mobileNumber, String email, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", salary=" + salary + "]";
	}
	
	
	

}
