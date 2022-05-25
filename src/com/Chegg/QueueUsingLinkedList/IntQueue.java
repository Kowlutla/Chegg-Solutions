package com.Chegg.QueueUsingLinkedList;

public class IntQueue {
	//private class Node
	private class Node
	{
		//class variables of Node
		private int value;
		private Node next;
		//Constructor for Node 
		public Node(int v,Node n)
		{
			this.value=v;
			this.next=n;
		}
		//method to set node value
		public void setValue(int v)
		{
			this.value=v;
		}
		
		//method to set the next node
		public void setNext(Node n)
		{
			this.next=n;
		}
		//method to get the value
		public int getValue()
		{
			return this.value;
		}
		
		//Method to get the next Node
		public Node getNext()
		{
			return this.next;
		}
	}
	//variable to hold the first and last nodes of queue
	private Node first;
	private Node last;
	
	//Method to insert elements into queue
	public void insert(int value)
	{
		Node oldlast=last;
		last=new Node(value,null);
		if(isEmpty())
		{
			first=last;
		}
		else
		{
			oldlast.setNext(last);
		}
	}
	
	//Method to remove node from queue at first
	public int remove()
	{
		//if queue is empty print queue is empty statement
		//return -1 value
		if(isEmpty())
		{
			System.out.println("Queue is Empty to remove... ");
			return -1;
		}
		//if queue is not empty 
		else
		{
			//store the first value in temporary variable
			int value=first.getValue();
			//point the current fist to next
			first=first.getNext();
			if(isEmpty())
			{
				last=null;
			}
			return value;
		}
	}
	
	//method to return the first value in queue
	public int peek()
	{
		//if queue is empty return -1;
		if(isEmpty())
		{
			System.out.println("Queue is Empty ... ");
			return -1;
		}
		//if queue is not empty return value of first
		else
		{
			return first.getValue();
		}
	}

	//Method to check if queue is empty or not
	public boolean isEmpty() {
		return first==null;
	}
	//Method to print queue elements
	public void printQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty...");
			return;
		}
		else
		{
			System.out.println("Queue: ");
			Node current=first;
			while(current!=null)
			{
				System.out.print(current.getValue()+" ");
				current=current.getNext();
			}
			System.out.println();
		}
	}
	
	//Main Method
	public static void main(String args[])
	{
		//creating intQueue object
		IntQueue q=new IntQueue();
		//inserting values into queue
		q.insert(10);
		q.insert(20);
		q.insert(30);
		//printing first value in queue
		System.out.println("First element: "+q.peek());
		
	}
}
