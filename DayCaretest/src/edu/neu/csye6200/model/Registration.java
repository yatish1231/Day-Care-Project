package edu.neu.csye6200.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Registration {
	
	private Student student;
	private static HashMap<Student, LocalDate> registrations = new HashMap<Student, LocalDate>();
	
	public Registration(Student student) {
		super();
	}
	
	public static void RegisterUsingCSV(Student student) {
		Registration.registrations.putIfAbsent(student, LocalDate.now());
	}
	public static Set<Map.Entry<Student, LocalDate>> getRegistrationRecord(){
		return registrations.entrySet();
	}
	public static HashMap<Student, LocalDate> getAllRegistrations(){
		return registrations;
	}
}
