package studentList;

public class Student {
	
	//attributes
	String lastName;
	double gpa;
	int age;
	//Constructor
	public Student(String lastName, double gpa, int age) {
		this.lastName = lastName;
		this.gpa = gpa;
		this.age = age;
	}
	//toString method which returns the student object in the form of string
	public String toString() {
		return "Student ["+ lastName +"\t" + gpa + "\t"+ age + "]";
	}
	//Method to return the gpa
	public double getGpa() {
		return gpa;
	}

}
