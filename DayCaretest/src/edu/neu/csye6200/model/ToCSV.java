/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.model;

import java.util.List;
import edu.neu.csye6200.model.Classdatahandler;
import java.time.LocalDate;
import javafx.util.converter.LocalDateStringConverter;

/**
 *
 * @author yccha
 */
public class ToCSV {
    
    public static String convertToCSV(String fname, String Lname, String id, String age, String PFname, String PLname, String add, String phonenum, 
            String DTap, String Hib, String polio, String hepb, String mmr, String varicella){
        LocalDate date = LocalDate.now();
        String csv = id + "," + fname + "," + Lname + "," + age + "," + PFname + "," +PLname + "," + 0 + "," +add + "," + phonenum+ "," 
                + String.valueOf(date.getYear())+ "," + String.valueOf(date.getMonthValue())+ "," + String.valueOf(date.getDayOfMonth())
                + "," +DTap+ "," +Hib+ "," +polio+ "," +hepb+ "," +mmr+ "," +varicella;
        return csv;
    }
//   public static boolean exportT0CSV(){
//       FileIO file = new FileIO();
//       for (List<Classroom> classes : Classdatahandler.getallclasses()) {
//			for (Classroom classroom : classes) {
//                            file.writeStudentCSV("C:\\Users\\yccha\\Documents\\NetBeansProjects\\DayCare\\StudentDatabase.txt", classroom);
//                            return true;
//   }
//  }
//  return true;
//}
}
	