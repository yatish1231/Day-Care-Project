package edu.neu.csye6200.model;

import java.util.List;

public class Student extends Person{

	private int grade;
	private int age;
	private String parentfirstname;
	private String parentlastname;
	private String address;
	private int phonenum;
	private Teacher teacher;
	private List<Immunization> record;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int grade, int age, String parentfirstname, String parentlastname, String address, int phonenum) {
		super();
		this.grade = grade;
		this.age = age;
		this.parentfirstname = parentfirstname;
		this.parentlastname = parentlastname;
		this.address = address;
		this.phonenum = phonenum;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getParentfirstname() {
		return parentfirstname;
	}

	public void setParentfirstname(String parentfirstname) {
		this.parentfirstname = parentfirstname;
	}

	public String getParentlastname() {
		return parentlastname;
	}

	public void setParentlastname(String parentlastname) {
		this.parentlastname = parentlastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	

	public List<Immunization> getRecord() {
		return record;
	}

	public void setRecord(List<Immunization> record) {
		this.record = record;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", age=" + age + ", parentfirstname=" + parentfirstname + ", parentlastname="
				+ parentlastname + ", address=" + address + ", phonenum=" + phonenum + ", teacher=" + teacher
				+ ", getId()=" + getId() + ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname()
				+ "]";
	}

	
	
	
	
}
