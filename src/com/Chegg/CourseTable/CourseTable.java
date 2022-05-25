package com.Chegg.CourseTable;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseTable {

	//list to hold the course list
	ArrayList<Course> courses;

	//Constructor
	public CourseTable() {
		courses = new ArrayList<Course>();
	}
	//Method to view the course table
	public void viewTable() {
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));
		}
	}

	//Method to insert course
	public void insert(Course c) {
		courses.add(c);
	}

	//Method to delete course with specified code
	public boolean delete(String code) {
		for (int i = 0; i < courses.size(); i++) {
			Course c = courses.get(i);
			if (c.getCode().equalsIgnoreCase(code)) {
				delete(i);
				return true;
			}
		}
		return false;
	}

	//utility method to delete course present at index i
	private void delete(int i) {
		courses.remove(i);
	}

	//Method to update course with new course code in place of old course code
	public boolean update(String oldCode, String newCode) {
		//look for all courses in list
		for (int i = 0; i < courses.size(); i++) {
			Course c = courses.get(i);
			//if course found with given code replace it with new course
			if (c.getCode().equalsIgnoreCase(oldCode)) {
				c.setCode(newCode);
				return true;//return true
			}
		}
		//if no course found with given course code return false
		return false;
	}

	//Method to view the course details of specified course code
	public boolean viewSpecificCourse(String code) {
		//look for all courses in list
		for (int i = 0; i < courses.size(); i++) {
			Course c = courses.get(i);
			//if course found with given code
			if (c.getCode().equalsIgnoreCase(code)) {
				System.out.println(c);//print that course details
				return true;//return true
			}
		}
		//if no course found with given course code return false
		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		CourseTable c = new CourseTable();
		int choice;
		do {
			System.out.println(
					"\nEnter 0 to terminate>\nEnter 1 to view the table>\nEnter 2 to insert>\nEnter 3 to delete>\n Enter 4 to update>\nEnter 5 to view a specific course>");

			System.out.println("\nEnter your Choice: ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("\nCourse Table is: ");
				c.viewTable();
			} else if (choice == 2) {
				System.out.println("Enter Course Details: ");
				System.out.print("Code: ");
				String code = sc.nextLine();
				sc.nextLine();
				System.out.print("title: ");
				String title = sc.nextLine();
				System.out.print("Semester: ");
				int sem = sc.nextInt();
				System.out.print("Year: ");
				int year = sc.nextInt();
				System.out.print("Grade: ");
				String grade = sc.nextLine();
				sc.nextLine();

				Course course = new Course(code, title, sem, year, grade);
				c.insert(course);
			}

			else if (choice == 3) {
				boolean deleted = false;
				System.out.print("Enter the code of the course you want to delete:");
				String courseCode = sc.nextLine();
				sc.nextLine();
				deleted = c.delete(courseCode);
				while (!deleted) {
					System.out.println("Invalid Course Code.. Please try again");
					System.out.print("Enter the code of the course you want to delete:");
					courseCode = sc.next();
					deleted = c.delete(courseCode);
				}
			}

			else if (choice == 4) {
				boolean updated = false;
				System.out.print("Enter the code of the course you want to update:");
				String oldCode = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the new Code to update: ");
				String newCode = sc.nextLine();
				sc.nextLine();
				updated = c.update(oldCode, newCode);
				while (!updated) {
					System.out.println("Invalid Course Code.. Please try again");
					System.out.print("Enter the code of the course you want to update:");
					oldCode = sc.nextLine();
					sc.nextLine();
					System.out.println("Enter the new Code to update: ");
					newCode = sc.nextLine();
					sc.nextLine();
					updated = c.update(oldCode, newCode);
				}
			}

			else if (choice == 5) {
				boolean visited = false;
				System.out.println("Enter the code of the coourse to view ");
				String code = sc.nextLine();
				sc.nextLine();
				visited = c.viewSpecificCourse(code);
				while (!visited) {
					System.out.println("Invalid Course Code.. Please try again");
					System.out.println("Enter the code of the coourse to view ");
					code = sc.nextLine();
					sc.nextLine();
					visited = c.viewSpecificCourse(code);
				}
			}

		} while (choice != 0);

		System.out.println("\n* * * THANK YOU * * * ");

	}

}
