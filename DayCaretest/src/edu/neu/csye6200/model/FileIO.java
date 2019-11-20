package edu.neu.csye6200.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

	
	
	
public List<Teacher> ReadTeacherCSV(String fileName) {
		
		FileReader fr;
		List<Teacher> teacherList = new ArrayList<>();
		
		try {
			fr = new FileReader(fileName);
			BufferedReader csvReader = new BufferedReader(fr);
			String row;
			while ((row = csvReader.readLine()) != null)
			{
			//	String[] tokens = row.split(",");
			
				teacherList.add(TeacherFactory.getobject(row));
				
				
				//int id = new Integer(tokens[0]);
				//String fname = tokens[1];
				//String lname = tokens[2];
				//int credits = new Integer(tokens[3]);
				
				//teacherList.add(new Teacher(id, fname, lname, credits));
				
			}
			csvReader.close();			
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		return teacherList;
}


}


