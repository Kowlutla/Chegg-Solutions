package fruits;

import java.util.Collections;
import java.util.Scanner;

public class PoD {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		FruitBasket fruitBasket=new FruitBasket();
		for(int i=1;i<=5;i++)
		{
			String name=in.next();
			String colour=in.next();
			double weight=in.nextDouble();
			fruitBasket.addFruit(new Fruit(name,colour,weight));
		}
		
		System.out.println("Before Sort: ");
		System.out.println(fruitBasket);
		
		Collections.sort(fruitBasket.basket);
		System.out.println("After Sort: ");
		System.out.println(fruitBasket);
		in.close();
		System.out.println("END OF OUTPUT");

	}

}
