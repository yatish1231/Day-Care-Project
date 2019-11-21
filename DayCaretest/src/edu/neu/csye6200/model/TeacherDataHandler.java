package edu.neu.csye6200.model;


import java.util.ArrayList;
import java.util.List;

public class TeacherDataHandler {

	
// 1,Sai,Sreekar,100    ( Format of Data in teacherList) 
	
	public static List<Teacher> teacherList = new ArrayList<>(); // Holds all the data related to Teachers
	private static final String fileName = "C:\\Users\\yccha\\git\\DayCare\\DayCaretest\\src\\edu\\neu\\csye6200\\Teachers.txt";
	
	static int counter = 0;
	
	

	TeacherDataHandler(){
	}

	static {
		FileIO fileutilobj = new FileIO();
		teacherList = fileutilobj.ReadTeacherCSV(fileName);
	}
	public static List<Teacher> getteacherlist(){
		return teacherList;
	}
	
	
	public List<Teacher> addTeacherObj(String csvData) {
		
		teacherList.add(TeacherFactory.getobject(csvData));
		return teacherList;
	}

	
	public static Teacher fetchTeacher() {
		
		return teacherList.get(counter++);
		//post increment of counter to return a new teacher object everytime the method is called
	}
	
	
	
}
