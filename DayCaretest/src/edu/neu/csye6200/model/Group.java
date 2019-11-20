package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
	int groupnum;
	private List<Student> students;
	private Teacher teacher;

	public Group() {
		super();
		this.students = new ArrayList<Student>();
		
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void addtogroup(Student obj) {
		this.students.add(obj);
	}
	public void setgroupnum(int i) {
		groupnum = i;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void assignteacher(Teacher obj) {
		this.teacher = obj;
	}
}
