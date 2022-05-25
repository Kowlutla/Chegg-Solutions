package com.Chegg.Account;

public class Stack 
{
	int maxSize;
	int array[];
	int top;

	public Stack(int n)
	{
		maxSize=n;
		array=new int[maxSize];
		top=0;
	}
	
	
	public void push(int data)
	{
		if(top<maxSize)
		{
			array[top]=data;
			top++;
		}
		else
		{
			System.out.println("Stack is Full....");
		}
	}
	
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("No elements in stack ");
			return 0;
		}
		else
		{
			int value=array[top-1];
			array[top-1]=0;
			top=top-1;
			return value;
		}
		
	}
	
	public int peek()
	{
		if(top>0)
		{
			return array[top-1];
		}
		else
		{
			return 0;
		}
	}
	
	public boolean isEmpty()
	{
		return top==0;
	}
	
	public void show()
	{
		for(int i=0;i<maxSize;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
