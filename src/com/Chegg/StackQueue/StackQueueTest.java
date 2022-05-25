package com.Chegg.StackQueue;

public class StackQueueTest {
	// To create the linked list
	static class SinglyLinkedList {
		int data;
		SinglyLinkedList next;

		public SinglyLinkedList(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args) {

		// creating stack object
		Stack<Integer> stack = new ArrayStack<Integer>();
		// pushing elements into stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		// Creating Queue object
		Queue<Integer> queue = new ArrayQueue<Integer>();
		// enqueue the queue
		queue.enqueue(4);
		queue.enqueue(3);
		queue.enqueue(2);
		// printing stack
		// stores the elements of stack in reversed order
		System.out.print("Stack: ");
		Stack<Integer> tempStack = new ArrayStack<Integer>();
		while (!stack.isEmpty()) {
			int data = stack.top();// pick top element
			System.out.print(data + " ");// print that element
			tempStack.push(data);// push this top element to tempStack
			stack.pop();// pop element from stack

		}
		// store the elements tempStack which bring back the original order of stack
		while (!tempStack.isEmpty()) {
			// pop element from tempStack and push that element to stack
			stack.push(tempStack.pop());
		}
		System.out.println();
		System.out.print("Queue: ");
		Queue<Integer> tempQueue = new ArrayQueue<Integer>();
		while (!queue.isEmpty()) {
			int data = queue.first();
			System.out.print(data + " ");
			tempQueue.enqueue(data);
			queue.dequeue();
		}

		System.out.println();
		System.out.print("Mix-it:");
		SinglyLinkedList head = mixItUp(stack, tempQueue);
		//printing the linked list elements
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}
	/* method public static SinglyLinkedList mixItUp(Stack s, Queue q) that receives
	 * a stack and a queue of integers and then multiplies the first element of the
	 * queue by the top of the stack and stores the value in a singly linked list
	 */
	public static SinglyLinkedList mixItUp(Stack<Integer> s, Queue<Integer> q) {
		// if stack size and queue size is not same
		if (s.size() != q.size())
			return null;
		else {
			SinglyLinkedList head = null;// to hold the head of linkedList
			while (!s.isEmpty() && !q.isEmpty()) {
				int qval = q.dequeue();// extract element of queue
				int sval = s.pop();// extract element of stack
				int mul = qval * sval;// multiply both numbers
				SinglyLinkedList node = new SinglyLinkedList(mul);// create linkedlist node with mul value
				if (head == null)// if head is null make node as null
				{
					head = node;
				} else// if head is not null
				{
					SinglyLinkedList current = head;
					// start traversing from head till last
					while (current.next != null) {
						current = current.next;
					}
					// assign last node next as node
					current.next = node;
				}
			}
			// return the head of the linked list
			return head;
		}
	}
}
