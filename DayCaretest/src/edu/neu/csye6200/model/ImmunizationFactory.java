package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

public class ImmunizationFactory {

	public static List<Vaccine> immunizationRecord;
	
	
	// Creating a List of Immunization according to the age requirements
	
	public List<Vaccine> studentImmunizationRequirement() {
		
		immunizationRecord = new ArrayList<>();
		
		immunizationRecord.add(new Vaccine(1,"Hib",0));
		immunizationRecord.add(new Vaccine(2,"DTap",0));
		immunizationRecord.add(new Vaccine(3,"Polio",0));
		immunizationRecord.add(new Vaccine(4,"HepB",0));
		immunizationRecord.add(new Vaccine(5,"MMR",0));
		immunizationRecord.add(new Vaccine(6,"Var",0));
		
		return immunizationRecord;
	}
	
	

	

	
	
}
