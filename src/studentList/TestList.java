package studentList;
public class TestList {

	public static void main(String[] args) {
		//instantiate variables s1, s2, s3, s4 and s5
		Student s1=new Student("Adams",2.2,26);
		Student s2=new Student("Jones",3.0,29);
		Student s3=new Student("Marcus",3.2,53);
		Student s4=new Student("Smith",3.3,20);
		Student s5=new Student("Zee",3.6,36);
		System.out.println("List1: ");
		LLStudent list1=new LLStudent();
		list1.addFront(s5);
		list1.addFront(s4);
		list1.addFront(s3);
		list1.addFront(s2);
		list1.addFront(s1);
		System.out.println("Printing LinkedList List1: ");
		list1.printLinkedList();

		System.out.println("\nWorst Student: ");
		System.out.println(list1.worstSudent());
		
		System.out.print("\nIs Sorted By GPA: ");
		System.out.println(list1.isSortedByGpa());
		
		System.out.print("\nIs Sorted by Age: ");
		System.out.println(list1.isSortedByAgeRec(list1.getList()));

		System.out.println("\nBest Student in List: ");
		System.out.println(list1.bestStudentRec(list1.getList()));
		
		System.out.println("----------------------------------------------------");
		System.out.println("List2: ");
		LLStudent list2=new LLStudent();
		//instantiate variables s1, s2, s3, s4 and s5
		s1=new Student("Smith",2.3,20);
		s2=new Student("Adams",2.2,26);
		s3=new Student("Jones",3.0,29);
		s4=new Student("Zee",3.6,36);
		s5=new Student("Marcus",3.2,53);
		list2.addFront(s5);
		list2.addFront(s4);
		list2.addFront(s3);
		list2.addFront(s2);
		list2.addFront(s1);
		System.out.println("Printing LinkedList: ");
		list2.printLinkedList();

		System.out.println("\nWorst Student: ");
		System.out.println(list2.worstSudent());
		
		System.out.print("\nIs Sorted By GPA: ");
		System.out.println(list2.isSortedByGpa());
		
		System.out.print("\nIs Sorted by Age: ");
		System.out.println(list2.isSortedByAgeRec(list2.getList()));

		System.out.println("\nBest Student in List: ");
		System.out.println(list2.bestStudentRec(list2.getList()));
	}


}
