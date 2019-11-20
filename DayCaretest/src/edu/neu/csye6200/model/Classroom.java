package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
	private List<Student> students;
	private List<Teacher> teachers;
	private Group group;
	private String classname;
	private int classnum;
	private int groups;
	private int teachernum;
	
	
	public Classroom(String classname, int classnum) {
		super();
		this.students = new ArrayList<Student>();
		this.teachers = new ArrayList<Teacher>();
		this.groups = 1;
		//this.group = new Group();
		this.classname = classname;
		this.classnum = classnum;
	}
	
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
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
	public void addstudent(Student obj) {
		
		students.add(obj);
		
	}
	public int getsize() {
		return this.students.size();
	}
	@Override
	public String toString() {
		return "Classroom [students=" + students + ", teachers=" + teachers + ", classname=" + classname + ", classnum=" + classnum + ", groups=" + groups + ", teachernum="
				+ teachernum + "]";
	}
	
	
}
