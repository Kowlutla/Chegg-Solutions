package com.Chegg.Assignment5;

public class LinkedList<T> {

	// inner class Node
	static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}

		public String toString() {
			return "" + data;
		}
	}

	// points to head of linked list
	Node<T> head;

	// Method to return First Node in list
	public Node<T> getFirst() {
		return head;
	}

	// Method to add Item to list at first
	public void addFirst(T item) {
		Node<T> node = new Node<T>(item);
		node.next = head;
		head = node;
	}

	// Method to search for item in list
	public boolean contains(T item) {
		Node<T> current = head;
		while (current != null) {
			if (current.data.equals(item)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	// Method to set the item at n index
	public void set(int n, T item) {
		Node<T> current = head;
		int index = 0;// considering index start from 0
		// traverse the list
		while (current != null) {
			// if index equals to n then set the data with item
			if (index == n) {
				current.data = item;
			}
			index++;
			current = current.next;
		}
	}

	// Method to remove nth node from list
	public Node<T> removeNthNode(int n) {
		// if list is empty
		if (head == null) {
			System.out.println("List is empty....");
			return null;
		}

		// if you want to delete 0th node which is head node
		if (n == 0) {
			Node<T> temp = head;
			head = head.next;
			return temp;

		} else {
			Node<T> current = head;
			// traverse through list before index
			for (int i = 0; i < n - 1 && current != null; i++) {
				current = current.next;
			}
			// if index is larger than size
			if (current == null || current.next == null) {
				System.out.println("Index is out of List ");
				return null;
			} else {
				// change the current next to current.next.next
				Node<T> temp = current.next;
				current.next = current.next.next;
				return temp;
			}
		}
	}

	// Method to Add item at particular index
	public void addNode(int n, T item) {
		Node<T> node = new Node<T>(item);
		Node<T> current = head;
		if (n == 0)// if want to add at index 0
		{
			addFirst(item);// add item at first
		} else {
			// traverse through list before index
			for (int i = 0; i < n - 1 && current != null; i++) {
				current = current.next;
			}
			// if we reaches out of list
			if (current == null) {
				System.out.println("Index is out of List ");
			} else {
				// set node next to current next
				node.next = current.next;
				// current next to node
				current.next = node;
			}
		}
	}

	// method to remove Node from Last
	public Node<T> removeLast() {
		// if list is empty
		if (head == null) {
			System.out.println("List is empty...");
			return null;
		}
		// if list contain only one node
		else if (head.next == null) {
			Node<T> temp = head;
			head = null;
			return temp;

		} else {
			Node<T> current = head;
			// traverse the list till last node
			while (current.next.next != null) {
				current = current.next;
			}
			Node<T> temp = current.next;// store last node in temp
			current.next = null;// make last node as null
			return temp;// return removed node
		}
	}

	// Method to get the last node from list
	public Node<T> getLast() {
		// if list is empty
		if (head == null) {
			System.out.println("List is empty...");
			return null;
		}
		// if list contain only one node
		else if (head.next == null) {
			return head;
		} else {
			Node<T> current = head;
			// traverse the list till last node
			while (current.next.next != null) {
				current = current.next;
			}
			return current.next;// return last node
		}
	}

	// Main Method
	public static void main(String args[]) {
		// creating linked list which can hold string
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("kowlutla");// adding at front
		list.addNode(1, "deepu");// adding at index 1
		list.addFirst("Lakshmi");// adding at front
		list.addFirst("Hari");// adding at front
		list.addNode(4, "Aruna");// adding at index 4

		// printing first item in list
		System.out.print("First Item: ");
		Node<String> first = list.getFirst();
		System.out.println(first);

		// printing last item in list
		System.out.println("Last Item: " + list.getLast());

		// printing original list
		System.out.println("Original List: ");
		while (first != null) {
			System.out.print(first + "- ->");
			first = first.next;
		}
		System.out.println();

		// removing last item in list
		System.out.println("Last item removed ");
		list.removeLast();
		System.out.println("Last Item: " + list.getLast());

		// printing list after removing last item
		System.out.println("\nList After Last item: ");
		first = list.getFirst();
		while (first != null) {
			System.out.print(first + "- ->");
			first = first.next;
		}
		System.out.println();

		// removing item at index 3
		System.out.print("Item at index 2 removed: ");
		System.out.println(list.removeNthNode(2));

		// printing list after removing item at index 2
		System.out.println("\nList After index 2 item removed:");
		first = list.getFirst();
		while (first != null) {
			System.out.print(first + "- ->");
			first = first.next;
		}
		System.out.println();

		// check whether list contains "kowlutla" or not
		System.out.println("\nList contains kowlutla: " + list.contains("kowlutla"));
		// check whether list contains "Hari" or not
		System.out.println("\nList contains Hari: " + list.contains("Hari"));
	}

}
