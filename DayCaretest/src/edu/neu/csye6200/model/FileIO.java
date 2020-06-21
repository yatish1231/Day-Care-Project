package edu.neu.csye6200.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import edu.neu.csye6200.model.Classdatahandler;
import edu.neu.csye6200.view.*;
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



public void writeStudentCSV (String fileName) {
	
	List<String> csvData = new ArrayList<>();
    for (List<Classroom> classes : Classdatahandler.getallclasses()) {
        for (Classroom classroom : classes) {
	for (Group section: classroom.getGroups()) {
		for (Student student: section.getStudents()) {
                        //System.out.println("LOOk HERE NOW"+student);
			String line = student.getId() + "," + student.getFirstname() + "," + student.getLastname()+ "," + student.getAge() + "," + 
                                student.getParentfirstname() + "," + student.getParentlastname() + "," + student.getGrade()+ "," + student.getAddress()
                                + "," + student.getPhonenum()+ "," + student.getRegDate().getYear()+ "," + student.getRegDate().getMonthValue()+ "," + student.getRegDate().getDayOfMonth()
                                + "," + student.getRecord().get(0).getDosage()+ "," + student.getRecord().get(1).getDosage()+ "," + student.getRecord().get(2).getDosage()+ "," + student.getRecord().get(3).getDosage()
                                + "," + student.getRecord().get(4).getDosage()+ "," + student.getRecord().get(5).getDosage(); 
			csvData.add(line);
		}
	}
        }
    }
	try(BufferedWriter out = new BufferedWriter( new FileWriter(fileName))) {
		
		for (String line : csvData) {
                    //System.out.println("This is check"+line);
			out.write(line);
			out.newLine();
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}	
//        NetMainFrame.initialize();
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
public void writeFinalTeacherDB (String fileName) {

	

	

	List<String> csvData = new ArrayList<>();

	

	for( Teacher obj: TeacherDataHandler.getteacherlist()) {

		int temp = obj.getReview().size()-1;

		

		String line = obj.getId() + "," + obj.getFirstname() + "," + obj.getLastname() + "," + obj.getCredits() + "," +

		obj.getReview().get(temp).reviewDate.getYear() + "," + obj.getReview().get(temp).reviewDate.getMonth() + "," + obj.getReview().get(temp).reviewDate.getDayOfMonth() +

		"," + obj.getReview().get(temp).employeeReview;

		

		csvData.add(line);

		

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





public List<Teacher> readFinalTeacherCSV (String fileName) {



	List<Teacher> teacherList = new ArrayList<>();	

	try {

		BufferedReader csvReader = new BufferedReader(new FileReader(fileName));

		String row;

		while ((row = csvReader.readLine()) != null)

		{

			teacherList.add(TeacherFactory.getobject(row));

		}

		csvReader.close();			

	}

	catch(Exception e) {

		e.printStackTrace();

		}



	return teacherList;	

}
public List<Weights> readWeightCSV(String fileName) {
	
	List<Weights> weightRules = new ArrayList<>();
	
	try {
		BufferedReader csvReader = new BufferedReader(new FileReader(fileName));
		String row;
		while ((row = csvReader.readLine()) != null)
		{
			weightRules.add(WeightFactory.getobject(row));
		}
		csvReader.close();			
	}
	catch(Exception e) {
		e.printStackTrace();
		}

	return weightRules;	
	
	
	
	
}








}


