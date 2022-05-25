package com.Chegg.Account;

import java.util.Date;

public class Transaction {

	// Attributes of Transaction
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;

	// Constructor
	public Transaction(Date date, char type, double amount, double balance, String description) {
		this.date = date;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	// Setters and Getters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Method to return transaction object as string type
	public String toString() {
		return "ON " + this.date + "\tType: " + this.type + "\tAmount " + this.amount + description
				+ "\tAvailable balance: " + this.balance;
	}

}
