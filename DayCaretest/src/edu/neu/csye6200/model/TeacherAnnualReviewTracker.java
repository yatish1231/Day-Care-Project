package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherAnnualReviewTracker {

	
	public List<Teacher> trackReviews () {
	
		List<Teacher> pendingTeachers = new ArrayList<>();
		for ( Teacher t: TeacherDataHandler.getteacherlist()) {
			
			int temp = t.getReview().size() - 1;
			
			
			int difference = Time.compareDates(t.getReview().get(temp).reviewDate);
					
			
			if(difference >= 11) {
				pendingTeachers.add(t);
			}
			
		}
		
		return pendingTeachers;
	}
	
	
	
	
	
	
}
