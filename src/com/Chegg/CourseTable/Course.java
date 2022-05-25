package com.Chegg.CourseTable;

public class Course {
	
	//Attributes
	private String code;
	private String title;
	private int semester;
	private int year;
	private String grade;
	
	//Constructor
	public Course(String code, String title, int semester, int year, String grade) {
		this.code = code;
		this.title = title;
		this.semester = semester;
		this.year = year;
		this.grade = grade;
	}

	//Setters
	public void setCode(String code) {
		this.code = code;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	//Getters
	public String getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public int getSemester() {
		return semester;
	}

	public int getYear() {
		return year;
	}

	public String getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Course [code=" + code + ", title=" + title + ", semester=" + semester + ", year=" + year + ", grade="
				+ grade + "]";
	}
	
	
}
