package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

public class Weights {
	
		private int groupsize;
		private double ratio;
		private int maxgroup;
		private int category; 
	
		public Weights(int groupsize, double ratio, int maxgroup, int category) {
			super();
			this.groupsize = groupsize;
			this.ratio = ratio;
			this.maxgroup = maxgroup;
			this.category = category;
		}
		
		
	static List<Weights> weightRules = new ArrayList<>();
	 
        public static void addWeights(List<Weights> obj){
            weightRules.addAll(obj);
        }
		public static Weights getclasstype(int age) {
		
//		weightRules = new FileIO().readWeightCSV("‪C:\\Users\\yccha\\Documents\\NetBeansProjects\\DayCare\\weights.txt");
		
			if(age>=6 && age<=12) {
				return weightRules.get(0);
			}
			if(age>=13 && age<=24) {
				return weightRules.get(1);
			}if(age>=25 && age<=35) {
				return weightRules.get(2);
			}if(age>=36 && age<=47) {
				return weightRules.get(3);
			}if(age>=48 && age<=59) {
				return weightRules.get(4);
			}if(age>= 60) {
				return weightRules.get(5);
			}
			else {
			
				System.out.println("Age out of limit");
				return null;
			}
		}
	

		public static int getmaxstudents(int age) {
//			FileIO obj = new FileIO();
//			weightRules = obj.readWeightCSV("C:\\Users\\yccha\\Documents\\NetBeansProjects\\DayCare\\weights.txt");
			if(age>=6 && age<=12) { 
				return ((weightRules.get(0).groupsize) * (weightRules.get(0).maxgroup)) ;
			}
			if(age>=13 && age<=24) {
				return ((weightRules.get(1).groupsize) * (weightRules.get(1).maxgroup));
			}if(age>=25 && age<=35) {
				return ((weightRules.get(2).groupsize) * (weightRules.get(2).maxgroup));
			}if(age>=36 && age<=47) {
				return ((weightRules.get(3).groupsize) * (weightRules.get(3).maxgroup));
			}if(age>=48 && age<=59) {
				return ((weightRules.get(4).groupsize) * (weightRules.get(4).maxgroup));
			}if(age>= 60) {
				return ((weightRules.get(5).groupsize) * (weightRules.get(5).maxgroup));
			}
			return 0;
		}
		public static int getmaxgroup(int age) {
//                   FileIO obj = new FileIO();
//			weightRules = obj.readWeightCSV("C:\\Users\\yccha\\Documents\\NetBeansProjects\\DayCare\\weights.txt");
			if(age>=6 && age<=12) {
				return weightRules.get(0).groupsize;
			}
			if(age>=13 && age<=24) {
				return weightRules.get(1).groupsize;
			}if(age>=25 && age<=35) {
				return weightRules.get(2).groupsize;
			}if(age>=36 && age<=47) {
				return weightRules.get(3).groupsize;
			}if(age>=48 && age<=59) {
				return weightRules.get(4).groupsize;
			}if(age>= 60) {
				return weightRules.get(5).groupsize;
			}
			return 0;
		}
		public int getGroupsize() {
			return groupsize;
		}


		public void setGroupsize(int groupsize) {
			this.groupsize = groupsize;
		}


		public double getRatio() {
			return ratio;
		}


		public void setRatio(double ratio) {
			this.ratio = ratio;
		}


		public int getMaxgroup() {
			return maxgroup;
		}


		public void setMaxgroup(int maxgroup) {
			this.maxgroup = maxgroup;
		}


		public int getCategory() {
			return category;
		}


		public void setCategory(int category) {
			this.category = category;
		}
		
}

