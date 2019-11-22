package edu.neu.csye6200.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

	
	
	
public List<Teacher> ReadTeacherCSV(String fileName) {
		
		List<Teacher> teacherList = new ArrayList<>();
		
		try {
//			fr = new FileReader(fileName);
			BufferedReader csvReader = new BufferedReader(new FileReader(fileName));
			String row;
			while ((row = csvReader.readLine()) != null)
			{
			//	String[] tokens = row.split(",");
			
				teacherList.add(TeacherFactory.getobject(row));
				
			}
			csvReader.close();			
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		return teacherList;
}


public List<Student> ReadStudentCSV(String fileName) {
	
	List<Student> studentList = new ArrayList<>();
	
	try {
		BufferedReader csvReader = new BufferedReader(new FileReader(fileName));
		String row;
		while ((row = csvReader.readLine()) != null)
		{
			studentList.add(StudentFactory.getobject(row));
		}
		csvReader.close();			
	}
	catch(Exception e) {
		e.printStackTrace();
		}
	return studentList;
	}



public void writeStudentCSV (String fileName, Classroom obj) {
	
	List<String> csvData = new ArrayList<>();
	for (Group section: obj.getGroups()) {
	
		for (Student student: section.getStudents()) {
		
			String line = obj.getClassnum() + "," + obj.getClassname() + "," + student.getId() + "," + student.getFirstname() + "," + student.getLastname() + "," + student.getAge() + "," + section.getTeacher(); 
		
			csvData.add(line);
		}
	}
	 
	
	try(BufferedWriter out = new BufferedWriter( new FileWriter(fileName))) {
		
		for (String line : csvData) {
			out.write(line);
			out.newLine();
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}	
}



public List<Vaccine> readImmunizationRulesCSV (String fileName) {
	
	List<Vaccine> csvData = new ArrayList<>();
	
	try {
		BufferedReader csvReader = new BufferedReader(new FileReader(fileName));
		String row;
		while ((row = csvReader.readLine()) != null)
		{
			csvData.add(new Vaccine().getObject(row));
		}
		csvReader.close();			
	}
	catch(Exception e) {
		e.printStackTrace();
		}
	return csvData;

}
	





}


