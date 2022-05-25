package stringADT;

public class LinkedString {
	
	Node head;//head node
	int length;//to hold the length of string
	
	//Constructor Allocates a new character linked list so that it represents 
	//the sequence of characters currently contained in the character array argument.
	public LinkedString(char[]value)
	{
		head=null;//make head to null  to take create new linked string
		for(int i=0;i<value.length;i++)//for all characters in character array
		{
			Node node=new Node(value[i]);//creating new node with character
			if(head==null)//if head is null add the node to null and make it as head
			{
				head=node;
			}
			else//otherwise add the new character node at the end of linked string
			{
				Node current=head;
				while(current.next!=null)
				{
					current=current.next;
				}
				current.next=node;
			}
		}
		length=value.length;//update the length with character length
	}
	
	
	//Constructor Initializes a new character linked list so that it 
	//represents the same sequence of characters as the argument.
	public LinkedString(String original)
	{
		head=null;//make head to null  to take create new linked string
		for(int i=0;i<original.length();i++)//for all characters in string
		{
			Node node=new Node(original.charAt(i));//creating new node with character 
			if(head==null)//if head is null add the node to null and make it as head
			{
				head=node;
			}
			else//otherwise add the new character node at the end of linked string
			{
				Node current=head;
				while(current.next!=null)
				{
					current=current.next;
				}
				current.next=node;
			}
		}
		length=original.length();
	}
	//Method  that Returns the character value at the specified index.
	// The first character in the linked character string is in position zero.
	public char charAt(int index)
	{
		int i=0;//starting from index 0
		Node current=head;//starting node is head
		while(current!=null)
		{
			if(i==index)//if current index is equal to given index
			{
				return current.data;//return the data
			}
			current=current.next;//for next character node
			i=i+1;//increment the current index
		}
		return '\0';//if index is not in range of linked string length return null character
	}
	//Concatenates the specified linked character string to the end of this linked character string.
	public LinkedString concat(LinkedString str){
		if(isEmpty())//if no this linked string is empty return str as concatenated string
		{
			length=str.length();
			return str;
		}
		Node current=head;
		while(current.next!=null)//fo find the last node in current linked string
		{
			current=current.next;
		}
		current.next=str.head;//link the current linked string last node to head of str linked string
		length=length+str.length();//increment the length by new linked string length
		return this;
	}
	
	
	//Returns true if, and only if length() is 0.
	public boolean isEmpty()
	{
		return this.length()==0;
	}
	
	//Returns the length of this linked character string.
	public int length()
	{
		return this.length;
	}
	
	//Returns a new linked character string resulting from replacing all 
	//occurrences of oldChar in this linked character string with newChar.
	public LinkedString replace(char oldChar,char newChar)
	{
		Node current=head;//to head the current node start from head
		while(current!=null)
		{
			if(current.data==oldChar)//if old char found
			{
				current.data=newChar;//replace old char with new char
			}
			current=current.next;
		}
		return this;//return the updated linked string
	}
	
	//Returns a Java String which contains all of the characters in this linked character string
	public String toString()
	{
		if(isEmpty())//if linked string is empty return null
		{
			return null;
		}
		String s="";//initialize empty string s
		Node current=head;
		while(current!=null)//traverse the complete linked string
		{
			s=s+current.data;//add the current node data to s
			current=current.next;//next node
		}
		return s;//return s which contain all characters in linked string
	}
}
