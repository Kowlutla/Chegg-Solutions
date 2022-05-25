package fruits;

import java.util.ArrayList;

public class FruitBasket {
	
	protected ArrayList<Fruit>basket=new ArrayList<Fruit>();
	
	//constructor
	public FruitBasket() {}
	
	public void addFruit(Fruit frutiToAdd)
	{
		this.basket.add(frutiToAdd);
	}
	
	public String toString()
	{
		String basketContents="FRUIT BASKET:\n";
		for(Fruit fruit:basket)
		{
			basketContents+=fruit.toString()+"\n";
		}
		return basketContents;
	}

}
