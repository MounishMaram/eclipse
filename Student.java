package com.mile1.bean;

public class Student {
	String name;
	String grade;
	int marks[];
	public Student(String name, String grade, int[] marks) {
		super();
		this.name = name;
		this.grade = grade;
		this.marks = marks;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
}
