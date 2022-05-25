package listIterator;

import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorDemo {
	public static void main(String[] args) {
		
		LinkedList<String>list=new LinkedList<String>() ;
		list.add("one");
		list.add("four");
		list.add("three");
		list.add("five");
		ListIterator<String>iter1=list.listIterator();//list iterator1
		//printing list using list iterator
		while(iter1.hasNext())
		{
			System.out.print(iter1.next()+" ");
		}
		System.out.println();
		int one_index=list.indexOf("one");//getting index of one to add two after one
		list.add(one_index+1, "two");//adding two after1
		list.remove("four");//removing four
		list.remove("five");//removing five
		System.out.println(list);
		ListIterator<String>iter2=list.listIterator();//listiterator2 to add elements into list
		while(iter2.hasNext())
		{
			String next=iter2.next();//get current value
			iter2.add(next+" and a half ");//adding extra string to above value and adding to list
			
		}
		System.out.println(list);//printing list
	}
}
