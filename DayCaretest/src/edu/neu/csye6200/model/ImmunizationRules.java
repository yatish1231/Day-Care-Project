package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

public class ImmunizationRules {

	static List<Vaccine> vaccineList = new ArrayList<>();
	
	public ImmunizationRules() {
		vaccineList = new FileIO().readImmunizationRulesCSV("Immunization.txt");
	}
	
	public List<Vaccine> getImmunizationRules() {
		
		new ImmunizationRules();
		return vaccineList;
	}
}
