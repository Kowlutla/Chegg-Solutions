
public class Bar {

	public static void main(String[] args) {
	
		for(int i=1;i<=10;i++)
			System.out.println(bar(i));

	}

	public static int bar(int n)
	{
		if(n<=0)
			return 0;
		return (n-bar(bar(n-1)));
	}
}
