
package com.Chegg.LinkedList;
import java.util.NoSuchElementException;

public class LinkedList<T> {
	
	Node<T>head;
	int size;
		
	/*
	 * Constructor sets the head to null and
	 * sets the size to 0 to instantiate linkedlist
	 * */
	public LinkedList()
	{
		this.head=null;
		this.size=0;
	}
	/*This method add the node at specific index
	 * */
	public void addAtIndex(T data,int index)
	{
		//if index is out of bounds throwing exception
		if(index<0 || index>size)
		{
			throw new IllegalArgumentException("Index out of bounds");
		}
		else
		{
			//creating node
			Node<T> node=new Node<T>(data,null);
			//if no elements in list 
			if(index==0)
			{
				node.setNext(head);
				head=node;
			}
			//traverse through list and add the node at specific position
			else
			{
				Node<T> current=head;
				for(int i=0;i<index-1;i++)
				{
					current=current.getNext();
				}
				node.setNext(current.getNext());
				current.setNext(node);
			}
			//Increment size
			size=size+1;
		}
	}
	/*This method removes the node from specific index
	 * */
	public T removeFromIndex(int index)
	{
		//if list is empty 
		if(head==null)
		{
			throw new NoSuchElementException("No elements in list");
		}
		//if index is out of bounds
		else if(index<0 || index>=size)
		{
			throw new IllegalArgumentException("Index out of bounds");
		}
		else
		{
			//if index is 0 remove head
			if(index==0)
			{
				head=head.getNext();
				size=size-1;
				return head.getData();
			}
			//else traverse the list until index return remove 
			//the specific node at that index
			Node<T>current=head;
			for(int i=0;i<index-1;i++)
			{
				current=current.getNext();
			}
			Node<T> temp=current.getNext();
			current.setNext(current.getNext().getNext());
			//decrement size
			size=size-1;
			return temp.getData();
		}
	}
	
	/*This method to remove last occurrences of element
	 * */
	public int removeLastOccurance(T data)
	{
		//if list is empty
		if(head==null)
			throw new NoSuchElementException("No elements in list");
		else
		{
			Node<T> current=head;//to hold the current node
		    Node<T> prev=null;//to hold the previous node
		    Node<T> temp=null;//to hold the node which we will remove
		   int count=0;//count the no of occurrence
		    //traverse through list
		    while(current!=null)
		    {
		    	//find last occurrences of data
		    	if(current.getNext()!=null && current.getNext().getData()==data)
		    	{
		    		count++;
		    		prev=current;
		    		temp=current.getNext();
		    	}
		    	current=current.getNext();
		    }
		    //removing last occurrences
		    prev.setNext(temp.getNext());
		    //decrement size
		    size=size-1;
		    return count;//count of occurrence of data
		}
	}
	
	/*This method to return the data present at specific index
	 * */
	public T get(int index)
	{
		//if list is empty
		if(head==null)
		{
			throw new NoSuchElementException("No elements in list");
		}
		
		//if index out of bounds
		else if(index<0 || index>=size)
		{
			throw new IllegalArgumentException("Index out of bounds");
		}
		//else traverse the list return the node present at specific index
		else
		{
			
			Node<T>temp=null;
			Node<T> current=head;
			int count=0;
			while(current!=null)
			{
				if(count==index)
				{
					temp=current;
					break;
				}
				current=current.getNext();
				count++;
			}
			return temp.getData();
		}
	}
	
	
	

}
