package com.Chegg.OccurrenceElement;

public class RecCountWrapper {

	public static interface List<E> 
	{
		public int size();

		public boolean isEmpty();

		public boolean isMember(E e);

		public int firstIndexOf(E e);

		public int lastIndexOf(E e);

		public void add(E e);

		public void add(E e, int index);

		public E get(int index);

		public E remove(int index);


		public E replace(int index, E newElement);

		public void clear();

		public Object[] toArray();

		public int count(E e);
	}
	
	
	public static class SinglyLinkedList<E> implements List<E> {
		 private static class Node<E>
		 {
	           private E value;
	           private Node<E> next;
	          
	           public Node(E value, Node<E> next) 
	           {
	               super();
	               this.value = value;
	               this.next = next;
	           }
	           public Node() {
	               super();
	           }
	           public E getValue() {
	               return value;
	           }
	           public void setValue(E value) {
	               this.value = value;
	           }
	           public Node getNext() {
	               return next;
	           }
	           public void setNext(Node next) {
	               this.next = next;
	           }
	       }
		 
		 private Node header;
	       private int currentSize;
	      
	       public SinglyLinkedList() 
	       {
	           this.header = new Node<>();
	           this.currentSize = 0;
	       }
	       
	       @Override
	       public int size() {
	           return this.currentSize;
	       }
	       
	       @Override
	       public boolean isEmpty() {
	           return this.size() == 0;
	       }
	       
	       @Override
	       public boolean isMember(E e) {
	           return this.firstIndexOf(e) >= 0;
	       }
	       
	       @Override
	       public int firstIndexOf(E e) {
	           int i = 0;
	           for (Node temp = this.header.getNext(); temp != null;
	                   temp = temp.getNext(), ++i) {
	               if (temp.getValue().equals(e))
	                   return i;
	           }
	           // not found
	           return -1;
	       }
	       
	       @Override
	       public void add(E e) {
	           if (this.isEmpty()) {
	               this.header.setNext(new Node(e, null));
	               this.currentSize++;
	           }
	           else {
	               Node temp= this.header.getNext();
	               while (temp.getNext() != null)
	                   temp = temp.getNext();
	               Node newNode = new Node<>(e, null);
	               temp.setNext(newNode);
	               this.currentSize++;
	           }
	       }
	       
	       @Override
	       public void add(E e, int index) {
	           if ((index < 0) || (index > this.currentSize))
	               throw new IndexOutOfBoundsException();
	           if (index == this.currentSize)
	               this.add(e);
	           else {
	               Node temp = null;
	               if (index == 0)
	                   temp = this.header;
	               else
	                   temp = this.getPosition(index -1);
	               Node newNode = new Node<>();
	               newNode.setValue(e);
	               newNode.setNext(temp.getNext());          
	               temp.setNext(newNode);
	               this.currentSize++;
	           }
	       }
	       
	       @Override
	       public E get(int position) {
	           if ((position < 0) || position >= this.currentSize)
	               throw new IndexOutOfBoundsException();
	          
	           Node temp = this.getPosition(position);
	           return (E) temp.getValue();
	       }
	       
	       private Node<E> getPosition(int index){
	           int currentPosition=0;
	           Node<E> temp = this.header.getNext();
	          
	           while(currentPosition != index) {
	               temp = temp.getNext();
	               currentPosition++;
	           }
	           return temp;
	       }
	       
	       @Override
	       public E remove(int index) {
	           if ((index < 0) || (index >= this.currentSize))
	               throw new IndexOutOfBoundsException();
	           else {
	               Node<E> temp = this.header;
	               int currentPosition =0;
	               Node<E> target = null;
	              
	               while (currentPosition != index) {
	                   temp = temp.getNext();
	                   currentPosition++;
	               }
	               E result = null;
	               target = temp.getNext();
	               result = target.getValue();
	               temp.setNext(target.getNext());
	               target.setValue(null);
	               target.setNext(null);
	               this.currentSize--;
	               return result;
	           }
	       }
	       
	       @Override
	       public E replace(int position, E newValue) {
	           if ((position < 0) || position >= this.currentSize)
	               throw new IndexOutOfBoundsException();
	           Node<E> temp = this.getPosition(position);
	           E result = temp.getValue();
	           temp.setValue(newValue);
	           return result;
	       }
	       
	       @Override
	       public void clear() {
	           while(!this.isEmpty())
	               this.remove(0);
	       }
	       
	       @Override
	       public Object[] toArray() {
	           Object[] result = new Object[this.size()];
	           for (int i=0; i < this.size(); ++i)
	               result[i] = this.get(i);
	           return result;
	       }
	       
	       @Override
	       public int lastIndexOf(E e) {
	           int i = 0, result = -1;
	           for (Node<E> temp = this.header.getNext(); temp != null;
	                   temp = temp.getNext(), ++i) {
	               if (temp.getValue().equals(e))
	                   result = i;
	           }
	           // not found
	           return result;
	       }
	       
	       
	       @Override
	       public int count(E e) {
	           /* ADD YOUR CODE HERE */
	           /* This method should make use of the recCount auxiliary recursive method */
	    	  
	           if(header==null) //if No elements in list
	        	   return 0;	//return 0
	           //else(if list is not empty)
	           return recCount(header,e);
	       }

	       /**
	       * Auxiliary recursive method to count the number of ocurrences of e
	       */
	       //to keep count of Occurrences of E e
	       private static int count=0;
	       private int recCount(Node<E> first, E e) {
	         
	    	   //if we reached end of list return count
	    	   if(first==null)
	    	   {
	    		   return count;
	    	   }
	    	   //if current value is e increment count
	    	   if(first.getValue()==e)
	    	   {
	    		   count=count+1;
	    	   }
	    	   //recursively check for next node in list
	    	   return recCount(first.getNext(),e);
	       }
	}

}
