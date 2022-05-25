package foo;

import java.util.Scanner;

public class FooMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//creating the object Foo F1 using regular constructor
		//with variables are "CSIS3101",32 and 100
		Foo F1=new Foo("CSIS3101",32,100);
		//creating the object Foo F2 using default constructor
		Foo F2=new Foo();
		//Asking user to enter sFoo1 to set for F2 
		System.out.println("Enter sFoo1: ");
		String sFoo1=sc.nextLine();//reading sFoo1
		F2.setsFoo1(sFoo1);//set sFoo1 to F2
		
		//Asking user to enter iFoo2 to set for F2 
		System.out.println("Enter iFoo2: ");
		int iFoo2=sc.nextInt();//reading iFoo2
		F2.setiFoo2(iFoo2);//set iFoo2 to F2
		
		//Asking user to enter dFoo3 to set for F2 
		System.out.println("Enter dFoo3: ");
		double dFoo3=sc.nextDouble();//reading dFoo3
		F2.setdFoo3(dFoo3);//set dFoo3 to F2
		
		//printing F1 and F2 objects
		System.out.println("F1 Object: ");
		System.out.println(F1);
		
		System.out.println("F2 Object: ");
		System.out.println(F2);
		
	
		if(compareFoo(F1,F2))//if calcFoo of first object is greater than second object
		{
			System.out.println("Foo with sFoo1 "+F1.getsFoo1()+" have higher calcFoo value With "+F1.calcFoo());
		}
		else//if calcFoo of first object is not greater than second object
		{
			System.out.println("Foo with sFoo1 "+F2.getsFoo1()+" have higher calcFoo value with "+F2.calcFoo());
		}
		sc.close();
	}

	
	//Method to compare calcFoo values of two Foo objects 
	private static boolean compareFoo(Foo f1, Foo f2) {
		
		//return true if calcFoo value of first Foo object is greater than second Foo object
		if(f1.calcFoo()>f2.calcFoo())
		{
			return true;
		}
		else //else return false
		{
			return false;
		}
	}

}
