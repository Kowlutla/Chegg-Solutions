
public class ParitySorting {

	public static void main(String[] args) {
		
		int array[]= {42,15,11,17,666,555};
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		array=paritySort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}

	}
	
	public static int[] paritySort(int A[])
	{
		int indexes[] = { -2, -1 };
        for (int i = 0; i < A.length; ++i) {
            while (A[i] % 2 != i % 2) {
                int idx = (indexes[A[i] % 2] += 2);
                swap(A,i, idx);
            }
        }
        return A;
	}

	private static void swap(int A[],int i, int j)
	{
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
		
	}

}


