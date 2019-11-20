package edu.neu.csye6200.view;

import java.util.List;

import edu.neu.csye6200.model.Classdatahandler;
import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.Group;

public class Studentview {
		
	public static void viewall() {
		for (List<Classroom> classes : Classdatahandler.getallclasses()) {
//			System.out.println(classes);
			for (Classroom classroom : classes) {
				System.out.println(classroom.getStudents()+"\n");
				System.out.println(classroom.getGroups().size());
				}
			}
		}
	}
