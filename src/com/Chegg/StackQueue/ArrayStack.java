package com.Chegg.StackQueue;

public class ArrayStack<E> implements Stack<E> {

	private static int CAPACITY = 100;

	private E[] data;

	private int index = 0;

	@SuppressWarnings("unchecked")

	public ArrayStack() {

		data = (E[]) new Object[CAPACITY];

	}

	@Override

	public int size() {

		return index;

	}

	@Override

	public boolean isEmpty() {

		return (index == 0);

	}

	@Override

	public void push(E e) {

		if (index == CAPACITY)

			System.out.println("Full stack");

		else {

			data[index] = e;

			index++;

		}

	}

	@Override

	public E top() {

		if (isEmpty())

			return null;

		return data[index - 1];

	}

	@Override

	public E pop() {

		if (isEmpty())

			return null;

		E reomoved = data[index - 1];

		data[index - 1] = null;

		index--;

		return reomoved;

	}

}