package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
	int groupnum;
	private List<Student> students;

	public Group(int groupnum) {
		super();
		this.students = new ArrayList<Student>();
		this.groupnum = groupnum;
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
	
}
