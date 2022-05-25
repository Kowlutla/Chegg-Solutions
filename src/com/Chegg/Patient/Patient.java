package com.Chegg.Patient;
class Patient implements Comparable<Patient> {
	// Attributes of Patients
	String name;
	int age;
	String province;
	String gender;
	// Constructor to create Patient
	public Patient(String name, int age, String province, String gender) {
		this.name = name;
		this.age = age;
		this.province = province;
		this.gender = gender;
	}
	// toString method to return Patient object as String form
	public String toString() {
		return name + "\t" + age + "\t" + province + "\t" + gender;
	}
	// Method to compare patient objects and sort them based on condition
	public int compareTo(Patient p) {
		// Sort based on age
		if (this.age > p.age) {
			return 1;
		} else if (this.age < p.age) {
			return -1;
		} else// if two patient ages are same sort based on province
		{
			if (this.province.compareTo(p.province) > 0) {
				return 1;
			} else if (this.province.compareTo(p.province) < 0) {
				return -1;
			} else // if two patient ages and provinces are same sort them based on gender
			{
				return this.gender.compareTo(p.gender);
			}
		}
	}
}
