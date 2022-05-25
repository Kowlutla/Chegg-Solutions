package com.Chegg.Account;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		// array of 10 names
		String[] names = { "Kowlutla", "Deepu", "Hari", "Hindu", "Aruna", "Roopa", "Keshavaiah", "Lakshmi", "Rahitya",
				"Renuka" };

		// creating new array of 10 Account object
		Account accounts[] = new Account[10];
		/*
		 * Initializing 10 account objects with ID: between 0 to 10 Name: With value of
		 * corresponding names array value balance: with random double values between 0
		 * to 10000
		 */
		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account(r.nextInt(10), names[i], r.nextInt(10000));
		}
		int choice;
		// Enter id to perform operations on account with given id
		System.out.print("Enter an id: ");
		int id = sc.nextInt();
		// checking and getting account if present with specified id
		Account ac = getAccount(accounts, id);
		// if account not present
		if (ac == null) {
			System.out.println("Invalid Account id");
		} else// if account present in array
		{
			// printing menu
			do {
				System.out.println("Main menu\n" + "1: Check balance\n" + "2: Withdraw\n" + "3: Deposit\n"
						+ "4: Print a mini statement\n" + "5: Exit");
				// Asking user to enter choice
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();
				switch (choice) {
				// if choice is 1 =>check balance
				case 1: {
					System.out.println("Current Balance: " + ac.checkBalance());
					break;
				}
				case 2:// if choice is 2 =>WithDraw Amount
				{
					System.out.print("Enter Amount to WithDraw: ");
					double amount = sc.nextDouble();
					if (ac.withdraw(amount)) {
						System.out.println("Successfully Withdrawn Amount " + amount);
						break;
					} else {
						System.out.println("InSufficient Balance ");
						break;
					}

				}
				case 3:// if choice is 3 =>deposit Amount
				{
					System.out.print("Enter Amount to deposite: ");
					double amount = sc.nextDouble();
					ac.deposit(amount);
					break;
				}
				case 4:// if choice is 4 =>Print Mini Statements
				{
					System.out.println("Mini Statement: ");
					System.out.println(ac.miniStatement());
					break;
				}
				case 5:
				{
					System.out.println("Thank You for using....");
					break;
				}
				default:// if any other choice entered
				{
					System.out.println("Invalid Entry... Please try Again");
					break;
				}
				}

			} while (choice != 5);
		}
		sc.close();
	}

	/*
	 * Method to check account is present or not with specified id If present return
	 * the account object not present return null
	 */
	private static Account getAccount(Account[] accounts, int id) {
		for (int i = 0; i < accounts.length; i++) {
			Account ac = accounts[i];
			if (ac.getId() == id) {
				return ac;
			}
		}
		return null;
	}

}
