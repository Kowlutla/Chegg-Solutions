package com.Chegg.ArrayBasedDataStructures;

public class ArrayList {

	private static final int SIZE_FACTOR = 1000;

	Object data[] = new Object[SIZE_FACTOR];

	private int index;

	private int size;

	public void insert(Object o, int pos) {
		int i;

		// create a new array of size n+1
		Object newarr[] = new Object[data.length];
		// insert the elements from
		// the old array into the new array
		// insert all elements till pos
		// then insert x at pos
		// then insert rest of the elements
		for (i = 0; i < data.length ; i++) {
			if (i <= pos - 1)
				newarr[i] = data[i];
			else if (i == pos )
				newarr[i] = o;
			else
				newarr[i] = data[i - 1];
		}
		data = newarr;
		this.index++;

	}

	public Object remove(int i) {
		if (i > this.index - 1) {
			return null;
		}
		if (i < 0) {
			return null;		}
		Object value = this.data[i];
		for (int x = i; x < this.data.length - 1; x++) {
			data[x] = data[x + 1];
		}
		this.index--;
		return value;
	}

	public int size() {
		return this.index;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public int indexOf(Object o) 
	{
		for (int i = 0; i < size(); i++) {
			if (!data[i].equals(null)) 
			{
				if(data[i]==o)
					return i;
			}
		}
		return -1;
	}

	public Object get(int i){
		return this.data[i];
	}

	public boolean equals(ArrayList list) {
		if (this.size() != list.size()) {
			return false;
		}
		for (int i = 0; i < size(); i++) {
			if (!(data[i].equals(list.data[i]))) {
				return false;
			}
		}
		return true;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < SIZE_FACTOR; i++) {
			if(data[i]!=null)
			{
				s = s + data[i] + " ";
			}
		}
		return s;
	}

}
