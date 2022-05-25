package intBuffer;

import java.util.ArrayList;
import java.util.List;

public class IntBuff {
	int[]elements; // the content of the buffer
	int current_size;// the number of valid elements
	
	public IntBuff() // initialize an empty buffer of maximum size 0
	{
		elements=new int[0];
	}
	
	public IntBuff(final int n) // initialize an empty buffer of maximum size n
	{
		elements=new int[n];
		for(int i=0;i<n;i++)
		{
			elements[i]=Integer.MAX_VALUE;//fill the array with infinity values
		}
	}
	public IntBuff(IntBuff buff)// initialize a buff which is a copy of buff
	{
		for(int i=0;i<buff.elements.length;i++)
		{
			if(current_size==elements.length)//if current size reaches the maximum size do not copy remaining elements in buffer
			{
				break;
			}
			else
			{
				elements[current_size]=buff.elements[i];//copy the buffer elements to elementsBuffer
				current_size++;//increment current size
			}
		}
	}
	
	// append the value v to the buffer
    // return true if the operation is successful otherwise false
	public boolean append(final int v)
	{
		if(current_size==elements.length)//if no place to append the value
		{
			return false;//return false because we did not append the element
		}
		else//if have enough space to append
		{
			elements[current_size]=v;//append to buffer
			current_size++;//increment the current size
			return true;//return true because we append the element
		}
	}
	// insert the value v to the buffer at the position of index
    // return true if the operation is successful otherwise false
	public boolean insert(final int index,final int v)
	{
		//if position size less than 0 or greater than equal to elements buffer size means no place to insert 
		if (index < 0|| index >=elements.length) 
		{ 
			return false; 
	    } 
		else
		{
			List<Integer>listBuffer=new ArrayList<Integer>();
			for(int i:elements)//copy the array elements to list
			{
				listBuffer.add(i);
			}
			listBuffer.add(index,v);//insert v at index+1 position in list 
			
			elements=listBuffer.stream() //copy all list elements into elements buffer
		            .mapToInt(Integer::intValue) 
		            .toArray(); 
			
			current_size++;//increment current size
			return true;
		}
	}
	
	 // delete the element at the position of index in the buffer
    // return true if the operation is successful otherwise false
	public boolean delete(final int index)
	{
		//if position size less than 0 or greater than current size or buffer is empty ->deletion not possible
		if (elements == null|| index < 0|| index >= current_size) 
		{ 
			return false; 
	    } 
		else
		{
			List<Integer>listBuffer=new ArrayList<Integer>();
			for(int i:elements)
			{
				listBuffer.add(i);//copy the array elements to list
			}
			listBuffer.remove(index);//remove element at given index 
			
			elements=listBuffer.stream() //copy all list elements into elements buffer
		            .mapToInt(Integer::intValue) 
		            .toArray(); 
			
			current_size--;//decrement the buffer
			return true;
		}
	}
	// display all of the (valid) elements in the buffer
	public void println()
	{
		if(current_size==0)//if no elements in element buffer
		{
			System.out.println("Buffer is Empty: ");
		}
		else
		{
			System.out.println("Buffer elements: ");
			for(int i=0;i<elements.length;i++)
			{
				if(elements[i]!=Integer.MAX_VALUE)
					System.out.print(elements[i]+" ");
			}
			System.out.println();
		}
	}
	
	//main method
	public static void main(String args[])
	{
		IntBuff buff=new IntBuff(7);//empty buffer
		//1.appending values to buffer
		buff.append(51);
		buff.append(7);
		buff.append(89);
		buff.append(106);
		buff.append(2);
		buff.append(0);
		buff.append(-18);
		//2.Displaying the contents of buffer
		buff.println();
		//3.deleting the element at index 3
		System.out.println("Deleted value at index 3: "+buff.delete(3));
		//4.Displaying the contents of buffer
		buff.println();
		//inserting value -50 at index 5
		System.out.println("Inserted -50 at index 5: "+buff.insert(5, -50));
		//6.Displaying the contents of buffer
		buff.println();
	}
	

}
