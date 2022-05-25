package com.Chegg.Address;

import java.util.Arrays;

public class Directory {
	Entry[] directory;// to hold the entry
	int N;// maximum size of directory
	int currentSize;// current size of directory

	// constructor
	public Directory(int N) {
		this.N = N;
		directory = new Entry[N];
		this.currentSize = 0;
	}

	// Method to display the contents of directory
	public void display() {
		// create a new entry directory with size current size
		Entry[] temp = new Entry[currentSize];
		// copy the all entries of directory to temp
		for (int i = 0; i < currentSize; i++) {
			temp[i] = directory[i];
		}
		// sort the temp directory
		Arrays.sort(temp);
		// display the entries
		for (int i = 0; i < currentSize; i++) {
			System.out.println(temp[i].toString());
			System.out.println();
		}
	}

	// Method to insert entry into directory
	public void insert(Entry e) {
		if (currentSize == N)// if directory size reaches the n
		{
			System.out.println("Directory is full...");
			return;
		}
		directory[currentSize] = e;// insert entry in current position
		currentSize++;// increment current size
	}

	// Method to delete the entry
	public void deleteEntry(Entry e) {
		for (int i = 0; i < currentSize; i++) {
			// compare each property of entry in directory
			if (directory[i].getName().equalsIgnoreCase(e.getName())
					&& directory[i].getHomeAddress().equalsIgnoreCase(e.getHomeAddress())
					&& directory[i].getTeliphone().equalsIgnoreCase(e.getTeliphone())) {
				// delete the entry at index i
				deleteEntry(i);
				currentSize--;// decrement current size
				System.out.println("Entry with name " + directory[i].getName() + " Deleted");
				return;
			}
		}
	}

	// Overloaded method to delete entry at particular index
	private void deleteEntry(int index) {

		// create new Entry directory with current size-1
		Entry[] anotherArray = new Entry[currentSize - 1];
		// copy the all entries except the entry present at index
		for (int i = 0, k = 0; i < currentSize; i++) {
			if (i == index)
				continue;
			anotherArray[k++] = directory[i];
		}

		// again copy the all entries in new directory to directory
		for (int i = 0; i < anotherArray.length; i++) {
			directory[i] = anotherArray[i];
		}

	}

	// Method to search and display the entry
	public void searchAndDisplay(Entry e) {
		// look for all entries
		for (int i = 0; i < currentSize; i++) {
			// if any entry in directory matches the entry e then print
			if (directory[i].getName().equalsIgnoreCase(e.getName())
					&& directory[i].getHomeAddress().equalsIgnoreCase(e.getHomeAddress())
					&& directory[i].getTeliphone().equalsIgnoreCase(e.getTeliphone())) {
				System.out.println(directory[i].toString());
				return;
			}
		}
		// if entry e not matches to any entry in directory
		System.out.println("No result found ");
	}

}
