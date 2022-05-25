package sortedList;

public class SortedLinkedList<T extends Comparable<?super T>>
{

	private class Node<E>
	{
		int data;
		Node<E> next;
		public Node(int data,Node<E> next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<?> head;
	
	
	
}
