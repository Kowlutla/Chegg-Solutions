
package personInheritence;
public class Employee extends Person
{
	//Additional Attributes of employee
	int employeeId;
	double salary;
	
	//Employee constructor which takes no parameters.
	// All properties are initialized to their default values
	public Employee()
	{
		super();
		this.employeeId=0;
		this.salary=0;
	}
	
	//Employee constructor which takes all properties as parameters.
	public Employee(int employeeId,String firstName,String lastName,String address,String email,double salary)
	{
		super(firstName,lastName,address,email);//calling super constructor
		this.employeeId=employeeId;
		this.salary=salary;
	}
	
	//Method to display the all properties of employee
	public void display()
	{
		System.out.println("All Properties of Employee: ");
		System.out.println("Employee Id:  "+this.employeeId);
		super.display();//calling super method to print properties which contain super class also
		System.out.println("Salary:  "+this.salary);
	}
	//Main Method
	public static void main(String args[])
	{
		System.out.println();
		Employee e1;//reference to employee
		//instantiate a Employee object
		e1=new Employee(2323,"Bill","Clinton","Marietta","bc@msn.com",43000.0);
		//printing the all properties of employee by calling display method
		e1.display();	
	}
}
