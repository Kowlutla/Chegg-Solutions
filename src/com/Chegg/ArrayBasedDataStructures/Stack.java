package com.Chegg.ArrayBasedDataStructures;

public class Stack {

	// initial capacity of stack
	private int capacity = 2;
	// object array to store objects
	private Object[] stack = new Object[capacity];
	// to pick top of stack
	private int top = 0;

	// Method to push object into stack
	public void push(Object data) {
		// if size reaches the capacity then expand stack
		if (size() == capacity)
			expand();
		// push the data at top
		stack[top] = data;
		// increment top by 1
		top++;
	}

	// method to expand the stack by doubling current capacity
	private void expand() {
		int length = size();
		Object newStack[] = new Object[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity = capacity * 2;
	}

	// Method to remove object from stack
	Object pop() {
		// if stack is empty return null
		if (isEmpty()) {
			return null;
		}
		// if stack is not empty
		else {
			Object data = stack[top - 1];
			top--;
			stack[top] = null;
			shrink();
			return data;
		}
	}

	// Method to decrease the capacity of stack
	private void shrink() {
		int length = size();
		if (length <= (capacity / 2) / 2) {
			capacity = capacity / 2;
		}
		Object newStack[] = new Object[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;

	}

	// Method to return the size of stack
	int size() {
		return top;
	}

	// method to print stack elements as string
	// from top to bottom
	public String toString() {
		String s = "";
		for (int i = this.size() - 1; i >= 0; i--) {
			s = s + this.stack[i] + " ";
		}
		return s;
	}

	// method to check is stack is empty or not
	boolean isEmpty() {
		// return if size is equal to 0
		return size() == 0;
	}

	// Method to check given stack is equal to current stack or not
	boolean equals(Stack s) {
		// if sizes are not equal return false
		if (s.size() != this.size()) {
			return false;
		} else {
			// traverse through each object in both stacks
			for (int i = 0; i < this.size(); i++) {
				// if current object is not same in both stack return false
				if (this.stack[i] != s.stack[i]) {
					return false;
				}
			}
		}
		// return true
		return true;
	}

}
