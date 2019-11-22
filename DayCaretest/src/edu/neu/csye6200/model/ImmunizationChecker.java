package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

public class ImmunizationChecker {

	
	private int id;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getVaccineName() {
		return vaccineName;
	}


	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}


	public int getPendingDosage() {
		return pendingDosage;
	}


	public void setPendingDosage(int pendingDosage) {
		this.pendingDosage = pendingDosage;
	}


	private String vaccineName;
	private int pendingDosage;
	
	//static List<ImmunizationChecker> checkList = new ArrayList<>();
	
	public ImmunizationChecker(int id, String vaccineName, int pendingDosage) {
		super();
		this.id = id;
		this.vaccineName = vaccineName;
		this.pendingDosage = pendingDosage;
	}
	
	
	public ImmunizationChecker() {
		super();
	}


	public List<ImmunizationChecker> checkStatus(ImmunizationRules obj1, List<Vaccine> obj2) {
		
		List<ImmunizationChecker> checkList = new ArrayList<>();
		
		for( Vaccine temp: obj2) {
			
			int vaccineID = temp.getId();
			
			
			if(temp.getDosage() < obj1.getImmunizationRules().get(vaccineID).getDosage()) {
				
				int pendingDoses = obj1.getImmunizationRules().get(vaccineID).getDosage() - temp.getDosage();
				System.out.println("The student has to get " + pendingDoses + " more doses of " + temp.getVaccineName());
				
				checkList.add(new ImmunizationChecker(vaccineID,temp.getVaccineName(),pendingDoses));
			}
		}
		return checkList;
	}
	
	
	
	
	
}
