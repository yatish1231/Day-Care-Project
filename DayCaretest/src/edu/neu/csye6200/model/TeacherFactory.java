package edu.neu.csye6200.model;

import java.time.LocalDate;

public class TeacherFactory implements TeacherFactoryInterface{

	public static Teacher getobject() {
		return new Teacher();
	}
	
	public static Teacher getobject(String csvData) {
		String[] tokens = csvData.split(",");
		int id= Integer.parseInt(tokens[0]); 
		String firstname = tokens[1];
		String lastname = tokens[2];
		int credits= Integer.parseInt(tokens[3]);
		
		int year = Integer.parseInt(tokens[4]);
		int month = Integer.parseInt(tokens[5]);
		int day = Integer.parseInt(tokens[6]);
		
		LocalDate regDate = LocalDate.of(year,month,day);
		
		 String review = tokens[7];
		
		Teacher teacher = getobject();
		teacher.setId(id);
		teacher.setFirstname(firstname);
		teacher.setLastname(lastname);
		teacher.setCredits(credits);
		teacher.setReview(review, regDate);
		return teacher;
	}
}

