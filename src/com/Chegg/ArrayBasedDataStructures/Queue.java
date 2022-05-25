package com.Chegg.ArrayBasedDataStructures;

public class Queue
{
	//maximum size of queue
	private int maxSize=10000;
	//creating queue of size 1000
	private Object queue[]=new Object[maxSize];
	private int front=0;
	private int rear=0;
	private int size=0;
	
	//Method to enqueue object
	public void enqueue(Object data)
	{
		if(size()==maxSize)
		{
			return;
		}
		else
		{
			queue[rear]=data;
			rear=(rear+1)%maxSize;
			size=size+1;
		}
	}
	
	//Method to dequeue object
	public Object dequeue()
	{
		Object value=queue[front];
		if(isEmpty())
		{
			return null;
		}
		else
		{
			front=(front+1)%maxSize;
			size=size-1;
		}
		return value;
	}
	

	//Method to return size of queue
	public int size()
	{
		return size;
	}
	
	//Method to return the queue object in string
	public String toString()
	{
		String s="";
		for(int i=0;i<size;i++)
		{
			s=s+queue[(front+i)%maxSize]+" ";
		}
		return s;
	}
	
	//Method to check queue is empty or not 
	public boolean isEmpty()
	{
		return size()==0;
	}
	
	//// Method to check given queue is equal to current queue or not
	public boolean equals(Queue q)
	{
		if(this.size()!=q.size())
		{
			return false;
		}
		else
		{
			for(int i=0;i<size();i++)
			{
				if(!(this.queue[(front+i)%maxSize].equals(q.queue[(front+i)%maxSize])))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	
}
