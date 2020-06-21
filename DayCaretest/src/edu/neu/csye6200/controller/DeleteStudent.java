/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.controller;
import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.model.Classdatahandler;
import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.Group;
import edu.neu.csye6200.model.Student;

public class DeleteStudent {

	public void removeStudentwithID(int studentID) {
		
		
		for( int i = 1; i<=6; i++) {
			
			for(Classroom obj: Classdatahandler.getclassrooms(i)) {
				
				for (Group section: obj.getGroups()) {
				
					for (Student student: section.getStudents()) {
						
						if(student.getId() == studentID) {
							section.getStudents().remove(student);
						}
					}
				}
			}
			
		}
		
	
	
	}
	
	
	
	
	
}

/**
 *
 * @author yccha
 */

