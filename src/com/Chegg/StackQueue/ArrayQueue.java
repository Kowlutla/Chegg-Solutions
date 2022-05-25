package com.Chegg.StackQueue;

public class ArrayQueue<E> implements Queue<E> {

	private static int CAPACITY = 100;

	private E[] data;

	private int first = 0;

	private int size = 0;

	@SuppressWarnings("unchecked")

	public ArrayQueue() {

		data = (E[]) new Object[CAPACITY];

	}

	@Override

	public int size() {

		return size;

	}

	@Override

	public boolean isEmpty() {

		return (size == 0);

	}

	@Override

	public void enqueue(E e) {

		if (size == CAPACITY)

			System.out.println("Full Queue");

		else {

			int available = (first + size) % CAPACITY;

			data[available] = e;

			size++;

		}

	}

	@Override

	public E first() {

		if (isEmpty())

			return null;

		return data[first];

	}

	@Override

	public E dequeue() {

		if (isEmpty())

			return null;

		E removed = data[first];

		data[first] = null;

		first = (first + 1) % CAPACITY;

		size--;

		return removed;

	}

}