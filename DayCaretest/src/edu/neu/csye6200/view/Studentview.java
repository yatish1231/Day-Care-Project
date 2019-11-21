package edu.neu.csye6200.view;

import java.util.List;

import edu.neu.csye6200.model.Classdatahandler;
import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.Group;
import edu.neu.csye6200.model.Student;

public class Studentview {
		
	public static void viewall() {
		for (List<Classroom> classes : Classdatahandler.getallclasses()) {
//			System.out.println(classes);
			for (Classroom classroom : classes) {
				System.out.println("This is the name of the class" + classroom.getClassname());
				for (Group group : classroom.getGroups()) {
					System.out.println("This is teacher name of "+ group.getGroupnum()+ group.getTeacher().getFirstname());
					for (Student students : group.getStudents()) {
						System.out.println("Student name in group "+ group.getGroupnum()+ students.getFirstname());
					}
					System.out.println("\n");
				}
				}
			}
		}
	}
