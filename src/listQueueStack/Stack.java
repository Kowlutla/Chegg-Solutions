
package listQueueStack;

public class Stack extends List
{

	//Default constructor that initializes the stack with maximum size to 100
	public Stack()
	{
		super();
	}
	
	//Parameterized constructor that initializes the stack with maximum size to len
	public Stack(int len)
	{
		super(len);
	}
	//method to remove element stack from last position
	public double remove()
	{
		if(length<0)//if no elements in stack
		{
			System.out.println("No elements in stack ");
			return -1;
		}
		else //if elements in stack
		{
			double element=list[length-1];//store the last element in element
			list[length-1]=0;//make that position value to 0
			length--;//decrease the length
			return element;//return the removed element
		}
	}
}
