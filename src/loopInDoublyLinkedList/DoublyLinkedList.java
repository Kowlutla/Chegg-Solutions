package loopInDoublyLinkedList;
import java.util.HashSet;
public class DoublyLinkedList {
	//class Node
	public class Node {

		int data;
		Node next;
		Node previous;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
			this.previous=null;
		}
	}
	Node head;
	//Method to append the node at the end of list
	public void append(int data)
	{
		Node node=new Node(data);
		Node current=head;
		if(current==null)
		{
			head=node;
			return;
		}
		while(current.next!=null)
		{
			current=current.next;
		}
		node.previous=current;
		current.next=node;
	}
	
	
	//Method 1 to find the loop in doublyLinkedList
	public boolean isLoop1()
	{
		//create a hash set which doesn't allows duplicates
		HashSet<Node>set=new HashSet<Node>();
		Node current=head;//start from head node
		while(current!=null)//till the last node
		{
			if(set.contains(current))//if set already contain the current node then there is loop
			{
				return true;
			}
			else//if set doesn't contain current node 
			{
				set.add(current);//add the current node to set
				current=current.next;//look for next node
			}
		}
		return false;//return false if no loop in doubly linked list
	}
	
	
	//Method 2 to find loop in doublyLinkedlist or not
	// Floyd’s Cycle-Finding Algorithm:
	public boolean isLoop2()
	{
		Node slow_node=head;//slow node each time jumps one node
		Node fast_node=head;//fast node each time jumps two nodes
		
		while(fast_node!=null && fast_node.next.next!=null  && slow_node.next!=null )
		{
			slow_node=slow_node.next;//jump one node
			fast_node=fast_node.next.next;//jump two nodes
			if(slow_node.previous==fast_node.previous ||slow_node==fast_node )//if slow node and fast node met or slow node prev and fast node prev
			{																	//pointing same node then there is loop
				return true;
			}
		}
		//if no loop found return false
		return false;
	}
	//Method to traverse list
	public void traverse(){
		Node current=head;
		if(current==null){
			System.out.println("List is Empty");
			return;
		}
		System.out.println("List Elements are: ");
		while(current.next!=null){
			System.out.print(current.data+"- - >");
			current=current.next;
		}
		System.out.println(current.data);
		System.out.println("- - - - - - - - - -  - - - - - - - - - - - - - - - - - -");
	}
	
	
	public static void main(String args[])
	{
		//creating list of doublyLinked list
		DoublyLinkedList list=new DoublyLinkedList();
		//append the values at the end of list
		list.append(10);
		list.append(8);
		list.append(4);
		list.append(2);
		System.out.println("Printing list: ");
		list.traverse();
		//case1
		System.out.println("Checking for loop case1: ");
		System.out.println("Is Loop There(Method 1): "+list.isLoop1());
		System.out.println("Is Loop There(Method 2): "+list.isLoop2());
		//case 2
		list.head.next.next.next=list.head.next;
		System.out.println("\nChecking for loop case2: ");
		System.out.println("Is Loop There(Method 1): "+list.isLoop1());
		System.out.println("Is Loop There(Method 2): "+list.isLoop2());
		//case 2
		list.head.next=list.head;
		System.out.println("\nChecking for loop case1: ");
		System.out.println("Is Loop There(Method 1): "+list.isLoop1());
		System.out.println("Is Loop There(Method 2): "+list.isLoop2());
		//case 3
		list.head.next.next.previous=list.head;
		System.out.println("\nChecking for loop case1: ");
		System.out.println("Is Loop There(Method 1): "+list.isLoop1());
		System.out.println("Is Loop There(Method 2): "+list.isLoop2());
	}

}
