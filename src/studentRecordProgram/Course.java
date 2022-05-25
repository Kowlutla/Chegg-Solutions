package studentRecordProgram;

public class Course {
	//variables of Course
	private String code;
	private String name;
	private double gpa;
	//Course Constructor which accepts Course code,Course name,Course Gpa
	public Course(String code, String name, double gpa) 
	{
		this.code = code;
		this.name = name;
		this.gpa = gpa;
	}
	public String getCode() //Method to get the course code
	{
		return code;
	}
	public void setCode(String code) //Method to set the course code
	{
		this.code = code;
	}
	public String getName()//Method to get the course name
	{
		return name;
	}
	public void setName(String name)//Method to set the course name
	{
		this.name = name;
	}
	public double getGpa()  //Method to get the course Gpa
	{
		return gpa;
	}
	public void setGpa(double gpa)  //Method to set the course Gpa
	{
		this.gpa = gpa;
	}
	
	public String toString()
	{
		return code+" "+name+" "+gpa;
	}
}
