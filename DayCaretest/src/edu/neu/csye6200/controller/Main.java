package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.StudentFactory;
import edu.neu.csye6200.view.Studentview;

public class Main {

	public static void addstudent(String csvdata){
		assignstudent.toclass(StudentFactory.getobject(csvdata));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main.addstudent("7,Jim,Thomas,0,Micheal,Thomas,Boston MA,55445");
		Main.addstudent("8,not,Thomas,0,Micheal,Thomas,Boston MA,554");
		Main.addstudent("7,yo,Thomas,0,Micheal,Thomas,Boston MA,5544");
		Main.addstudent("9,check,Thomas,0,Micheal,Thomas,Boston MA,5544");
		Main.addstudent("10,what,Thomas,0,Micheal,Thomas,Boston MA,5542");
		Studentview.viewall();
		
		}
	}

