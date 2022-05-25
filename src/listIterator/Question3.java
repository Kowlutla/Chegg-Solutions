package listIterator;

public class Question3 {

	public static void main(String[] args) {
		
		int array[]= {24,2,45,20,56,75,2,56,99,53,12};
		int value=2;
		int index=linearSearch(array,value);
		System.out.println("Value "+value+" Found at: "+index);
	}

	private static int linearSearch(int[] array,int value) {
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==value)
			{
				return i;
			}
		}
		return -1;
	}

}
