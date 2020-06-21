///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package edu.neu.csye6200.model;
//import java.sql.*;
///**
// *
// * @author yccha
// */
//public class sqlDb {
//    
//    
//    
//    
//    public static void main(String[] args){
//        
//        
//        try{
//            String driver = "com.mysql.jdbc.Driver";
//	String url = "jdbc:mysql://localhost:3306/daycaredb";
//	String username = "root";
//	String password = "123";			
//		    				    	
//            Class.forName(driver);  
//	Connection conn = DriverManager.getConnection(url, username, password); 
//        System.out.println("Database Connected");
//	Statement mystat = conn.createStatement();
//        ResultSet rs = mystat.executeQuery("select * from studentdb");
//        while(rs.next()){
//            System.out.println(rs.getString("ID") + "," + rs.getString("FIRSTNAME"));
//        }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//}
