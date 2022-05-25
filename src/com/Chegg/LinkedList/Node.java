
package com.Chegg.LinkedList;
public class Node<T> {
	private T data;
	private Node<T> next;

	public Node(T data, Node<T> next) {

		this.data = data;

		this.next = next;

	}
	/**
	 * @return the data in the node
	 **/
	public T getData() {

		return this.data;

	}
	/**
	 * @return the next node
	 **/
	public Node<T> getNext() {

		return this.next;

	}
	/**
	 * Method to sets the data
	 **/
	public void setData(T data) {

		this.data = data;

	}
	/**
	 *  Method to sets the nextNode
	 **/
	public void setNext(Node<T> next) {

		this.next = next;

	}
}
