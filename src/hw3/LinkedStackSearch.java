package hw3;

public class LinkedStackSearch {

	public static void main(String[] args) {
		
		//creating object of linked stack
		LinkedStack stack=new LinkedStack();
		stack.push(10);//pushing elements
		stack.push(20);
		stack.push(30);
		stack.push(32);
		stack.push(42);
		stack.push(23);
		stack.push(40);
		stack.push(8);
		//calling method searchStack 
		System.out.println(searchStack(stack,10));
		
	}
	
	//Method SearchStack which returns true if stack contain element otherwise return false
	public static boolean searchStack(LinkedStack s,int element)
	{
		if(s.head==null)//if no elements left in stack return false
		{
			return false;
		}
		if(s.pop()==element)//if popped element is element return true
		{
			return true;
		}
		return searchStack(s,element);//else recursively check for next element
	}

}
