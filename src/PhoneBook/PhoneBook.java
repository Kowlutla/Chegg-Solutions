package PhoneBook;

import java.util.Scanner;

//Phone Book Class
public class PhoneBook {
	
	static Scanner sc=new Scanner(System.in);
	PhoneRecord array[];//contains the array of phone records
	public int count=0;//to count of how many records there actually are
	int total_records; // total records that array can contain
	
	
	//Constructor that takes how many records should store maximum
	public PhoneBook(int total_records)
	{
		this.total_records=total_records;
		array=new PhoneRecord[total_records];//initializing array with max records
	}
	
	//Method to read the record
	public void readRecord()
	{
		if(count==total_records) //if Book is full 
		{
			System.out.println("Phone Book is Full ");
			return;
		}
		
		else //if Book not full take the phone records and store in array
		{
			System.out.println("- - - Reading Phone Record - - - ");
			System.out.print("First name: ");
			String firstName=sc.nextLine();
			System.out.print("Last name: ");
			String lastName=sc.nextLine();
			System.out.print("Number: ");
			String number=sc.nextLine();
			array[count]=new PhoneRecord(firstName,lastName,number);
			count++;
			
		}
	}
	
	//Method to return Phone records details at specific index number
	public String toString(int i)
	{
		//ASSUMING RECORD NUMBERS START FROM 1
		if(i>=count)//if try to take non existing record
		{
			return null;
		}
		//if record found of specific record then return 
		return array[i-1].firstName+" "+array[i-1].lastName+" "+array[i-1].number;
	}
	
	//Method to write phone records details at specific index number
	public void writeRecord(int i)
	{
		//ASSUMING RECORD NUMBERS START FROM 1
		if(i>=count)//if try to take non existing record
		{
			System.out.println("No record found..");
		}
		//if record found at specific record then print records
		System.out.println("Phone record "+i);
		PhoneRecord record=array[i-1];
		System.out.println(record.firstName+" "+record.lastName+" "+record.number);
	}

	
	//Method to Write the complete phoneBook
	public void writeBook()
	{
		
		if(count==0) //if no records in book
		{
			System.out.println("No Records in PhoneBook ");
			
		}
		else//if records in phone book
		{
			System.out.println("Phone Book: ");
			for(int i=0;i<count;i++)
			{
				PhoneRecord record=array[i];
				System.out.println(record.firstName+" "+record.lastName+" "+record.number);
			}
		}
		System.out.println();
	}

}
