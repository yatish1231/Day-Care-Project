package edu.neu.csye6200.model;

public class StudentFactory {

		public static Student getobject() {
			return new Student();
		}
		
		public static Student getobject(String csvData) {
			String[] tokens = csvData.split(",");
			int Id= Integer.parseInt(tokens[0]);  
			String firstname = tokens[1];
			String lastname = tokens[2];
			int age= Integer.parseInt(tokens[3]);
			String parentfirstname = tokens[4];
			String parentlastname = tokens[5];
			int grade= Integer.parseInt(tokens[6]);
			String address = tokens[7];
			int phonenum = Integer.parseInt(tokens[8]);
			Student student = getobject();
			student.setAge(age);
			student.setId(Id);
			student.setFirstname(firstname);
			student.setLastname(lastname);
			student.setGrade(grade);
			student.setParentfirstname(parentfirstname);
			student.setParentlastname(parentlastname);
			student.setAddress(address);
			student.setPhonenum(phonenum);
			return student;
		}
		
}
