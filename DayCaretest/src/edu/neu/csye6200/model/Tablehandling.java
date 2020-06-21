package edu.neu.csye6200.model;
//import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date; 
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import javafx.util.converter.LocalDateStringConverter;
//import com.oracle.*;

public class Tablehandling {
	
	 private static final String COMMA_DELIMITER = ",";

//	 public static void main(String[] args) throws Exception {		 
//		 createStudentobjdbTable();	
//		 insertStudentobjdbTable("1,SOMANWITA,DEY,26,GOUTAM,DEY,SAHAPUR,9916659468");
//		 selectStudentobjdbTable(); 
//		 
//		 createImmunizationdbTable();
//		 insertImmunizationdbTable("1,VARICELLA,2011-12-31");
//		 selectImmunizationdbTable();
//		 
//		 createRegistrationdbTable();
//		 insertRegistrationdbTable("1,2011-01-01");
//		 selectRegistrationdbTable();
//		 
//		 createClassroomdbTable();
//		 insertClassroomdbTable("6,komal,2,3");
//		 selectClassroomdbTable();
//		 
//	 }
	 
	 public static Connection getConnection() throws Exception {
			
			try {
//				
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/daycaredb";
				String username = "root";
				String password = "1231";			
		    				    	
			   Class.forName(driver);  
			   Connection conn = DriverManager.getConnection(url, username, password); 
			   System.out.println("Database Connected");
			   return conn;

			    } catch(Exception e) {System.out.println(e);}
			return null;
			
	 }
	 
	 public static void createStudentobjdbTable() throws Exception{
		 
		 final String CREATE_Studentobjdb_TABLE_SQL="CREATE TABLE IF NOT EXISTS Studentobjdb("
		 										+ "STUDENTID INT NOT NULL PRIMARY KEY, "
		 										+ "FIRSTNAME VARCHAR(45) NOT NULL, "
		 										+ "LASTNAME VARCHAR(45) NOT NULL, "
		 										+ "AGE INT NOT NULL, "
		 										+ "PARENTFIRSTNAME VARCHAR(45) NOT NULL, "
		 										+ "PARENTLASTNAME VARCHAR(45) NOT NULL, "
                                                                                                +" GRADE INT NOT NULL,"
		 										+ "ADDRESS VARCHAR(255) NOT NULL, "
		 										+ "PHONE VARCHAR(10) NOT NULL,"
                                                                                                +"YEAR INT NOT NULL,"
                                                                                                +"MONTH INT NOT NULL,"
                                                                                                +"DAY INT NOT NULL,"
                                                                                                +"TDAP INT NOT NULL,"
                                                                                                +"HIB INT NOT NULL,"
                                                                                                +"POLIO INT NOT NULL,"
                                                                                                +"HEPB INT NOT NULL,"
                                                                                                +"MMR INT NOT NULL,"
                                                                                                +"VARICELLA INT NOT NULL)";
                                                                                                        
		 try {
			 Connection con = getConnection();
			 PreparedStatement createStudentobjdbtable = con.prepareStatement(CREATE_Studentobjdb_TABLE_SQL);
			 createStudentobjdbtable.executeUpdate();
                         System.out.println("Studentobjdb table Created for real");
		 	}catch(Exception e){System.out.println(e);}
		 	finally {System.out.println("Studentobjdb table Created");};
	 }
	 
	 public static void insertStudentobjdbTable(List<Student> student) throws Exception{
		           			 
		 final String INSERT_Studentobjdb_TABLE_SQL="INSERT INTO Studentobjdb(STUDENTID, FIRSTNAME, LASTNAME, AGE, PARENTFIRSTNAME, PARENTLASTNAME,GRADE, "
                         + "ADDRESS, PHONE, YEAR, MONTH, DAY, TDAP, HIB, POLIO, HEPB, MMR, VARICELLA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	 
		 try {
			 Connection con = getConnection();
			 PreparedStatement insertStudentobjdbtable = con.prepareStatement(INSERT_Studentobjdb_TABLE_SQL);
                          for (Student obj : student) {	
			 insertStudentobjdbtable.setInt(1, obj.getId());
			 insertStudentobjdbtable.setString(2, obj.getFirstname());
			 insertStudentobjdbtable.setString(3, obj.getLastname());
			 insertStudentobjdbtable.setInt(4, obj.getAge());
			 insertStudentobjdbtable.setString(5, obj.getParentfirstname());
			 insertStudentobjdbtable.setString(6, obj.getParentlastname());
                         insertStudentobjdbtable.setInt(7, obj.getGrade());
			 insertStudentobjdbtable.setString(8, obj.getAddress());
			 insertStudentobjdbtable.setInt(9, obj.getPhonenum());
                         insertStudentobjdbtable.setInt(10, obj.getRegDate().getYear());
                         insertStudentobjdbtable.setInt(11, obj.getRegDate().getMonthValue());
                         insertStudentobjdbtable.setInt(12, obj.getRegDate().getDayOfMonth());
                         insertStudentobjdbtable.setInt(13, obj.getRecord().get(0).getDosage());
                         insertStudentobjdbtable.setInt(14, obj.getRecord().get(1).getDosage());
                         insertStudentobjdbtable.setInt(15, obj.getRecord().get(2).getDosage());
                         insertStudentobjdbtable.setInt(16, obj.getRecord().get(3).getDosage());
                         insertStudentobjdbtable.setInt(17, obj.getRecord().get(4).getDosage());
                         insertStudentobjdbtable.setInt(18, obj.getRecord().get(5).getDosage());
			
			 insertStudentobjdbtable.executeUpdate();	
                          System.out.println("Studentobjdb table Created now");}
		 }catch(Exception e){System.out.println(e);}
		 finally {System.out.println("Inserted in Studentobjdb");};
	 }
	 
          public static void insertStudentobjdb(Student students) throws Exception{
		           
                          
		 final String INSERT_Studentobjdb_TABLE_SQL="INSERT INTO Studentobjdb(STUDENTID, FIRSTNAME, LASTNAME, AGE, PARENTFIRSTNAME, PARENTLASTNAME,GRADE, "
                         + "ADDRESS, PHONE, YEAR, MONTH, DAY, TDAP, HIB, POLIO, HEPB, MMR, VARICELLA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	 
		 try {
			 Connection con = getConnection();
			 PreparedStatement insertStudentobjdbtable = con.prepareStatement(INSERT_Studentobjdb_TABLE_SQL);
                         Student obj = students;	
			 insertStudentobjdbtable.setInt(1, obj.getId());
			 insertStudentobjdbtable.setString(2, obj.getFirstname());
			 insertStudentobjdbtable.setString(3, obj.getLastname());
			 insertStudentobjdbtable.setInt(4, obj.getAge());
			 insertStudentobjdbtable.setString(5, obj.getParentfirstname());
			 insertStudentobjdbtable.setString(6, obj.getParentlastname());
                         insertStudentobjdbtable.setInt(7, obj.getGrade());
			 insertStudentobjdbtable.setString(8, obj.getAddress());
			 insertStudentobjdbtable.setInt(9, obj.getPhonenum());
                         insertStudentobjdbtable.setInt(10, obj.getRegDate().getYear());
                         insertStudentobjdbtable.setInt(11, obj.getRegDate().getMonthValue());
                         insertStudentobjdbtable.setInt(12, obj.getRegDate().getDayOfMonth());
                         insertStudentobjdbtable.setInt(13, obj.getRecord().get(0).getDosage());
                         insertStudentobjdbtable.setInt(14, obj.getRecord().get(1).getDosage());
                         insertStudentobjdbtable.setInt(15, obj.getRecord().get(2).getDosage());
                         insertStudentobjdbtable.setInt(16, obj.getRecord().get(3).getDosage());
                         insertStudentobjdbtable.setInt(17, obj.getRecord().get(4).getDosage());
                         insertStudentobjdbtable.setInt(18, obj.getRecord().get(5).getDosage());
			
			 insertStudentobjdbtable.executeUpdate();	
                          System.out.println("Studentobjdb table Created now");}
		 catch(Exception e){System.out.println(e);}
		 finally {System.out.println("Inserted in Studentobjdb");};
}
              public static void insertTeacherAlert(Teacher obj) throws Exception{
		           
                          
		 final String INSERT_Alerts_TABLE_SQL="INSERT IGNORE INTO alerts_teacher(ID, FIRSTNAME, LASTNAME) VALUES (?, ?, ?)";
	 
		 try {
			 Connection con = getConnection();
			 PreparedStatement insertStudentobjdbtable = con.prepareStatement(INSERT_Alerts_TABLE_SQL);
                         insertStudentobjdbtable.setInt(1, obj.getId());
			 insertStudentobjdbtable.setString(2, obj.getFirstname());
			 insertStudentobjdbtable.setString(3, obj.getLastname());
			 insertStudentobjdbtable.executeUpdate();	
                          System.out.println("Teacher Alerts table Created now");}
		 catch(Exception e){System.out.println(e);}
		 finally {System.out.println("Inserted in alerts");};
}
                          public static void insertStudentalert(Student obj) throws Exception{
		           
                          
		 final String INSERT_Alerts_TABLE_SQL="INSERT IGNORE INTO alerts_student(ID, FIRSTNAME, LASTNAME) VALUES (?, ?, ?)";
	 
		 try {
			 Connection con = getConnection();
			 PreparedStatement insertStudentobjdbtable = con.prepareStatement(INSERT_Alerts_TABLE_SQL);
                         insertStudentobjdbtable.setInt(1, obj.getId());
			 insertStudentobjdbtable.setString(2, obj.getFirstname());
			 insertStudentobjdbtable.setString(3, obj.getLastname());
			 insertStudentobjdbtable.executeUpdate();	
                          System.out.println("Student Alerts table Created now");}
		 catch(Exception e){System.out.println(e);}
		 finally {System.out.println("Inserted in alerts");};
}
                  public static void updateImmunization(Student students) throws Exception{
		           
                          
		 final String INSERT_Studentobjdb_TABLE_SQL="UPDATE Studentobjdb (STUDENTID, FIRSTNAME, LASTNAME, AGE, PARENTFIRSTNAME, PARENTLASTNAME,GRADE, "
                         + "ADDRESS, PHONE, YEAR, MONTH, DAY, TDAP, HIB, POLIO, HEPB, MMR, VARICELLA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) WHERE STUDENTID= ?";
	 
		 try {
			 Connection con = getConnection();
			 PreparedStatement insertStudentobjdbtable = con.prepareStatement(INSERT_Studentobjdb_TABLE_SQL);
                         Student obj = students;	
			 insertStudentobjdbtable.setInt(1, obj.getId());
			 insertStudentobjdbtable.setString(2, obj.getFirstname());
			 insertStudentobjdbtable.setString(3, obj.getLastname());
			 insertStudentobjdbtable.setInt(4, obj.getAge());
			 insertStudentobjdbtable.setString(5, obj.getParentfirstname());
			 insertStudentobjdbtable.setString(6, obj.getParentlastname());
                         insertStudentobjdbtable.setInt(7, obj.getGrade());
			 insertStudentobjdbtable.setString(8, obj.getAddress());
			 insertStudentobjdbtable.setInt(9, obj.getPhonenum());
                         insertStudentobjdbtable.setInt(10, obj.getRegDate().getYear());
                         insertStudentobjdbtable.setInt(11, obj.getRegDate().getMonthValue());
                         insertStudentobjdbtable.setInt(12, obj.getRegDate().getDayOfMonth());
                         insertStudentobjdbtable.setInt(13, obj.getRecord().get(0).getDosage());
                         insertStudentobjdbtable.setInt(14, obj.getRecord().get(1).getDosage());
                         insertStudentobjdbtable.setInt(15, obj.getRecord().get(2).getDosage());
                         insertStudentobjdbtable.setInt(16, obj.getRecord().get(3).getDosage());
                         insertStudentobjdbtable.setInt(17, obj.getRecord().get(4).getDosage());
                         insertStudentobjdbtable.setInt(18, obj.getRecord().get(5).getDosage());
                         insertStudentobjdbtable.setInt(19, obj.getId());
			 insertStudentobjdbtable.executeUpdate();	
                          System.out.println("Studentobjdb table Created now");}
		 catch(Exception e){System.out.println(e);}
		 finally {System.out.println("Inserted in Studentobjdb");};
}
         
         
	 public static List<Student> selectStudentobjdbTable() throws Exception{
		 
		 final String SELECT_Studentobjdb_TABLE_SQL="SELECT * FROM Studentobjdb";	 						         
		 List<Student> stud_obj_array = new ArrayList<>();
		 
		 try {
			 Connection con = getConnection();
			 PreparedStatement selectStudentobjdbtable = con.prepareStatement(SELECT_Studentobjdb_TABLE_SQL);
			 ResultSet result = selectStudentobjdbtable.executeQuery();	 
			 
			 while(result.next()) {
                                 Student obj = new Student();
				 obj.setId(Integer.valueOf(result.getString("STUDENTID"))); 
                                 obj.setFirstname(result.getString("FIRSTNAME"));
                                 obj.setLastname(result.getString("LASTNAME"));
                                 obj.setAge(Integer.valueOf(result.getString("AGE"))); 
                                 obj.setParentfirstname(result.getString("PARENTFIRSTNAME"));
                                 obj.setParentlastname(result.getString("PARENTLASTNAME"));
                                 obj.setGrade(Integer.parseInt(result.getString("GRADE")));
                                 obj.setAddress(result.getString("ADDRESS"));
                                 obj.setPhonenum(Integer.parseInt(result.getString("PHONE")));
                                 int year = Integer.parseInt(result.getString("YEAR"));
                                 int month = Integer.parseInt(result.getString("MONTH"));
                                 int day = Integer.parseInt(result.getString("DAY"));
                                 obj.setRegDate(LocalDate.of(year, month, day));
                                 List<Vaccine> studentVaccineList = new ImmunizationFactory().studentImmunizationRequirement();
			studentVaccineList.get(0).setDosage(Integer.parseInt(result.getString("TDAP")));
			studentVaccineList.get(1).setDosage(Integer.parseInt(result.getString("HIB")));
			studentVaccineList.get(2).setDosage(Integer.parseInt(result.getString("POLIO")));
			studentVaccineList.get(3).setDosage(Integer.parseInt(result.getString("HEPB")));
			studentVaccineList.get(4).setDosage(Integer.parseInt(result.getString("MMR")));
			studentVaccineList.get(5).setDosage(Integer.parseInt(result.getString("VARICELLA")));
                        obj.setRecord(studentVaccineList);
				 System.out.println(obj);
				 stud_obj_array.add(obj);
			 }
		 	}catch(Exception e){System.out.println(e);}
		 	finally {System.out.println("Select from Studentobjdb table");};
		 	return stud_obj_array;
			
	 }
	 	 public static List<Enquiries> selectEnqTable() throws Exception{
		 
		 final String SELECT_Studentobjdb_TABLE_SQL="SELECT * FROM enq_table";	 						         
		 List<Enquiries> enq_obj_array = new ArrayList<>();
		 
		 try {
			 Connection con = getConnection();
			 PreparedStatement selectStudentobjdbtable = con.prepareStatement(SELECT_Studentobjdb_TABLE_SQL);
			 ResultSet result = selectStudentobjdbtable.executeQuery();	 
			 
			 while(result.next()) {
                                 Enquiries obj = new Enquiries(result.getString("FIRSTNAME"), result.getString("LASTNAME"),
                                         Integer.valueOf(result.getString("AGE")), Long.valueOf(result.getString("NUM")));
				 enq_obj_array.add(obj);
			 }
		 	}catch(Exception e){System.out.println(e);}
		 	finally {System.out.println("Select from Studentobjdb table");};
		 	return enq_obj_array;
			
	 }
	 public static void createImmunizationdbTable() throws Exception{
		 
		 final String CREATE_Immunizationdb_TABLE_SQL="CREATE TABLE IF NOT EXISTS Immunizationdb("
		 										+ "STUDENTID INT NOT NULL PRIMARY KEY, "
		 										+ "VACCINAION_NAME VARCHAR(45) NOT NULL, "
		 										+ "DATE_OF_VACCINATION DATE NOT NULL)";
                 
		 try {
			 Connection con = getConnection();
			 PreparedStatement createImmunizationdbtable = con.prepareStatement(CREATE_Immunizationdb_TABLE_SQL);
			 createImmunizationdbtable.executeUpdate();	
		 	}catch(Exception e){System.out.println(e);}
		 	finally {System.out.println("Immunizationdb table Created");};
	 }
	 
	 public static void insertImmunizationdbTable(String csvData) throws Exception{
		 	 		 
		 String[] tokens = csvData.split(COMMA_DELIMITER);	 
		 
		 int studentid = new Integer(tokens[0]);
		 String vaccine_name = tokens[1];
		 String date_of_vaccination = tokens[2];
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		 java.util.Date date = sdf.parse(date_of_vaccination);
  		 java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		 
		 final String INSERT_Immunizationdb_TABLE_SQL="INSERT INTO Immunizationdb(STUDENTID, VACCINAION_NAME, DATE_OF_VACCINATION) VALUES (?, ?, ?)";
 
		 try {
			 Connection con = getConnection();
			 PreparedStatement insertImmunizationdbtable = con.prepareStatement(INSERT_Immunizationdb_TABLE_SQL);
			 insertImmunizationdbtable.setInt(1, studentid);
			 insertImmunizationdbtable.setString(2, vaccine_name);
			 insertImmunizationdbtable.setDate(3, sqlDate);
			 
			 insertImmunizationdbtable.executeUpdate();	
		 }catch(Exception e){System.out.println(e);}
		 finally {System.out.println("Inserted in Immunizationdb");};
	 }
	 
	 public static List<String> selectImmunizationdbTable() throws Exception{
		 
		 final String SELECT_Immunizationdb_TABLE_SQL="SELECT * FROM Immunizationdb";	 						         
		 List<String> immunization_array = new ArrayList<>();
		 
		 try {
			 Connection con = getConnection();
			 PreparedStatement selectImmunizationdbtable = con.prepareStatement(SELECT_Immunizationdb_TABLE_SQL);
			 ResultSet result = selectImmunizationdbtable.executeQuery();	 
			 
			 while(result.next()) {
				 String str = result.getString("STUDENTID") + " "
						 	+ result.getString("VACCINAION_NAME")+  " " 
						 	+ result.getDate("DATE_OF_VACCINATION")+  " ";
		
				 System.out.println(str);
				 immunization_array.add(str);
			 }
		 	}catch(Exception e){System.out.println(e);}
		 	finally {System.out.println("Select from Immunizationdb table");};
		 	return immunization_array;
			
	 }
	 
	 public static void createRegistrationdbTable() throws Exception{
		 
		 final String CREATE_Registrationdb_TABLE_SQL="CREATE TABLE IF NOT EXISTS Registrationdb("
		 										+ "STUDENTID INT NOT NULL PRIMARY KEY, "
		 										+ "DATE_OF_REGISTRATION DATE NOT NULL)";
                 
		 try {
			 Connection con = getConnection();
			 PreparedStatement createRegistrationdbtable = con.prepareStatement(CREATE_Registrationdb_TABLE_SQL);
			 createRegistrationdbtable.executeUpdate();	
		 	}catch(Exception e){System.out.println(e);}
		 	finally {System.out.println("Registrationdb table Created");};
	 }
	 
	 public static void insertRegistrationdbTable(String csvData) throws Exception{
		 	 		 
		 String[] tokens = csvData.split(COMMA_DELIMITER);	 
		 
		 int studentid = new Integer(tokens[0]);
		 String date_of_registration = tokens[1];
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		 java.util.Date date = sdf.parse(date_of_registration);
  		 java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		 
		 final String INSERT_Registrationdb_TABLE_SQL="INSERT INTO Registrationdb(STUDENTID, DATE_OF_REGISTRATION) VALUES (?, ?)";
 
		 try {
			 Connection con = getConnection();
			 PreparedStatement insertRegistrationdbtable = con.prepareStatement(INSERT_Registrationdb_TABLE_SQL);
			 insertRegistrationdbtable.setInt(1, studentid);
			 insertRegistrationdbtable.setDate(2, sqlDate);
			 
			 insertRegistrationdbtable.executeUpdate();	
		 }catch(Exception e){System.out.println(e);}
		 finally {System.out.println("Inserted in Registrationdb");};
	 }
	 
	 public static List<String> selectRegistrationdbTable() throws Exception{
		 
		 final String SELECT_Registrationdb_TABLE_SQL="SELECT * FROM Registrationdb";	 						         
		 List<String> Registration_array = new ArrayList<>();
		 
		 try {
			 Connection con = getConnection();
			 PreparedStatement selectRegistrationdbtable = con.prepareStatement(SELECT_Registrationdb_TABLE_SQL);
			 ResultSet result = selectRegistrationdbtable.executeQuery();	 
			 
			 while(result.next()) {
				 String str = result.getString("STUDENTID") + " "
						 	+ result.getDate("DATE_OF_REGISTRATION")+  " ";
		
				 System.out.println(str);
				 Registration_array.add(str);
			 }
		 	}catch(Exception e){System.out.println(e);}
		 	finally {System.out.println("Select from Registrationdb table");};
		 	return Registration_array;
			
	 }
	 
	 
	 public static void createClassroomdbTable() throws Exception{
		 
		 final String CREATE_Classroomdb_TABLE_SQL="CREATE TABLE IF NOT EXISTS Classroomdb("
		 										+ "STUDENTID INT NOT NULL PRIMARY KEY, "
                                                                                                + "FIRSTNAME VARCHAR(45) NOT NULL, "
                                                                                                + "LASTNAME VARCHAR(45) NOT NULL, "
                                                                                                + "CLASSROOM INT NOT NULL, "
                                                                                                + "SECTION INT NOT NULL, "
                                                                                                + "STUDENT_GROUP INT NOT NULL, "
		 										+ "TeacherFIRSTNAME VARCHAR(45) NOT NULL)";
                 
		 try {
			 Connection con = getConnection();
			 PreparedStatement createClassroomdbtable = con.prepareStatement(CREATE_Classroomdb_TABLE_SQL);
			 createClassroomdbtable.executeUpdate();	
		 	}catch(Exception e){System.out.println(e);}
		 	finally {System.out.println("Classroomdb table Created");};
	 }
	 
	 public static void insertClassroomdbTable(Classroom obj) throws Exception{
		 	 		 
//		 String[] tokens = csvData.split(COMMA_DELIMITER);	 
		 
//		 int studentid = new Integer(tokens[0]);
//		 String teacherfirstname = tokens[1];
//		 int student_type = new Integer(tokens[2]);
//		 int student_group = new Integer(tokens[3]);
		
		 
		 final String INSERT_Classroomdb_TABLE_SQL="INSERT IGNORE INTO Classroomdb(STUDENTID, FIRSTNAME, LASTNAME, CLASSROOM, SECTION, STUDENT_GROUP, TeacherFIRSTNAME) VALUES (?, ?, ?, ?, ?, ?, ?)";
 
		 try {
			 Connection con = getConnection();
                         for(Group obj1: obj.getGroups()){
                             for(Student obj2: obj1.getStudents()){
			 PreparedStatement insertClassroomdbtable = con.prepareStatement(INSERT_Classroomdb_TABLE_SQL);
			 insertClassroomdbtable.setInt(1, obj2.getId());
                         insertClassroomdbtable.setString(2, obj2.getFirstname());
                         insertClassroomdbtable.setString(3, obj2.getLastname());
			 insertClassroomdbtable.setInt(4, obj.getClassname());
			 insertClassroomdbtable.setInt(5, obj.getClassnum());
			 insertClassroomdbtable.setInt(6, obj1.getGroupnum());
                         insertClassroomdbtable.setString(7, obj1.getTeacher().getFirstname());
			 insertClassroomdbtable.executeUpdate();}}	
		 }catch(Exception e){System.out.println(e);}
		 finally {System.out.println("Inserted in Classroomdb");};
	 }
	 
	 public static List<String> selectClassroomdbTable() throws Exception{
		 
		 final String SELECT_Classroomdb_TABLE_SQL="SELECT * FROM Classroomdb";	 						         
		 List<String> Classroom_array = new ArrayList<>();
		 
		 try {
			 Connection con = getConnection();
			 PreparedStatement selectClassroomdbtable = con.prepareStatement(SELECT_Classroomdb_TABLE_SQL);
			 ResultSet result = selectClassroomdbtable.executeQuery();	 
			 
			 while(result.next()) {
				 String str = result.getString("STUDENTID") + " "
						 	+ result.getString("TeacherFIRSTNAME")+  " "
				 			+ result.getString("STUDENT_TYPE")+  " "
				 			+ result.getString("STUDENT_GROUP")+  " ";
		
				 System.out.println(str);
				 Classroom_array.add(str);
			 }
		 	}catch(Exception e){System.out.println(e);}
		 	finally {System.out.println("Select from Classroomdbdb table");};
		 	return Classroom_array;
			
	 }
	 

		 


}
