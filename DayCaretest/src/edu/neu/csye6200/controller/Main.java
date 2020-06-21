package edu.neu.csye6200.controller;

//import edu.neu.csye6200.Tablehandling;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import edu.neu.csye6200.model.Classdatahandler;
import edu.neu.csye6200.model.FileIO;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.StudentFactory;
import edu.neu.csye6200.model.Weights;
import edu.neu.csye6200.model.Tablehandling;
import edu.neu.csye6200.view.NetMainFrame;
import edu.neu.csye6200.view.StudentInfo;
import edu.neu.csye6200.view.Studentview;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static String workingDir = System.getProperty("user.dir");
        public static Path filePath = Paths.get(workingDir+File.separator);
	public static void addstudent(String csvdata){
		assignstudent.toclass(StudentFactory.getobject(csvdata));
        try {
            Tablehandling.insertStudentobjdb(StudentFactory.getobject(csvdata));
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
	static{
            FileIO file = new FileIO();
            Weights.addWeights(file.readWeightCSV(filePath+"\\weights.txt"));
            try{
            Tablehandling.createStudentobjdbTable();
            Tablehandling.createClassroomdbTable();
//            Tablehandling.insertStudentobjdbTable(file.ReadStudentCSV(filePath+"\\StudentDatabase.txt"));
             for (Student students : Tablehandling.selectStudentobjdbTable()){
                assignstudent.toclass(students);  
            }  
                for (List<Classroom> path : Classdatahandler.getallclasses()) {
                    for (Classroom classroom : path) {
                        Tablehandling.insertClassroomdbTable(classroom);
                    }
                }

            }
            catch(Exception e){
                e.printStackTrace();
            }
           
        }
//		public static void addstudent(String fileName) {
//			FileIO fileutilobj = new FileIO();
//
//			List<Student> templist = new ArrayList<Student>();
//
//			templist = fileutilobj.ReadStudentCSV(fileName);
//
//		
//
//		for(Student singlestudent: templist) {
//
//			assignstudent.toclass(singlestudent);
//		}

		
	public static void main(String[] args) {
//		//SwingUtilities.invokeLater(()->new MainFrame());
//		// TODO Auto-generated method stub
////		Main.addstudent("1,Jim,Thomas,9,Micheal,Thomas,0,Boston MA,55445");
////		Main.addstudent("2,Jim,Thomas,7,Micheal,Thomas,0,Boston MA,55445");
////		Main.addstudent("3,Jim,Thomas,10,Micheal,Thomas,0,Boston MA,55445");
////		Main.addstudent("4,Jim,Thomas,11,Micheal,Thomas,0,Boston MA,55445");
////		Main.addstudent("5,Jim,Thomas,24,Micheal,Thomas,0,Boston MA,55445");
////		Main.addstudent("6,Jim,Thomas,26,Micheal,Thomas,0,Boston MA,55445");
////		Studentview.viewall();
////		Main.addstudent("C:\\Users\\yccha\\git\\DayCare\\DayCaretest\\src\\edu\\neu\\csye6200\\Students.txt");
//		
////		Studentview.viewRegistration();
////		FileIO fileutil = new FileIO();
////		fileutil.writeStudentCSV("StudentDatabase.txt", Classdatahandler.getclassrooms(1).get(0));
//                
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NetMainFrame().setVisible(true);
                NetMainFrame.initialize();}
            });
//          // Studentview.viewall();
		}	
}

