package sortingTechniques;

import java.util.LinkedList;

public class SortingTest implements Sorting
{
	//Insertion Sort
	public LinkedList<Integer> InsertionSort(LinkedList<Integer>list)
	{
		for (int j = 1; j < list.size(); j++)
		{
			int key = list.get(j);
			int i = j-1;
			
			 /* Move elements of list[0..i-1], that are  
	        greater than key, to one position ahead  
	        of their current position */
			while ((i >=0) && ((list.get(i)>key))) 
			{
				list.set(i+1, list.get(i));
		            i--;
			}
			list.set(i+1, key);
		}
		return list;
		 
	}
	
	//Quick Sort
	public LinkedList<Integer> QuickSort(LinkedList<Integer> list)
	{
		return QuickSort(list,0,list.size()-1);
	}
	
	//Overloaded Method to Quick sort
	private LinkedList<Integer> QuickSort(LinkedList<Integer> list, int low, int high)
	{
		int pivot;
		if(low>=high)
		{
			return list;
		}
		pivot=partition(list,low,high);
		QuickSort(list,low,pivot-1);
		QuickSort(list,pivot+1,high);
		return list;
	}

	//Method to find the one sorted position of list
	private int partition(LinkedList<Integer> list, int low, int high) {
		
		int pivot=list.get(low);
		int right=high;
		int left=low+1;
		
		while(left<=right)
		{
			// move left toward the right until it gets to the first value
            // greater than pivot
			
			while(left<=high && list.get(left)<=pivot)
			{
				left++;
			}
			
			// move right toward the left until it gets to the first value
			// less than or equal to the pivot
			
			while(list.get(right)>pivot)
			{
				right--;
			}
			
			// if left and right haven't crossed, swap the elements and increment/decrement
            // left and right
			if( left < right )
            {
                swap( list, left, right );
                left++;
                right--;
            }
		}
		 // the pivot position is where right points right now, so swap the pivot value there
        swap( list, low, right );
        // right contains the pivot value
        return right;
	}

	/**
     * Swaps two elements of an LinkedList
     */
	private void swap(LinkedList<Integer> list, int i, int j) {
		
		int temp = list.get(i);
        list.set( i, list.get(j) );
        list.set( j, temp );
	}

	
	//MergeSort
	public LinkedList<Integer> MergeSort(LinkedList<Integer>list)
	{
		LinkedList<Integer>leftSubList=new LinkedList<Integer>();
		LinkedList<Integer>rightSubList=new LinkedList<Integer>();
		int center;
		
		if(list.size()==1)
		{
			return list;
		}
		else
		{
			center=list.size()/2;
			// copy the left half of list into the leftSubList.
			for(int i=0;i<center;i++)
			{
				leftSubList.add(list.get(i));
			}
			//copy the right half of list into the rightSubList.
			for(int i=center;i<list.size();i++)
			{
				rightSubList.add(list.get(i));
			}
			 // Sort the left and right halves of the list.
			leftSubList=MergeSort(leftSubList);
			rightSubList=MergeSort(rightSubList);
			
			//merge the result back to together
			merge(leftSubList,rightSubList,list);
		}
		return list;
	}
	//Utility method for merge sort which is used to merge two list
	private void merge(LinkedList<Integer> leftSubList, LinkedList<Integer> rightSubList, LinkedList<Integer> list) {
		int leftListIndex=0;
		int rightListIndex=0;
		int listIndex=0;
        // As long as neither the left nor the right SubList has
        // been used up, keep taking the smaller of leftSubLIst.get(leftListIndex)
        // or rightSubList.get(rightListIndex) and adding it at both.get(bothIndex).
		while(leftListIndex<leftSubList.size() && rightListIndex<rightSubList.size())
		{
			if(leftSubList.get(leftListIndex)<rightSubList.get(rightListIndex))
			{
				list.set(listIndex, leftSubList.get(leftListIndex));
				leftListIndex++;
			}
			else
			{
				list.set(listIndex, rightSubList.get(rightListIndex));
				rightListIndex++;
			}
			listIndex++;
		}
		//if values remain in left sub list add them to list
		while(leftListIndex<leftSubList.size())
		{
			list.set(listIndex, leftSubList.get(leftListIndex));
			leftListIndex++;
			listIndex++;
		}
		//if values remain in right sub list add them to list
		while(rightListIndex<rightSubList.size())
		{
			list.set(listIndex, rightSubList.get(rightListIndex));
			rightListIndex++;
			listIndex++;
		}
	}

	public static void main(String args[])
	{
		//unsorted list 1
		SortingTest st=new SortingTest();
		LinkedList<Integer>unsortedList1=new LinkedList<Integer>();
		unsortedList1.add(2);
        unsortedList1.add(8);
        unsortedList1.add(6);
        unsortedList1.add(3);
        unsortedList1.add(12);
        unsortedList1.add(4);
        unsortedList1.add(7);
        
       
        System.out.println("\nUnSorted list1: ");
        for(Integer i: unsortedList1)
        {
        	System.out.print(i+" ");
        }
        
        //sort unsorted list1 using insertion sort
        System.out.println("\n* * * Soted using Insertion Sort * * * ");
        System.out.println("Sorted List 1: ");
        LinkedList<Integer>sortedList1=st.InsertionSort(unsortedList1);
        for(Integer i:sortedList1)
        {
        	System.out.print(i+" ");
        }
        
        
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - ");
        
        //unsorted list 2
        LinkedList<Integer>unsortedList2=new LinkedList<Integer>();
		unsortedList2.add(45);
        unsortedList2.add(2);
        unsortedList2.add(51);
        unsortedList2.add(-3);
        unsortedList2.add(62);
        unsortedList2.add(12);
        unsortedList2.add(21);
        unsortedList2.add(46);
        unsortedList2.add(52);
        unsortedList2.add(81);
        
        System.out.println("\nUnSorted List2: ");
        for(Integer i: unsortedList2)
        {
        	System.out.print(i+" ");
        }
        
      //sort unsorted list2 using Quick sort
        System.out.println("\n* * * Soted using Quick Sort * * * ");
        System.out.println("Sorted List 2: ");
        LinkedList<Integer>sortedList2=st.QuickSort(unsortedList2);
        for(Integer i:sortedList2)
        {
        	System.out.print(i+" ");
        }
        
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        
        
        //unsorted list 3
        LinkedList<Integer>unsortedList3=new LinkedList<Integer>();
		unsortedList3.add(4);
        unsortedList3.add(12);
        unsortedList3.add(89);
        unsortedList3.add(51);
        unsortedList3.add(67);
        unsortedList3.add(-23);
        unsortedList3.add(-3);
        unsortedList3.add(71);
        unsortedList3.add(66);
        unsortedList3.add(81);
        
        System.out.println("\nUnSorted List3: ");
        for(Integer i: unsortedList3)
        {
        	System.out.print(i+" ");
        }
        
        //sort unsorted list3 using Merge sort
        System.out.println("\n* * * Soted using Merge Sort * * * ");
        System.out.println("Sorted List 3: ");
        LinkedList<Integer>sortedList3=st.MergeSort(unsortedList3);
        for(Integer i:sortedList3)
        {
        	System.out.print(i+" ");
        }
        
	}
}
