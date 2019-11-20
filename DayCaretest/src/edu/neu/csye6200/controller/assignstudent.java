package edu.neu.csye6200.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.neu.csye6200.model.Classdatahandler;
import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Weights;

public class assignstudent {
		private static int counter[] = {0,0,0,0,0,0}; 



	public static void toclass(Student obj) {
		
		if((Weights.getclasstype(obj.getAge())).getCategory() == 1)
		{	
			int name = Weights.getclasstype(obj.getAge()).getCategory();
			if((Classdatahandler.getclassrooms(name)).isEmpty()){
				System.out.println("Entered here first");
				Classroom classroom = new Classroom(1, counter[0]);
				Classdatahandler.addclass(classroom);
				Classdatahandler.getclass(classroom).addstudent(obj);
			}
		
			else{
				System.out.println("entered else");
				for (Classroom classroom: Classdatahandler.getclassrooms(name)) {
					System.out.println("entered here");
					System.out.println(classroom.getsize());
					if(classroom.getsize()<= Weights.getmaxstudents(obj.getAge())){
						Classdatahandler.getclass(classroom).addstudent(obj);
					}
					else {
						System.out.println("Entered here");
						Classroom classroomnew = new Classroom(1, counter[0]++);
						Classdatahandler.addclass(classroomnew);
						Classdatahandler.getclass(classroomnew).addstudent(obj);
					}
				}
				
			}
		}
		
	}
}
