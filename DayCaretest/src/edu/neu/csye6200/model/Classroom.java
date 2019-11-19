package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
	private List<Student> students;
	private List<Teacher> teachers;
	private List<List<Student>> grouplist; 
	private String classname;
	private int classnum;
	private int groups;
	private int teachernum;
	
	
	public Classroom(String classname, int classnum) {
		super();
		this.students = new ArrayList<Student>();
		this.teachers = new ArrayList<Teacher>();
		this.groups = 1;
		this.grouplist = new ArrayList<List<Student>>();
		this.classname = classname;
		this.classnum = classnum;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getClassnum() {
		return classnum;
	}
	public void setClassnum(int classnum) {
		this.classnum = classnum;
	}
	public int getGroups() {
		return groups;
	}
	public void setGroups(int groups) {
		this.groups = groups;
	}
	public int getTeachernum() {
		return teachernum;
	}
	public void setTeachernum(int teachernum) {
		this.teachernum = teachernum;
	}
	public List<List<Student>> getGrouplist() {
		return grouplist;
	}
	public void setGrouplist(List<List<Student>> grouplist) {
		this.grouplist = grouplist;
	}
	public void addstudent(Student obj) {
		
		students.add(obj);
		
	}
	public int getsize() {
		return this.students.size();
	}
	
}
