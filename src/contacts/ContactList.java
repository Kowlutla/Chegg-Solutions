package contacts;

import java.util.Arrays;

public class ContactList {
	private static int INTIAL_LENGTH=3;
	private PersonalContact[]contacts;
	private int numContacts;
	
	public ContactList()//Constructor that initializes the list
	{
		contacts=new PersonalContact[INTIAL_LENGTH];
		this.numContacts=0;
	}
	
	public boolean isEmpty()
	{
		if(numContacts==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//method to add the contact to list
	public void addContact(PersonalContact contact)
	{
		if(isFull())//if contactlist if full  expand the list and then add contact
		{
			expandList();
		}
		contacts[numContacts]=contact;
		numContacts++;
	}
	
	public boolean removeContact(String targetName)
	{
		if(isEmpty())
		{
			return false;
		}
		else
		{
			boolean isThere=false;
			int position=-1;
			for(int i=0;i<numContacts;i++)
			{
				if(contacts[i].getName().equals(targetName))
				{
					isThere=true;
					position=i;
					break;
				}
			}
			if(isThere)//If contact name find at specific position copy all contacts details after that position to previous positions
			{	//then make last contact as null 
				for(int i=position;i<numContacts-1;i++)
				{
					contacts[i]=contacts[i+1];
				}
				contacts[numContacts-1]=null;
				numContacts--;
				compressList();//compress the list if eligible for compression
				return true;
			}
			else
			{
				return false;
			}
		}
		
	}
	
	public PersonalContact[] getContactList()
	{
		if(isEmpty())//if  contactlist is empty returns null
		{
			return null;
		}
		PersonalContact[]result=new PersonalContact[numContacts];//not null returns the contacts 
		for(int i=0;i<numContacts;i++)
		{
			result[i]=contacts[i];
		}
		return result;
	}
	
	public void clearContactList()//remove all contacts in list
	{
		Arrays.fill(contacts, null);
		numContacts=0;
	}
	
	public boolean isFull()//to check whether list is full or not
	{
		if(numContacts==INTIAL_LENGTH)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	public void expandList()//to expand the list by doubling its size
	{
		int length=INTIAL_LENGTH;
		PersonalContact temp[]=new PersonalContact[INTIAL_LENGTH*2];
		System.arraycopy(contacts, 0, temp, 0, length);
		contacts=temp;
		INTIAL_LENGTH=INTIAL_LENGTH*2;
	}
	
	public void compressList()//compressing the list decreasing length by 2
	{
		int length=INTIAL_LENGTH;
		if(length<=(INTIAL_LENGTH/2)/2)
		{
			INTIAL_LENGTH=INTIAL_LENGTH/2;
		}
		PersonalContact[]temp=new PersonalContact[INTIAL_LENGTH];
		System.arraycopy(contacts, 0, temp, 0, length);
		contacts=temp;
	}
}
