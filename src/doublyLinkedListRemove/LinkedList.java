package doublyLinkedListRemove;

public class LinkedList {

	// attributes

	private Node head;

	private Node tail;

	// Node

	class Node

	{

		public Object data;

		public Node previous;

		public Node next;

	}

	/**
	 * 
	 * Constructs an empty linked list/
	 * 
	 */

	public LinkedList()

	{

		head = null;

		tail = null;

	}

	/**
	 * 
	 * 
	 * 
	 * @param Object : object to be removed
	 * 
	 * @returns void
	 *
	 * 
	 * 
	 *          Removes node from the linked list
	 * 
	 */
	public void remove(Object data)

	{
		//start traversing from start node
		//till find the data
		Node current=head;
		while(current!=null && !(current.data.equals(data)))
		{
			current=current.next;
		}
		if(current!=null)//if data found at  current node 
		{
			removeNode(current);//remove that particular node from list
		}

	}
	//Utility method to remove a particular node
	private void removeNode(Node node) 
	{
		 // Change previous only if node to be deleted 
        // is NOT the first node 
		if(node.previous!=null)
		{
			node.previous.next=node.next;
		}
		//if node is head change the head to its next node
		else
		{
			head=node.next;
		}
		// Change next only if node to be deleted 
        // is NOT the last node 
		if(node.next!=null)
		{
			node.next.previous=node.previous;
		}
		//if node is tail change the tail to its previous node
		else
		{
			tail=node.previous;
		}
	}
		

	/**
	 * 
	 * Appends a new node to the end of the linked list.
	 * 
	 */

	public void append(Object element)

	{

		if (head == null) // Empty linked list

		{

			Node firstNode = new Node();

			firstNode.data = element;

			firstNode.previous = null;

			firstNode.next = null;

			head = firstNode;

			tail = firstNode;

		}

		else // At least one node already exists.

		{

			Node newNode = new Node();

			newNode.data = element;

			newNode.previous = tail;

			newNode.next = null;

			tail.next = newNode;

			tail = newNode;

		}

	}

	public String toString()

	{

		Node position = head;

		String output = "";

		while (position != null)

		{

			output += position.data + "\n";

			position = position.next;

		}

		return output;
	}

}
