package removeItemInDynamicArray;

public class customer_rec {

	public String name;
	public double limit;
	int no_parts;

	public customer_rec(String name, double limit, int no_parts) {
		this.name = name;
		this.limit = limit;
		this.no_parts = no_parts;
	}

	
	//Method to remove customer record from dynamic array ORDERS with a "name" field matches the item
	public void removeItem(customer_rec[] ORDERS, int count, String item) {
		
		if (count == 0) //if ORDERS is empty
		{
			return;
		}
		//initializing position of customer with name matches item
		int position = -1;

		//to find the position where particular customer present with name matches to item 
		for (int i = 0; i < count; i++) 
		{
			if (ORDERS[i].name.equalsIgnoreCase(item)) //if customer name natches item
			{
				position = i;//store that index in position
				break;//come out from loop
			}
		}

		if (position == -1) //if no name matches to the item
		{
			System.out.println("name not found ");
		} 
		else //if name matches to item
		{
			for (int i = position; i < count - 1; i++) 
			{
				ORDERS[i] = ORDERS[i + 1];//copy all next customer to the current customer position
			}
			ORDERS[count - 1] = null;//make last customer as null  to remove
			count--;//decrement no of customer by 1
		}
	}

}
