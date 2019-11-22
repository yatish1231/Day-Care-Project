package edu.neu.csye6200;
//import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date; 
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Tablehandling {
	
	 private static final String COMMA_DELIMITER = ",";

	 public static void main(String[] args) throws Exception {		 
	//	 createStudentobjdbTable();	
	//	 insertStudentobjdbTable("1,SOMANWITA,DEY,26,GOUTAM,DEY,SAHAPUR,9916659468");
	//	 selectStudentobjdbTable(); 
		 
	//	 createImmunizationdbTable();
	//	 insertImmunizationdbTable("1,VARICELLA,2011-12-31");
	//	 selectImmunizationdbTable();
		 
		 createRegistrationdbTable();
		 insertRegistrationdbTable("1,2011-01-01");
		 selectRegistrationdbTable();
	 }
	 
	 public static Connection getConnection() throws Exception {
			
			try {
				
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/daycaredb";
				String username = "root";
				String password = "Daycare";			
		    				    	
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
		 										+ "ADDRESS VARCHAR(255) NOT NULL, "
		 										+ "PHONE VARCHAR(10) NOT NULL)";
                 
		 try {
			 Connection con = getConnection();
			 PreparedStatement createStudentobjdbtable = con.prepareStatement(CREATE_Studentobjdb_TABLE_SQL);
			 createStudentobjdbtable.executeUpdate();	
		 	}catch(Exception e){System.out.println(e);}
		 	finally {System.out.println("Studentobjdb table Created");};
	 }
	 
	 public static void insertStudentobjdbTable(String csvData) throws Exception{
		 	 		 
		 String[] tokens = csvData.split(COMMA_DELIMITER);
		 int studentid = new Integer(tokens[0]);
		 String firstname = tokens[1];
		 String lastname = tokens[2];
		 int age = new Integer(tokens[3]);
		 String parentfirstname = tokens[4];
		 String parentlastname = tokens[5];
		 String address = tokens[6];
		 String phone = tokens[7];
			 
		 final String INSERT_Studentobjdb_TABLE_SQL="INSERT INTO Studentobjdb(STUDENTID, FIRSTNAME, LASTNAME, AGE, PARENTFIRSTNAME, PARENTLASTNAME, ADDRESS, PHONE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	 
		 try {
			 Connection con = getConnection();
			 PreparedStatement insertStudentobjdbtable = con.prepareStatement(INSERT_Studentobjdb_TABLE_SQL);
			 insertStudentobjdbtable.setInt(1, studentid);
			 insertStudentobjdbtable.setString(2, firstname);
			 insertStudentobjdbtable.setString(3, lastname);
			 insertStudentobjdbtable.setInt(4, age);
			 insertStudentobjdbtable.setString(5, parentfirstname);
			 insertStudentobjdbtable.setString(6, parentlastname);
			 insertStudentobjdbtable.setString(7, address);
			 insertStudentobjdbtable.setString(8, phone);
			 
			 insertStudentobjdbtable.executeUpdate();	
		 }catch(Exception e){System.out.println(e);}
		 finally {System.out.println("Inserted in Studentobjdb");};
	 }
	 
	 public static List<String> selectStudentobjdbTable() throws Exception{
		 
		 final String SELECT_Studentobjdb_TABLE_SQL="SELECT * FROM Studentobjdb";	 						         
		 List<String> stud_obj_array = new ArrayList<>();
		 
		 try {
			 Connection con = getConnection();
			 PreparedStatement selectStudentobjdbtable = con.prepareStatement(SELECT_Studentobjdb_TABLE_SQL);
			 ResultSet result = selectStudentobjdbtable.executeQuery();	 
			 
			 while(result.next()) {
				 String str = result.getString("STUDENTID") + " "
						 	+ result.getString("FIRSTNAME")+  " " 
						 	+ result.getString("LASTNAME")+  " " 
						 	+ result.getString("PARENTFIRSTNAME")+  " " 
						 	+ result.getString("PARENTLASTNAME")+  " " 
						 	+ result.getString("ADDRESS")+  " " 
							+ result.getString("PHONE")+  " " ;
		
				 System.out.println(str);
				 stud_obj_array.add(str);
			 }
		 	}catch(Exception e){System.out.println(e);}
		 	finally {System.out.println("Select from Studentobjdb table");};
		 	return stud_obj_array;
			
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
	 


}
