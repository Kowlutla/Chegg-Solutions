package com.Chegg.Address;

public class Entry implements Comparable<Entry> {
	// attributes of entry
	private String name;
	private String homeAddress;
	private String teliphone;

	// Constructor
	public Entry(String name, String homeAddress, String teliphone) {
		this.name = name;
		this.homeAddress = homeAddress;
		this.teliphone = teliphone;
	}
	// Setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getTeliphone() {
		return teliphone;
	}
	public void setTeliphone(String teliphone) {
		this.teliphone = teliphone;
	}
	// String representation of entry object
	public String toString() {
		return "Name: " + this.name + "\nAddress: " + this.homeAddress + "\nTeliphone: " + this.teliphone;
	}
	// compare method to sort the array of entry objects in ascending order
	@Override
	public int compareTo(Entry o) {
		if (this.name.compareToIgnoreCase(o.name) > 0) {
			return 1;
		} else if (this.name.compareToIgnoreCase(o.name) < 0) {
			return -1;
		} else
			return 0;
	}
}
