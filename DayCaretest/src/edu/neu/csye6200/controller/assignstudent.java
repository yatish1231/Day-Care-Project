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
	

	public assignstudent() {
			super();
			// TODO Auto-generated constructor stub
		}


	public static boolean toclass(Student obj) {
		
		if((Weights.getclasstype(obj.getAge())).getCategory().equals("Under12"))
		{	
			String name = Weights.getclasstype(obj.getAge()).getCategory();
			if((Classdatahandler.getclassrooms(name).isEmpty())){
				//int count1 =0;
				Classroom classroom = new Classroom("Under12", counter[0]);
				Classdatahandler.addclass(classroom);
				Classdatahandler.getclass(classroom).addstudent(obj);
			}
			else{
				for (Classroom classroom : Classdatahandler.getclassrooms(name)) {
					if(classroom.getsize()<= Weights.getmaxstudents(obj.getAge())){
						Classdatahandler.getclass(classroom).addstudent(obj);
					}
					else {
						Classroom classroomnew = new Classroom("Under12", counter[0]++);
						Classdatahandler.addclass(classroomnew);
						Classdatahandler.getclass(classroomnew).addstudent(obj);
					}
				}
				
			}
		}
		return true;
	}
}
