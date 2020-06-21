package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.FileIO;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Tablehandling;
import edu.neu.csye6200.model.Vaccine;
import edu.neu.csye6200.view.Studentview;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableCellRenderer;

public class GiveStudentImmunization {

	   private static FileIO filewriter = new FileIO();
	public static void giveDose(int id, Student obj, int i) {
	
		for(Vaccine list: obj.getRecord()) {
			if(list.getId() == id) {
				list.setDosage(list.getDosage() + i);
			}
                    try {
                        Tablehandling.updateImmunization(Studentview.getStudent(obj.getId()).getStudent());
                    } catch (Exception ex) {
                        Logger.getLogger(GiveStudentImmunization.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}
		filewriter.writeStudentCSV("StudentDatabase.txt");
                
	}
	
}
