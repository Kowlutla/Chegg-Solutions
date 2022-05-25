package contacts;

import java.util.Scanner;

public class ContactListMain {

	public static void main(String[] args) {
		
		System.out.println("My Contact List:");
		Scanner scanner=new Scanner(System.in);
		ContactList contactList=new ContactList();
		boolean keepGoing=true;
		String userInputStr="";
		String contactName="";
		String contactPhone="";
		String contactEmail="";
		int position;
		while(keepGoing)
		{
			System.out.println("");
			System.out.println("Main Menu: ");
			System.out.println("Enter A to add new contact..");
			System.out.println("Enter R to remove a contact..");
			System.out.println("Enter P to print all contacts..");
			System.out.println("Enter C to clear all contacts..");
			System.out.println("Enter X to quit..");
			System.out.println("");
			userInputStr=scanner.nextLine();
			if(userInputStr.equalsIgnoreCase("A"))
			{
				System.out.println("Enter the contact name: ");
				contactName=scanner.nextLine();
				System.out.println("Enter the contact phone: ");
				contactPhone=scanner.nextLine();
				System.out.println("Enter the contact email(Optional).Click return if no mail");
				contactEmail=scanner.nextLine();
				if(contactEmail.length()==0)
				{
					contactList.addContact(new PersonalContact(contactName,contactPhone));
				}
				else
				{
					contactList.addContact(new PersonalContact(contactName,contactPhone,contactEmail));
				}
			}
			else if(userInputStr.equalsIgnoreCase("R"))
			{
				System.out.println("Enter name of the conatct to remove: ");
				contactName=scanner.nextLine();
				if(contactList.removeContact(contactName))
				{
					System.out.println("Contact Info for "+contactName+" was removed");
				}
				else
				{
					System.out.println("Contact Info for "+contactName+" was not found in contact list ");
				}
			}
			else if(userInputStr.equalsIgnoreCase("P"))
			{
				System.out.println("Your contacts: ");
				System.out.println(getContactListAsString(contactList.getContactList()));
			}
			else if(userInputStr.equalsIgnoreCase("C"))
			{
				contactList.clearContactList();
				System.out.println("All Contacts are removed");
			}
			else if(userInputStr.equalsIgnoreCase("X"))
			{
				keepGoing=false;
			}
			else 
			{
				System.out.println("Unrecognized input");
			}
			System.out.println("Bye for now.");
		}
		scanner.close();
	}

	
	private static String getContactListAsString(PersonalContact[] contactList) {
		
		StringBuffer sb=new StringBuffer();
		int numContacts=contactList.length;
		if(numContacts==0)
		{
			sb.append("No contacts");
		}
		else
		{
			for(int i=0;i<numContacts;i++)
			{
				sb.append(i+1).append(" ").append(contactList[i]).append("\n");
			}
		}
		return sb.toString();
	}

}
