package studentRecordProgram;

//Driver class
public class StudentRecordTest {

	
	public static void main(String[] args) {
		
		Student s=new Student(123,"Ali");//creating student object
		StudentRecord sr=new StudentRecord(s);//creating studentRecord object by passing student object
		//adding courses to the courses list
		sr.addCourse(new Course("CMPS 151","Programming Concepts",3.4));
		sr.addCourse(new Course("CMPS 251","Object Oriented ",4.0));
		sr.addCourse(new Course("CMPS 303","Data Structure  ",3.0));
		sr.addCourse(new Course("CMPS 351","Data Base       ",3.5));
		//printing student record
		sr.displayRecord();
		//printing course which have minimum gpa
		System.out.println("Course with the lowest GPA "+sr.getMinGpa().getCode());

	}

}
