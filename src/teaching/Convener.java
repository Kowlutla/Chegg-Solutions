package teaching;

public class Convener 
{
	Course course;
	FacultyMember member;//member can be either TA or Lecturers
	public Convener(Course course, FacultyMember member) {
		this.course = course;
		this.member = member;
	}

	

	@Override
	public String toString() {
		return "Convener [" + course +" " + member+"]" ;
	}
	
	
	
	
	
	
}
