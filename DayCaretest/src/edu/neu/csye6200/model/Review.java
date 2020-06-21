package edu.neu.csye6200.model;

import java.time.LocalDate;

public class Review {

	String employeeReview;
	LocalDate reviewDate;

    public String getEmployeeReview() {
        return employeeReview;
    }

    public void setEmployeeReview(String employeeReview) {
        this.employeeReview = employeeReview;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }
	
}
