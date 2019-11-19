package edu.neu.csye6200.model;

public class Teacher extends Person{
	private int credits;

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
	
	
}
