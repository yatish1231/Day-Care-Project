package edu.neu.csye6200.model;

import java.time.LocalDate;
import java.util.List;
import edu.neu.csye6200.controller.AddTeacherReview;
import java.util.ArrayList;

public class Teacher extends Person{
	private int credits;
	private List<Student> students;
	
	private List<Review> review = new ArrayList<>();
        
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
	
	public void setReview(String review, LocalDate date ) {
		
		Review teacherReview = new Review();
		teacherReview.employeeReview = review;
		teacherReview.reviewDate = date;
		
		this.review.add(teacherReview);
		
	}
	
	public List<Review> getReview() {
		return review;
	}
        public Review getRecentReview() {

		

		int lastIndex = this.review.size() - 1;	

		return review.get(lastIndex);

	

	}
}
