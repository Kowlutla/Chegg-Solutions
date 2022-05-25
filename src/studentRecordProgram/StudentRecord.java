package studentRecordProgram;

import java.util.ArrayList;

public class StudentRecord {
	Student student;
	ArrayList<Course>courses;//list to store the courses of student
	
	//Constructor that accepts Student and create the new list for student courses
	public StudentRecord(Student student)
	{
		this.student=student;
		courses=new ArrayList<Course>();
	}
	
	//Method to add the course to the list
	public void addCourse(Course course)
	{
		courses.add(course);
	}
	
	//Method to get the course which student have minimum gpa
	public Course getMinGpa()
	{
		if(courses.size()==0)//if no courses are in courses list we can't get the minimum gpa
		{
			System.out.println("No Courses under "+student);
			return null;
		}
		double min_gpa=courses.get(0).getGpa();
		Course min_gpa_course=courses.get(0);
		
		for(int i=1;i<courses.size();i++)
		{
			if(courses.get(i).getGpa()<min_gpa)
			{
				min_gpa=courses.get(i).getGpa();
				min_gpa_course=courses.get(i);
			}
		}
		return min_gpa_course;
	}	
	
	//Method to display the records of student record
	public void displayRecord()
	{
		if(courses.size()==0)
		{
			System.out.println("No Course in list ");
		}
		else
		{
			System.out.println("Student record for "+student);
			System.out.println("Code\t\tName\t\t\tGPA");
			for(Course c:courses)
			{
				System.out.println(c.getCode()+"\t"+c.getName()+"\t"+c.getGpa());
			}
		}
	}
}
