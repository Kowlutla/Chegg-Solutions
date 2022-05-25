package com.Chegg.Queue;

public class Queue {
	int maxSize;//maximum size of queue
	int queue[];//
	int front=0;//points to first position of queue
	int rear=0;//points to last position of queue
	int size=0;//hold the size of current queue
	//Constructor to initialize array with maximum size
	public Queue(int maxSize)
	{
		this.maxSize=maxSize;
		queue=new int[maxSize];
	}
	//Method to insert data into queue at rear
	public void insert(int data)
	{
		//if queue is full 
		if(isFull())
		{
			System.out.println("Queue is Full... ");
			return;
		}
		else//if queue is not full then insert data at rear
		{
			queue[rear]=data;
			rear=(rear+1)%maxSize;
			size=size+1;
		}
	}
	//Method to remove data from queue at front
	public int remove()
	{
		
		//if queue is empty return -1;
		if(isEmpty())
		{
			System.out.println("Queue is Empty... ");
			return -1;
		}
		else//if queue is not empty return value from front 
		{
			int value=queue[front];
			front=(front+1)%maxSize;
			size=size-1;
			return value;
		}
	}
	
	//Method to return the value present at front
	public int Peek()
	{
		return queue[front];
	}
	
	//Method to check whether queue is empty or not
	public boolean isEmpty()
	{
		return size()==0;
	}
	
	//Method to check whether queue is full or not
	public boolean isFull()
	{
		return size()==maxSize;
	}
	
	//Method to return no of values present in queue
	public int size()
	{
		return size;
	}
	//Method to print the all queue elements
	public void show()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(queue[(front+i)%maxSize]);
		}
	}

	
	public static void main(String args[])
	{
		System.out.println("***Before inserting elements***");
		//creating queue object with maximum size 8
		Queue q1=new Queue(8);
		//checking if queue is empty or not
		System.out.println("Queue is Empty: "+q1.isEmpty());
		//checking if queue is full or not
		System.out.println("Queue is Full: "+q1.isFull());
		//printing no of elements in queue
		System.out.println("No. of items in queue: "+q1.size());
		//inserting into queue
		q1.insert(235);
		q1.insert(350);
		q1.insert(460);
		q1.insert(540);
		q1.insert(650);
		q1.insert(760);
		System.out.println("\n***After inserting the elements in the Queue***");//after inserting
		
		//printing the value present at front
		System.out.println("Front of the Queue: "+q1.Peek());
		//checking if queue is empty or not
		System.out.println("Queue is Empty: "+q1.isEmpty());
		//checking if queue is full or not
		System.out.println("Queue is Full: "+q1.isFull());
		//printing no of elements in queue
		System.out.println("No. of items in queue: "+q1.size());
		//removing elements from queue
		System.out.println("Removed element :: "+q1.remove());
		System.out.println("Removed element :: "+q1.remove());
		System.out.println("Removed element :: "+q1.remove());
		System.out.println("Removed element :: "+q1.remove());
		//printing no of elements in queue
		System.out.println("No. of items in queue: "+q1.size());
		//inserting elements into queue for second time
		System.out.println("\n***After 2nd time insertion***");
		q1.insert(100);
		q1.insert(90);
		q1.insert(80);
		q1.insert(70);
		q1.insert(60);
		q1.insert(120);
		//printing the value present at front
		System.out.println("Front of the Queue: "+q1.Peek());
		//checking if queue is empty or not
		System.out.println("Queue is Empty: "+q1.isEmpty());
		//checking if queue is full or not
		System.out.println("Queue is Full: "+q1.isFull());
		//printing no of elements in queue
		System.out.println("No. of items in queue: "+q1.size());
		q1.show();//printing the elements of queue
		int temp=q1.size();//to store the size of queue
		//removing all elements in queue
		for(int i=1;i<=temp;i++){
			q1.remove();
		}
		System.out.println("***AFTER DELETION OF ALL ELEMENTS***");
		//checking if queue is empty or not
		System.out.println("Queue is Empty: "+q1.isEmpty());
		//checking if queue is full or not
		System.out.println("Queue is Full: "+q1.isFull());
		//printing no of elements in queue
		System.out.println("No. of items in queue: "+q1.size());	
	}

}
