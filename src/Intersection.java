import java.util.ArrayList;

public class Intersection {
	public static void main(String[] args) {
		//two lists
		int[]list1={1, 2,2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
		int[]list2={2,2, 4, 8, 10, 12, 14, 16, 18, 20}; 
		//array list to hold the intersection elements of two list
		ArrayList<Integer>intersection=new ArrayList<Integer>();
		//AS TWO LISTS ARE ALREADY SORTED
		//i:points the list1 index 
		//j: points the list2 index
		int i=0,j=0;
		//traverse both list till any list reaches the end 
		while(i<list1.length && j<list2.length)
		{
			/*if list1 ith element is lessthan list2 jth element 
			 * then increment list 1 pointer
			 */
			if(list1[i]<list2[j]){
				i++;
			}
			/*if list2 jth element is lessthan list1 ith element 
			 * then increment list 2 pointer
			 */
			else if(list2[j]<list1[i]){
				j++;
			}
			//if both elements are equal then that is intersection element
			else /* if arr1[i] == arr2[j] */
			{
				/*check if intersected element already in intersection list or not
				 * if not contain add that intersected element to array list
				 */
				if(!intersection.contains(list2[j])){
					intersection.add(list2[j]);
				}
				//increment the both list1 and list3 pointers
				i++;
				j++;
			}
		}
		System.out.println();
		//printing the intersected elements
		System.out.println("Intersection elements: ");
		for(Integer element:intersection){
			System.out.print(element+" ");
		}
	}

}
