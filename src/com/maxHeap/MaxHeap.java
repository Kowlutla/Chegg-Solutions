package com.maxHeap;

import java.util.Scanner;

public class MaxHeap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		int n = sc.nextInt();
		int heap[] = new int[n];
		System.out.println("Enter elmenents into heap :");
		for (int i = 0; i < n; i++) {
			heap[i] = sc.nextInt();
		}

		// to build max heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			maxHeapify(heap, n, i);
		}
		System.out.println("Heap: ");
		for (int i = 0; i < n; i++) {
			System.out.print(heap[i] + "  ");
		}
		// Maximum value in heap
		System.out.println("\nMax Value: " + maxValue(heap));

		// Second largest value in heap
		//print integer minimum value if there no second largest
		System.out.println("Secong Largest value: " + secondLargestValue(heap));

		// third largest value in heap
		//print integer minimum value if there no second largest
		System.out.println("3rd Largest element: " + thirdLargestValue(heap));

		// Minimum value in heap
		System.out.println("Minimum Value: " + minValue(heap));

		sc.close();
	}

	// Max Heapify Method
	private static void maxHeapify(int[] heap, int n, int i) {

		int largest = i;
		int left = leftChild(i);
		int right = rightChild(i);

		if (left < n && heap[left] > heap[largest]) {
			largest = left;
		}

		if (right < n && heap[right] > heap[largest]) {
			largest = right;
		}

		if (largest != i) {
			int temp = heap[i];
			heap[i] = heap[largest];
			heap[largest] = temp;
			maxHeapify(heap, n, largest);
		}

	}

	// Method to return the index of leftchild of index i
	private static int leftChild(int i) {
		return 2 * i + 1;
	}

	// Method to return the index of rightchild of index i
	private static int rightChild(int i) {
		return 2 * i + 2;
	}

	/*
	 * Method to return the max value in heap In Max Heap root value is maximum
	 * which is present at starting of heap
	 */
	private static int maxValue(int heap[]) {

		return heap[0];
	}

	/*
	 * In Max heap Largest element present at root and second largest largest
	 * element present at either left or right child of root
	 */
	private static int secondLargestValue(int heap[]) {
		// if heap doesn't contain atleast 2 values
		if (heap.length < 2) {
			return Integer.MIN_VALUE;
		}
		// if heap contain only two values then left child of root is second minimum
		if (heap.length == 2) {
			return heap[1];
		}

		int leftChildOfRoot = 1;
		int rightChildOfRoot = 2;

		return Math.max(heap[leftChildOfRoot], heap[rightChildOfRoot]);
	}
	/*
	 * Once the heap is build we replace the max element at arr[0](root element) to
	 * last index of array and decrease the size by 1 in next iteration as highest
	 * element is already at its place. Remember in each iteration we would have
	 * highest element at arr[0] and we will swap it to last element of heap size.
	 * so for finding the 3rd largest element, we will only need to swap times  
	 */
	private static int thirdLargestValue(int heap[]) {
		// if heap contain less than three values
		if (heap.length < 3) {
			return Integer.MIN_VALUE;
		}
		for (int i = heap.length - 1; i > heap.length - 3; i--) {
			// Swap max element at root(arr[0] to last element)
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			// swapping would have disturbed the heap property,
			// so calling max maxHeapify for index 0 on the reduced heap size.
			// if we pass i in place of size should also work as that also represents the
			// size
			maxHeapify(heap, i, 0);
		}
		return heap[0];
	}

	/*
	 * In mAx heap non-leafs are connot minimum because its left child has lower
	 * value So the min value must should be in leaf nodes. In heap leaf nodes
	 * starts from ceil(heap.length/2) Return the minimum value in left results to
	 * the minimum element in heap
	 */
	private static int minValue(int heap[]) {
		int length = heap.length;
		int minElement = heap[length / 2];
		for (int i = 1 + length / 2; i < length; i++) {
			minElement = Math.min(minElement, heap[i]);
		}
		return minElement;
	}
	
}




