
public class Student 
{
	//Private Data Members
	private String name;
	private int points;
	
	//Public Static Data Members 
	public static int studentCount;
	
	//Constructor
	public Student(String nameArg)
	{
		//set (name) to (nameArg) 
		this.name=nameArg;
		//set (points) to 0
		this.points=0;
		//increment (studentCount) by 1
		studentCount+=1;
	}
 
	//Public Methods
	public String getName()
	{
		//return the data member (name)
		return this.name;
	}
	
	public int getPoints()
	{
		//return the data member (points)
		return this.points;
	}
	
	public void setPoints(int pointsArg)
	{
		//Set (points) to (pointsArg)
		this.points=pointsArg;
	}
	
	public int tutorStudent(Student otherStudent)
	{
		//increment (otherStudent')s (points) by (Hint: use the setPoints method)
		int currentpoints=otherStudent.getPoints();
		otherStudent.setPoints(currentpoints+1);
		//return (otherStudent)'s (points) after increment
		return otherStudent.getPoints();
	}
}
