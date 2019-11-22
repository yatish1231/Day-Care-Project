package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Vaccine;

public class GiveStudentImmunization {

	
	public void giveDose(int id, Student obj) {
	
		for(Vaccine list: obj.getRecord()) {
			if(list.getId() == id) {
				list.setDosage(list.getDosage() + 1);
			}
		}
		
	}
	
}
