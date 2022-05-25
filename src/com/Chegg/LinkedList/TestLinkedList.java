package com.Chegg.LinkedList;

public class TestLinkedList {

	public static <T> void main(String[] args)
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.addAtIndex(10, 0);
		//list.print();
		System.out.println("Size: "+list.size);
		list.addAtIndex(20, 1);
		list.addAtIndex(30, 2);
		list.addAtIndex(40, 3);
		list.addAtIndex(0, 4);
		list.addAtIndex(40, 5);
		list.addAtIndex(23, 6);
		list.addAtIndex(40, 7);
		list.addAtIndex(45, 0);
		//list.print();
		System.out.println("Size: "+list.size);
		System.out.println(list.removeFromIndex(8));
		System.out.println("Size: "+list.size);
		//list.print();
		list.removeLastOccurance(40);
		System.out.println("Size: "+list.size);
		//list.print();
		System.out.println("Size: "+list.size);
		System.out.println(list.get(6));
	}

}
