package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.StudentFactory;

public class Main {

	public static void addstudent(String csvdata){
		assignstudent.toclass(StudentFactory.getobject(csvdata));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main.addstudent("15,Jim,Thomas,0,Micheal,Thomas,Boston MA,5544539012");
		Main.addstudent("23,Jim,Thomas,0,Micheal,Thomas,Boston MA,5544539012");
		Main.addstudent("45,Jim,Thomas,0,Micheal,Thomas,Boston MA,5544539012");
		Main.addstudent("56,Jim,Thomas,0,Micheal,Thomas,Boston MA,5544539012");
		Main.addstudent("63,Jim,Thomas,0,Micheal,Thomas,Boston MA,5544539012");
		}
	}

}
