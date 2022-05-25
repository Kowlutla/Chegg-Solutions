package teaching;

public class Course {
	
	String courseCode;
	String courseName;
	int creditHours;
	//constructor for course
	public Course(String courseCode, String courseName, int creditHours) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.creditHours = creditHours;
	}
	
	//toString method which return the course object in string form
	public String toString() {
		return "Course [" + courseCode +" " + courseName + creditHours + "]";
	}
	
	
	

}
