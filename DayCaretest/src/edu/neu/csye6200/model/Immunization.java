package edu.neu.csye6200.model;

import java.time.LocalDate;
import java.util.Calendar;

public class Immunization {
	
	private LocalDate date;
	private Calendar calender; 
	//private Student student;
	private String record;
	private int id;
	private int shotnumber;
	
	public Immunization(int id,String record,int shotnumber) {
		super();
		this.calender = Calendar.getInstance();
		this.id = id;
		this.record = record;
		this.shotnumber = shotnumber;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Calendar getCalender() {
		return calender;
	}
	public void setCalender(Calendar calender) {
		this.calender = calender;
	}
	public void setday(int obj) {
		calender.set(Calendar.DATE, obj);
	}
	public void setMonth(int obj) {
		calender.set(Calendar.MONTH, obj);
	}
	public void setYear(int obj) {
		calender.set(Calendar.YEAR, obj);
	}
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getShotnumber() {
		return shotnumber;
	}
	public void setShotnumber(int shotnumber) {
		this.shotnumber = shotnumber;
	}
	
	
	
	
}
