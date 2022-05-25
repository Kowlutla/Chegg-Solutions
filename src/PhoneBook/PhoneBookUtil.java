package PhoneBook;

import java.util.Scanner;

public class PhoneBookUtil {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Size of Phone Book: ");
		int size=sc.nextInt();//obtaining its size as a command line argument
		PhoneBook phonebook=new PhoneBook(size);//Passing maximum size of phone book
		phonebook.readRecord();//read the record
		phonebook.readRecord();//read the record
		phonebook.readRecord();//read the record
		phonebook.readRecord();//read the record
		phonebook.writeBook();//write complete phone book
		phonebook.writeRecord(3);//write record 3
		System.out.println("Record 1 :\n"+phonebook.toString(1));//return and print the record1 
		sc.close();
		

	}

}






