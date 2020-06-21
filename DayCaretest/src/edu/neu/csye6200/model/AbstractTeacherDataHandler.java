package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTeacherDataHandler {

	public static List<Teacher> teacherList = new ArrayList<>();
	static int counter;
	public List<Teacher> addTeacherObj(String csv){
		return teacherList;
	}
	
	public static List<Teacher> getteacherlist(){
		return teacherList;
	}
	
	public static Teacher fetchTeacher() {
		return teacherList.get(counter);
	}
	
}
