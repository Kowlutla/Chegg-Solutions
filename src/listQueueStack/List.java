package listQueueStack;

public class List {
	double[]list;//list
	int length;//variable holds the length of current list
	
	//default Constructor which initializes the list with maximum size 100
	public List()
	{
		list=new double[100];
	}
	
	//Parameterized Constructor which initializes the list with maximum size len
	public List(int len)
	{
		list=new double[len];
	}
	
	//method to add element into list
	public void add(int ele)
	{
		if(length==list.length)//if list is full
		{
			System.out.println("List if Full ");
			return;
		}
		else//if list is not full
		{
			list[length]=ele;//add element at end of list
			length++;//increment the length
		}
	}
	
	//Method to print the list
	public void print()
	{
		for(int i=0;i<length;i++)
		{
			System.out.println(list[i]+" ");
		}
		System.out.println();
	}
}
