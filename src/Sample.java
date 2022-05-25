
public class Sample {

	public static void main(String[] args) {
		
		int ires=5;
		int count=0;
		for(int index1=1;index1<=4;index1++)
		{
			for(int index2=index1;index2<=4;index2++)
			{
				count++;
				if(index2==3)
					break;
				System.out.print("Ires: "+ires);
				ires=ires+index2;
				
			}
			System.out.println();
		}
		
		System.out.println("Ires: "+ires);
		System.out.println("count: "+count);

	}

}
