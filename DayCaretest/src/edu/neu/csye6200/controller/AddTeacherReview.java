package edu.neu.csye6200.controller;

import java.time.LocalDate;

import edu.neu.csye6200.model.Review;
import edu.neu.csye6200.model.Teacher;

public class AddTeacherReview {

	public Teacher annualReview(Teacher obj, String review) {
		
		Review temp = new Review();
		temp.setEmployeeReview(review);
		temp.setReviewDate(LocalDate.now());
		
		obj.getReview().add(temp);
		
		
		
		return obj;
		
	}
}
