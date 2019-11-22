package edu.neu.csye6200.model;

public class Vaccine {

	private int id;
	private String vaccineName;
	private int dosage;
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
	public int getDosage() {
		return dosage;
	}
	public void setDosage(int dosage) {
		this.dosage = dosage;
	}
	
	public Vaccine(int id, String vaccineName, int dosage) {
		super();
		this.id = id;
		this.vaccineName = vaccineName;
		this.dosage = dosage;
	}
	
	
	public Vaccine() {
		super();
	}
	public Vaccine getObject(String csvData) {
		
		String[] tokens = csvData.split(",");
		
		int id  = Integer.parseInt(tokens[0]);
		String vacccineName = tokens[1];
		int dosage = Integer.parseInt(tokens[2]);
		Vaccine vaccine = new Vaccine();		
		vaccine.setId(id);
		vaccine.setVaccineName(vacccineName);
		vaccine.setDosage(dosage);
		
		
		return vaccine;
		
	}
	
}
