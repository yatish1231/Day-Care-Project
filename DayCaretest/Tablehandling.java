package edu.neu.csye6200;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Tablehandling {
	
	 private static final String COMMA_DELIMITER = ",";

	 public static void main(String[] args) throws Exception {		 
		 createStudentobjdbTable();	
		 insertStudentobjdbTable("1,SOMANWITA,DEY,26,GOUTAM,DEY,SAHAPUR,9916659468");
		 selectStudentobjdbTable(); 
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
//		 										+ "PRIMARY KEY (STUDENTID))";
                 
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
	 



}
