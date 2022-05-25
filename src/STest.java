
public class STest {

	public static void main(String[] args) {
		Student s=new Student("kowlutla");
		Student s1=new Student("Deepu");
		System.out.println(s.getPoints());
		System.out.println(s.tutorStudent(s));
		System.out.println(s.tutorStudent(s));
		System.out.println(s.tutorStudent(s));
		System.out.println(s.studentCount);
		System.out.println(s.tutorStudent(s));
		s.setPoints(10);
		System.out.println(s.getPoints());
		System.out.println(s.tutorStudent(s));

	}

}
