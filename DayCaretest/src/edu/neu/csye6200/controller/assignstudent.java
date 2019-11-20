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
				Classroom classroom = new Classroom(1, counter[0]);
				Classdatahandler.addclass(classroom);
				Classdatahandler.getclass(classroom).addstudent(obj);
				Classdatahandler.getclass(classroom).addgroup();
				Classdatahandler.getclass(classroom).addtogroup(obj);
			}
		
			else{
				for (Classroom classroom: Classdatahandler.getclassrooms(name)) {
					if(classroom.getsize()<= Weights.getmaxstudents(obj.getAge())){
						Classdatahandler.getclass(classroom).addstudent(obj);
						Classdatahandler.getclass(classroom).addtogroup(obj);
					}
					else {
						Classroom classroomnew = new Classroom(1, counter[0]++);
						Classdatahandler.addclass(classroomnew);
						Classdatahandler.getclass(classroomnew).addstudent(obj);
						Classdatahandler.getclass(classroom).addtogroup(obj);
					}
				}
				
			}
		}
		else if((Weights.getclasstype(obj.getAge())).getCategory() == 2)
		{	
			int name = Weights.getclasstype(obj.getAge()).getCategory();
			if((Classdatahandler.getclassrooms(name)).isEmpty()){
				Classroom classroom = new Classroom(2, counter[1]);
				Classdatahandler.addclass(classroom);
				Classdatahandler.getclass(classroom).addstudent(obj);
				Classdatahandler.getclass(classroom).addtogroup(obj);
			}
		
			else{
				for (Classroom classroom: Classdatahandler.getclassrooms(name)) {
					if(classroom.getsize()<= Weights.getmaxstudents(obj.getAge())){
						Classdatahandler.getclass(classroom).addstudent(obj);
						Classdatahandler.getclass(classroom).addtogroup(obj);
					}
					else {
						Classroom classroomnew = new Classroom(2, counter[1]++);
						Classdatahandler.addclass(classroomnew);
						Classdatahandler.getclass(classroomnew).addstudent(obj);
						Classdatahandler.getclass(classroom).addtogroup(obj);
					}
				}
				
			}
		}
		else if((Weights.getclasstype(obj.getAge())).getCategory() == 3)
		{	
			int name = Weights.getclasstype(obj.getAge()).getCategory();
			if((Classdatahandler.getclassrooms(name)).isEmpty()){
				Classroom classroom = new Classroom(3, counter[2]);
				Classdatahandler.addclass(classroom);
				Classdatahandler.getclass(classroom).addstudent(obj);
				Classdatahandler.getclass(classroom).addgroup();
				Classdatahandler.getclass(classroom).addtogroup(obj);
			}
		
			else{
				for (Classroom classroom: Classdatahandler.getclassrooms(name)) {
					if(classroom.getsize()<= Weights.getmaxstudents(obj.getAge())){
						Classdatahandler.getclass(classroom).addstudent(obj);
						Classdatahandler.getclass(classroom).addtogroup(obj);
					}
					else {
						Classroom classroomnew = new Classroom(3, counter[2]++);
						Classdatahandler.addclass(classroomnew);
						Classdatahandler.getclass(classroomnew).addstudent(obj);
						Classdatahandler.getclass(classroom).addtogroup(obj);
					}
				}
				
			}
		}
		else if((Weights.getclasstype(obj.getAge())).getCategory() == 4)
		{	
			int name = Weights.getclasstype(obj.getAge()).getCategory();
			if((Classdatahandler.getclassrooms(name)).isEmpty()){
				Classroom classroom = new Classroom(4, counter[3]);
				Classdatahandler.addclass(classroom);
				Classdatahandler.getclass(classroom).addstudent(obj);
				Classdatahandler.getclass(classroom).addgroup();
				Classdatahandler.getclass(classroom).addtogroup(obj);
			}
		
			else{
				for (Classroom classroom: Classdatahandler.getclassrooms(name)) {
					if(classroom.getsize()<= Weights.getmaxstudents(obj.getAge())){
						Classdatahandler.getclass(classroom).addstudent(obj);
						Classdatahandler.getclass(classroom).addtogroup(obj);
					}
					else {
						Classroom classroomnew = new Classroom(4, counter[3]++);
						Classdatahandler.addclass(classroomnew);
						Classdatahandler.getclass(classroomnew).addstudent(obj);
						Classdatahandler.getclass(classroom).addtogroup(obj);
					}
				}
				
			}
		}
		else if((Weights.getclasstype(obj.getAge())).getCategory() == 5)
		{	
			int name = Weights.getclasstype(obj.getAge()).getCategory();
			if((Classdatahandler.getclassrooms(name)).isEmpty()){
				Classroom classroom = new Classroom(5, counter[4]);
				Classdatahandler.addclass(classroom);
				Classdatahandler.getclass(classroom).addstudent(obj);
				Classdatahandler.getclass(classroom).addgroup();
				Classdatahandler.getclass(classroom).addtogroup(obj);
			}
		
			else{
				for (Classroom classroom: Classdatahandler.getclassrooms(name)) {
					if(classroom.getsize()<= Weights.getmaxstudents(obj.getAge())){
						Classdatahandler.getclass(classroom).addstudent(obj);
						Classdatahandler.getclass(classroom).addtogroup(obj);
					}
					else {
						Classroom classroomnew = new Classroom(5, counter[4]++);
						Classdatahandler.addclass(classroomnew);
						Classdatahandler.getclass(classroomnew).addstudent(obj);
						Classdatahandler.getclass(classroom).addtogroup(obj);
					}
				}
				
			}
		}
		else if((Weights.getclasstype(obj.getAge())).getCategory() == 6)
		{	
			int name = Weights.getclasstype(obj.getAge()).getCategory();
			if((Classdatahandler.getclassrooms(name)).isEmpty()){
				Classroom classroom = new Classroom(6, counter[5]);
				Classdatahandler.addclass(classroom);
				Classdatahandler.getclass(classroom).addstudent(obj);
				Classdatahandler.getclass(classroom).addgroup();
				Classdatahandler.getclass(classroom).addtogroup(obj);
			}
		
			else{
				for (Classroom classroom: Classdatahandler.getclassrooms(name)) {
					if(classroom.getsize()<= Weights.getmaxstudents(obj.getAge())){
						Classdatahandler.getclass(classroom).addstudent(obj);
						Classdatahandler.getclass(classroom).addtogroup(obj);
					}
					else {
						Classroom classroomnew = new Classroom(6, counter[5]++);
						Classdatahandler.addclass(classroomnew);
						Classdatahandler.getclass(classroomnew).addstudent(obj);
						Classdatahandler.getclass(classroom).addtogroup(obj);
					}
				}
				
			}
		}
	
	}
}
