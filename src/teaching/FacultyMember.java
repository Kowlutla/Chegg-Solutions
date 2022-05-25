package teaching;

public class FacultyMember {
	
	String facultyId;
	String firstName;
	String lastName;
	int acadamicRank;
	String acadamicSpecialization;
	//constructor for facultMember class
	public FacultyMember(String facultyId, String firstName, String lastName, int acadamicRank,
			String acadamicSpecialization) {
		this.facultyId = facultyId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.acadamicRank = acadamicRank;
		this.acadamicSpecialization = acadamicSpecialization;
	}
	@Override
	public String toString() {
		return "FacultyMember ["+ facultyId +" " + firstName +" "+ lastName
				+" "+  acadamicRank +" "+ acadamicSpecialization + "]";
	}
	
	
	
	

}
