package com.Chegg.QuickSort;

import java.util.Comparator;

//Class that implements the comparator interface to sort elements in ascending order
class IntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer v1, Integer v2) {
		return v1 < v2 ? -1 : v1 > v2 ? +1 : 0;
	}
}

public class QuickSort {

	public static void main(String[] args) {

		// creating sample integer array for testing quick sort1
		Integer[] list = { 30, 20, 10, 5, 6, 99 };

		// calling quick sort 1 which is implemented using comparable interface
		quickSort(list);
		// printing sorted array
		System.out.println("Sorted elements: ");
		for (Integer i : list) {
			System.out.println(i);
		}

		// creating sample integer array for testing quick sort2
		Integer list1[] = { 40, 21, 89, 84, 76, -34 };
		// calling quick sort 2 which is implemented using comparator interface
		quickSort(list1, new IntegerComparator());
		// printing sorted array
		System.out.println("Sorted elements: ");
		for (Integer i : list1) {
			System.out.println(i);
		}
	}

	// Method to sort the generic type of array in ascending order using comparable
	// interface
	public static <E extends Comparable<E>> void quickSort(Integer[] list) {
		quickSort(list, 0, list.length - 1);
	}

	/*
	 * OverLoaded method to sort the array in ascending order* a: stating index of
	 * array(left pointer) b:last index of array(right pointer)
	 */
	private static <E extends Comparable<E>> void quickSort(E[] list, int a, int b) {
		// check if starting index should not cross the ending index
		if (a < b) {
			int i = a, j = b;
			// find mid index and treat as pivot index
			E x = list[(i + j) / 2];
			do {
				// increment the left pointer while left pointer array value less than pivot
				// index value
				while (list[i].compareTo(x) < 0)
					i++;
				// decrement the right pointer while right pointer array value greater than
				// pivot index value
				while (x.compareTo(list[j]) < 0)
					j--;
				// if left pointer less than equal to right pointer
				if (i <= j) {
					// swap the elements of left and right pointers
					E tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
					// increment left pointer
					i++;
					// decrement right pointer
					j--;
				}
			} while (i <= j);// do above stuff while left pointer less than right pointer
			// apply the quick sort on left sub array of pivot index
			quickSort(list, a, j);
			// apply the quick sort on right sub array of pivot index
			quickSort(list, i, b);
		}
	}

	// =======================================================================================================================//

	// Method to quickSort the array using comparator Interface
	public static <E> void quickSort(E[] list, Comparator<? super E> comparator) {
		// calling overloaded method to sort array
		quickSort(list, comparator, 0, list.length - 1);
	}

	/*
	 * Over loaded method to quickSort array cmp: IntegerComparator object to sort array in
	 * ascending order a: stating index of array(left pointer) b:last index of
	 * array(right pointer)
	 */
	private static <E> void quickSort(E[] arr, Comparator<E> cmp, int a, int b) {
		// check if starting index should not cross the ending index
		if (a < b) {
			int i = a, j = b;
			// find mid index and treat as pivot index
			E x = arr[(i + j) / 2];
			do {
				// increment the left pointer while left pointer array value less than pivot
				// index value
				while (cmp.compare(arr[i], x) < 0)
					i++;
				
				// decrement the right pointer while right pointer array value greater than pivot index value
				while (cmp.compare(x, arr[j]) < 0)
					j--;
				
				// if left pointer less than equal to right pointer
				if (i <= j) {
					// swap the elements of left and right pointers
					E tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					i++;
					j--;
				}
			} while (i <= j);// do above stuff while left pointer less than right pointer

			// apply the quick sort on left sub array of pivot index
			quickSort(arr, cmp, a, j);
			// apply the quick sort on right sub array of pivot index
			quickSort(arr, cmp, i, b);
		}
	}
}
