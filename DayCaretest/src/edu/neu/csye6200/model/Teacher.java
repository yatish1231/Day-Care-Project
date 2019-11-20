package edu.neu.csye6200.model;

import java.util.List;

public class Teacher extends Person{
	private int credits;
	private List<Student> students;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String firstname, String lastname, int credits) {
		super(id, firstname, lastname);
		this.credits = credits;
		// TODO Auto-generated constructor stub
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
