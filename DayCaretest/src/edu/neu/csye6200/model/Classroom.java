package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
	private List<Student> students;
	private List<Teacher> teachers;
	private List<Group> groups;
	private int classname;
	private int classnum;
	private int teachernum;
	private int groupnum = 0; 
	private int count = 0;
	
	
	public Classroom(int classname, int classnum) {
		super();
		this.students = new ArrayList<Student>();
		this.teachers = new ArrayList<Teacher>();
		this.groups = new ArrayList<Group>();
		this.classname = classname;
		this.classnum = classnum;
	}
	
	public List<Group> getGroups() {
		return groups;
	}
	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}
	public int getGroupnum() {
		return groupnum;
	}
	public void setGroupnum(int groupnum) {
		this.groupnum = groupnum;
	}
	public void addgroup() {
		this.groups.add(new Group());
		groups.get(count).setgroupnum(groupnum++);
	}
	public void addtogroup(Student student) {
		if(groups.get(count).getStudents().size()<Weights.getmaxgroup(student.getAge())){
			groups.get(count).addtogroup(student);
		}
		else {
			count++;
			this.addgroup();
			addtogroup(student);
		}
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
	public int getClassname() {
		return classname;
	}
	public void setClassname(int classname) {
		this.classname = classname;
	}
	public int getClassnum() {
		return classnum;
	}
	public void setClassnum(int classnum) {
		this.classnum = classnum;
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
		return students.size();
	}
	@Override
	public String toString() {
		return "Classroom [students=" + students + ", teachers=" + teachers + ", classname=" + classname + ", classnum=" + classnum + ", teachernum="
				+ teachernum + "]";
	}
	
	
}
