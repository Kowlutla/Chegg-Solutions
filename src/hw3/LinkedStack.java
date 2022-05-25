package hw3;

public class LinkedStack {
	
	
	static class Node//class for node for linkedlist
	{
		int data;
		Node next;
		
		public Node(int data)//constructor of node
		{
			this.data=data;
			this.next=null;
		}
	}
	
	Node head=null;
	//Method to push elements into stack 
	//insert at the head of linked list 
	public void push(int data)
	{
		Node node=new Node(data);
		Node temp=head;
		head=node;
		head.next=temp;
	}
	
	//Method to peek element present at top
	public int peek() 
	{
			if(head==null)//if no elements in stack
			{
				System.out.println("Stack underflow....!! ");
				return -1;
			}
			return head.data;//if stack contain elements return value present at head
	}
	
	//Method to remove element from stack
	public int pop() 
	{
		if(head==null)//if no elements present in stack
		{
			System.out.println("Stack underflow....!! ");
			return -1;
		}
		int value=head.data;//store the head value
		head=head.next;//change the head position
		return value;//return the head value
	}

}
