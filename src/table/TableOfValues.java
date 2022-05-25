package table;

public class TableOfValues {

	public static void main(String[] args) {
	
		System.out.println("N\t10*N\t100*N\t1000*N");//to print the top of table headings
		for(int N=1;N<=6;N++)//loop to print the table values
		{
			System.out.printf("%d\t%d\t%d\t%d",N,N*10,N*100,N*1000);//print the ones,tens,hundreds,thousands
			System.out.println();//to print new line after printing each row of table
		}
	}

}
