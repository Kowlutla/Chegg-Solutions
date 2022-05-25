package com.Chegg.Account;

import java.util.ArrayList;
import java.util.Date;

public class Account {

	// Attributes Of Account Class
	private int id;
	private String name;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions;

	// Constructor with Account id,name and balance
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.dateCreated = new Date();
		this.transactions = new ArrayList<Transaction>();
	}

	// Default Constructor to Create Account Object
	public Account() {
		this.name = "UnKnown";
		this.id = 1;
		this.balance = 0;
		this.dateCreated = new Date();
		this.transactions = new ArrayList<Transaction>();
	}

	// Constructor to create Account with id and balance
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.name = "UnKnown";
		this.dateCreated = new Date();
		this.transactions = new ArrayList<Transaction>();
	}

	// Setters and Getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	// Method to check two objects or equal or not
	public boolean equals(Object obj) {
		Account a = (Account) obj;
		return this.id == a.id;
	}

	// Method to withdraw amount
	public boolean withdraw(double amount) {
		if (this.balance < amount) {
			return false;
		} else {
			this.balance = this.balance - amount;
			transactions.add(new Transaction(new Date(), 'W', amount, this.balance, " Withdrawn"));
			return true;
		}
	}

	// Method to deposit amount
	public void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Amoutn deposited: " + amount);
		transactions.add(new Transaction(new Date(), 'D', amount, this.balance, " Deposited"));
	}

	// Method to check balance
	public double checkBalance() {
		return this.balance;
	}

	// Method to print transaction details
	public String miniStatement() {
		String s = "";
		if (transactions.size() <= 10)// if less than 10 transactions return all transaction
		{
			for (int i = 0; i < transactions.size(); i++) {
				s = s + transactions.get(i) + "\n";
			}
		} else// if more than 10 transactions return last 10 transactions
		{
			int start = transactions.size() - 10;
			for (int i = start; i < transactions.size(); i++) {
				s = s + transactions.get(i) + "\n";
			}
		}
		return s;
	}

}
