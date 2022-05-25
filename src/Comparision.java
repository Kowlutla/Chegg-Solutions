import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Comparision {

	static LinkedList<String> linkedlist = new LinkedList<String>();
	static ArrayList<String> arraylist = new ArrayList<String>();
	static Random rand = new Random();

	public static void main(String[] args) {

		System.out.println("Test Size: 5000 elements");
		add();
		search();
		remove();
	}

	public static void add() {
		System.out.println("ADD: ");

		double totalArrayListAddTime = 0;
		double totalLinkedListAddTime = 0;
		double startTime, endTime;
		for (int i = 0; i < 5000; i++) {
			// generate element
			int value = rand.nextInt(100000000);
			String s = Integer.toString(value);
			// generating index
			int index = rand.nextInt(linkedlist.size() + 1);
			// System.out.println(index+"->"+value);
			startTime = System.currentTimeMillis();
			arraylist.add(index, s);
			endTime = System.currentTimeMillis();
			totalArrayListAddTime += (endTime - startTime);

//			startTime = 0;
//			endTime = 0;
			startTime = System.currentTimeMillis();
			linkedlist.add(index, s);
			endTime = System.currentTimeMillis();
			totalLinkedListAddTime += (endTime - startTime);
		}
		System.out.println("ArrayList : " + (totalArrayListAddTime / 1000.0 + "secs"));
		System.out.println("LinkedList: " + (totalLinkedListAddTime / 1000.0) + "secs");
	}

	public static void search() {
		System.out.println("Search : ");
		double startTime, endTime;
		double totalArrayListSearchTime = 0;
		double totalLinkedListSearchTime = 0;
		for (int i = 0; i < 5000; i++) {
			int value = rand.nextInt(100000000);
			String s = Integer.toString(value);
			// System.out.println(index+"->"+value);
			startTime = System.currentTimeMillis();
			arraylist.contains(s);
			endTime = System.currentTimeMillis();
			totalArrayListSearchTime += (endTime - startTime);

			startTime = 0;
			endTime = 0;
			startTime = System.currentTimeMillis();
			linkedlist.contains(s);
			endTime = System.currentTimeMillis();
			totalLinkedListSearchTime += (endTime - startTime);
		}
		System.out.println("ArrayList : " + (totalArrayListSearchTime / 1000.0) + "secs");
		System.out.println("LinkedList: " + (totalLinkedListSearchTime / 1000.0) + "secs");
	}
	
	public static void remove()
	{
		System.out.println("Remove: ");
		double startTime,endTime,totalArrayListRemoveTime=0,totalLinkedListRemoveTime=0;
		for(int i=0;i<5000;i++)
		{
			int value=rand.nextInt(100000000);
			String s=Integer.toString(value);
			startTime=System.currentTimeMillis();
			arraylist.remove(s);
			endTime=System.currentTimeMillis();
			totalArrayListRemoveTime+=(endTime-startTime);
			
			startTime=System.currentTimeMillis();
			linkedlist.remove(s);
			endTime=System.currentTimeMillis();
			totalLinkedListRemoveTime+=(endTime-startTime);
		}
		
		System.out.println("ArrayList: "+totalArrayListRemoveTime/1000);
		System.out.println("LinkedList: "+totalLinkedListRemoveTime/1000);
	}
}
