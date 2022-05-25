package studentList;

public class LLStudent {
	//private inner class Node 
	private class Node
	{
		//Attributes of Node class
		public Student student; //student type
		public Node next;//type of node reference to next node
		public Node(Student student)//constructor with parameter s of Student type
		{
			this.student=student;
			this.next=null;
		}
	}
	private Node list;//private instance variable list of Node type
	public LLStudent()//constructor that creates an empty list
	{
		 list=null;
	}
	 // inserts a new node with s in it at the front of the linked list.
	public void addFront(Student s)
	{
		Node node=new Node(s);
		node.next=list;
		list=node;
	}
	// traverses linked list and prints each student as separate line.
	public void printLinkedList() 
	{
		Node current=list;
		while(current!=null)
		{
			System.out.println(current.student);
			current=current.next;
		}
	}
	//returns reference to the beginning of the linked list
	public Node getList() 
	{
		return list;
	}
	// returns a Student object with lowest gpa in entire linked list.
	public Student worstSudent()
	{
		Student s=null;
		double min_gpa=Double.MAX_VALUE;
		Node current=list;
		while(current!=null)
		{
			if(current.student.getGpa()<min_gpa)
			{
				min_gpa=current.student.getGpa();
				s=current.student;
			}
			current=current.next;
		}
		return s;
	}
	// returns true if linked list is sorted by student gpa
	public boolean isSortedByGpa()
	{
		if(list==null || list.next==null)
		{
			return true;
		}
		
		//traverse each node in list
		for(Node t=list;t.next!=null;t=t.next)
		{
			//if current student has greater gpa than next student then list is not sorted then return false
			if(t.student.getGpa()>t.next.student.getGpa())
			{
				return false;
			}
		}
		//if all students are in sorted order return true
		return true;
	}
	
	//returns true if students are sorted in the linked list by their age by recursion
	public boolean isSortedByAgeRec(Node list)
	{
		if(list== null || list.next==null)
		{
			return true;
		}
		
		return list.student.age<=list.next.student.age && isSortedByAgeRec(list.next);
	}
	//returns a student with highest gpa among all students in the
	//linked list. In case when more than one student has same highest
	// gpa return first such student. Reference first refers to the first
	// node in the linked list.
	public Student bestStudentRec(Node list)
	{
		if(list.next==null || list==null)
		{
			return list.student;
		}
		else
		{
			double temp1=list.student.getGpa();
			double temp2=bestStudentRec(list.next).getGpa();
			
			if(temp1>temp2)
			{
				return list.student;
			}
			else
			{
				return bestStudentRec(list.next);
			}
		}
	}
}




