package edu.neu.csye6200.model;

public class WeightFactory implements WeightFactoryInterface{

	public static Weights getobject(String csvData) {
		
		String[] tokens = csvData.split(",");
		
		int groupsize = Integer.parseInt(tokens[0]);
		double ratio = Double.parseDouble(tokens[1]);
		int maxgroup = Integer.parseInt(tokens[2]);
		int category = Integer.parseInt(tokens[3]);
		
		
		Weights weightRules = new Weights(groupsize, ratio, maxgroup, category);
		
		return weightRules;
	}
	
	
	
	
}
