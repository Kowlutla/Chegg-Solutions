package listQueueStack;

import java.util.Random;

public class TestProgram {

	public static void main(String[] args) {
		
		Random rand=new Random();
		Stack stack=new Stack();
		Queue queue=new Queue();
		
		//Adding 10 elements to stack
		for(int i=1;i<=10;i++)
		{
			stack.add(rand.nextInt(100));//adding elements to stack using add method
		}
		//Adding 10 elements to Queue
		for(int i=1;i<=10;i++)
		{
			queue.add(rand.nextInt(100));//adding elements to stack using add method
		}
		System.out.println("Stack elements: ");
		stack.print();
		System.out.println("Queue elements: ");
		queue.print();
		System.out.println("Removing 1st element from Stack: "+stack.remove());
		System.out.println("Removing 1st element from Stack: "+stack.remove());
		
		System.out.println("\nRemoving 1st element from Queue: "+queue.remove());
		System.out.println("Removing 2nd element from Queue: "+queue.remove());
	}
}
