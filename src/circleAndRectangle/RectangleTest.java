package circleAndRectangle;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Set Length\n2.Set Width\n3.Return Result\n4.Exit");
			System.out.print("Choice: ");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					{
						System.out.print("Enter Length: ");
						r.setLength(sc.nextDouble());
						break;
					}
				case 2:
				{
					System.out.print("Enter Width: ");
					r.setWidth(sc.nextDouble());
					break;
				}
				case 3:
				{
					System.out.println("Results: ");
					System.out.println("Length: "+r.getLength());
					System.out.println("Width: "+r.getWidth());
					System.out.println("Area: "+r.area());
					System.out.println("Perimeter: "+r.perimeter());
					break;
				}
				case 4:
				{
					System.exit(0);
				}
				
			}
		}
			

	}

}
