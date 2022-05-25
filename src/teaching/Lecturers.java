package teaching;

import java.util.ArrayList;

public class Lecturers extends FacultyMember
{


	int maxNoOfCourses;
	int quotaOfCreditHours;
	int currentCourses=0;
	ArrayList<Course>assignedCourse;//to hold assigned courses of lecturer
	public Lecturers(String facultyId, String firstName, String lastName, int acadamicRank,
			String acadamicSpecialization, int maxNoOfCourses, int quotaOfCreditHours
			,ArrayList<Course>assignedCourse) {
		super(facultyId, firstName, lastName, acadamicRank, acadamicSpecialization);
		this.maxNoOfCourses = maxNoOfCourses;
		this.quotaOfCreditHours = quotaOfCreditHours;
		this.assignedCourse = assignedCourse;
	}
	
	public void addCourse(Course course)
	{
		if(currentCourses==maxNoOfCourses)
		{
			System.out.println("Maximum No of Courses is reached");
		}
		else
		{
			assignedCourse.add(course);
			currentCourses++;
		}
	}
	public String toString()
	{
		return "Lecturer[ "+maxNoOfCourses+" "+quotaOfCreditHours+" Assigned Courses:\n"+assignedCourse.toString();
	}
}
