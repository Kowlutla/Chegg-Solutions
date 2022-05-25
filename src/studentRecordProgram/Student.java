package studentRecordProgram;

public class Student {
	private int id;//variable id
	private String name;//variable name
	public Student(int id,String name)//Constructor which accepts student id and name
	{
		this.id=id;
		this.name=name;
	}
	public int getId() //Method to get Student Id
	{
		return id;
	}
	public void setId(int id) //Method to set Student Id
	{
		this.id = id;
	}
	public String getName() //Method to get Student Name
	{
		return name;
	}
	public void setName(String name) //Method to Set Student Name
	{
		this.name = name;
	}
	public String toString()
	{
		return id+" "+name;
	}
}
