package teaching;

import java.util.ArrayList;

public class TaibahCS {

	public static void main(String[] args) {
		
		ArrayList<Course>list1=new ArrayList<Course>();
		list1.add(new Course("Java101","Object Oriented",25));
		list1.add(new Course("C102","C Programming",17));
		list1.add(new Course("DLD53","Digital Logic and Design",15));
		list1.add(new Course("OS103","Operating System",10));
		//creating object of TA
		FacultyMember ta=new TA("TAId1","Sudeepthi","Maruvada",34,"CSE",5,5,list1);
		
		System.out.println(ta);
		
		ArrayList<Course>list2=new ArrayList<Course>();
		list2.add(new Course("DBMS201","DataBase Management",15));
		list2.add(new Course("CNS203","Cryptography",18));
		list2.add(new Course("SE204","Software Engineering",20));
		//creating object of Lecturer
		Lecturers lecturer=new Lecturers("LecId1","Kowlutla","Mangali",2,"CSE",3,5,list2);
		
		System.out.println(lecturer);
		
		//passing above two objects to Convener class
		
		Convener convener=new Convener(new Course("Java101","Object Oriented",25),ta);
		System.out.println(convener);

	}

}
