package personInheritence;

public class Student extends Person
{
	//Additional attributes of student
	int idNumber;
	boolean major;
	double gpa;
	//default constructor
	public Student()
	{
		super();
		this.idNumber=0;
		this.major=false;
		this.gpa=0.0;
	}
	//Student constructor which takes all properties as parameters.
	public Student(int idNumber,String firstName, String lastName, String address, String email,boolean major,double gpa) {
		super(firstName, lastName, address, email);
		this.idNumber=idNumber;
		this.major=major;
		this.gpa=gpa;
		// TODO Auto-generated constructor stub
	}
	//Method to display the all properties of student
	public void display()
	{
		System.out.println("All Properties of Student: ");
		System.out.println("Id Number: "+this.idNumber);
		super.display();//calling super method to print properties which contain super class also
		System.out.println("Is Major: "+this.major);
		System.out.println("GPA: "+this.gpa);
	}
	//Main Method
	public static void main(String args[])
	{
		System.out.println();
		Student s1;//reference to student
		//instantiate a Student object
		s1=new Student(101,"Sudeepthi","Maruvada","Kurnool","Deepu@gmail.com",true,8.9);
		
		//printing the all properties of student s1 by calling display method
		s1.display();
	}
}
