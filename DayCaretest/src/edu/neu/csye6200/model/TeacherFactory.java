package edu.neu.csye6200.model;

public class TeacherFactory {

	public static Teacher getobject() {
		return new Teacher();
	}
	
	public static Teacher getobject(String csvData) {
		String[] tokens = csvData.split(",");
		int id= Integer.parseInt(tokens[0]); 
		String firstname = tokens[1];
		String lastname = tokens[2];
		int credits= Integer.parseInt(tokens[3]);
		Teacher teacher = getobject();
		teacher.setId(id);
		teacher.setFirstname(firstname);
		teacher.setLastname(lastname);
		teacher.setCredits(credits);
		return teacher;
	}
}
