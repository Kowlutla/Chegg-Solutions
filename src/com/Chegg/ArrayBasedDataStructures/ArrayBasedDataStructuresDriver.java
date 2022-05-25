package com.Chegg.ArrayBasedDataStructures;

public class ArrayBasedDataStructuresDriver {

	public static void main(String[] args) {
		
		Stack stack=new Stack();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		stack.push("s");
		Stack stack1=new Stack();
		stack1.push("a");
		stack1.push("b");
		stack1.push("c");
		stack1.push("d");
		stack1.push("e");
		System.out.println(stack.equals(stack1));
		System.out.println(stack.size());
		System.out.println(stack.toString());
		
		Queue q1=new Queue();
		q1.enqueue("a");
		q1.enqueue("b");
		q1.enqueue("c");
		q1.enqueue("d");
		q1.enqueue("e");
		q1.enqueue("f");

		Queue q2=new Queue();
		q2.enqueue("a");
		q2.enqueue("b");
		q2.enqueue("c");
		q2.enqueue("d");
		q2.enqueue("e");
		q2.enqueue("g");
		System.out.println(q1.equals(q2));
		
		ArrayList list=new ArrayList();
		list.insert("A", 0);
		System.out.println(list.toString());
		list.insert("B", 1);
		System.out.println(list.toString());
		list.insert("C", 2);
		System.out.println(list.toString());
		System.out.println(list.size());
		System.out.println(list.get(4));
		System.out.println(list.toString());
		list.insert("D", 2);
		System.out.println(list.toString());
		System.out.println(list.indexOf("C"));
	}

}
