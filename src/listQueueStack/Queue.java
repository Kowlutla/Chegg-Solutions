package listQueueStack;
public class Queue extends List
{
	//Default constructor that initializes the Queue with maximum size to 100
	public Queue()
	{
		super();
	}
	
	//Parameterized constructor that initializes the Queue with maximum size to len
	public Queue(int len)
	{
		super(len);
	}
	//Method to remove element from Queue
	public double remove()
	{
		if(length<0)//if no elements in Queue return -1
		{
			System.out.println("No elements to remove in Queue");
			return -1;
		}
		else//if Queue have elements 
		{
			double element=list[0];//take the first element from Queue
			for(int i=0;i<length;i++)
			{
				list[i]=list[i+1];//copy next position element to current position  
			}
			length--;//decrement the length
			return element;
		}
	}
}
