/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.model;
import java.util.ArrayList;
import java.util.List;

public class StudentAnnualRegistrationTracker {

	
	public List<Student> trackRegistrations()
	{
		List<Student> pendingRegistrationStudents = new ArrayList<>();
		
		for( int i = 1; i<=6; i++) {
			
			for(Classroom obj: Classdatahandler.getclassrooms(i)) {
				
				for (Group section: obj.getGroups()) {
				
					for (Student student: section.getStudents()) {
								
						
						int difference = Time.compareDates(student.getRegDate());
						
						if(difference >= 11) {
							pendingRegistrationStudents.add(student);
						}
						
					}
				}
			}
		}
		return pendingRegistrationStudents;
	}
	
}

/**
 *
 * @author yccha
 */

