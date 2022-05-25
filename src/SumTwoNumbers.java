
public class SumTwoNumbers {

	public static void main(String[] args) {
		
		int m=10;
		int n=5;
		System.out.println(add(m,n));

	}

	private static int add(int m, int n) {
		
		if(n==0)
		{
			return m;
		}
		if(n>0)
		{
			m=m+1;
			return add(m,n-1);
		}
		else
		{
			m=m-1;
			return m+add(m,n+1);
		}
	}

}
