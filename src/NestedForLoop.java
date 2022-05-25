
public class NestedForLoop {

	public static void main(String[] args) {
		
		//to print 6 number in sequence
		for(int i=1;i<=6;i++)//outer loop
		{
			//take value in sequence as 1
			int value=1;
			for(int j=1;j<=i;j++)//nested loop/Inner loop
			{
				//multiply the value with 2 for i times
				value=value*2;
			}
			//print value
			System.out.println(value);
		}

	}

}
