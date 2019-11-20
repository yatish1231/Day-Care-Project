package edu.neu.csye6200.model;

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


		public static Weights getclasstype(int age) {
			if(age>=6 && age<=12) {
				return new Weights(4, 0.25, 3, 1);
			}
			if(age>=13 && age<=24) {
				return new Weights(5, 0.20, 3, 2);
			}if(age>=25 && age<=35) {
				return new Weights(6, 0.16, 3, 3);
			}if(age>=36 && age<=47) {
				return new Weights(8, 0.12, 3, 4);
			}if(age>=48 && age<=59) {
				return new Weights(12, 0.08, 2, 5);
			}if(age>= 60) {
				return new Weights(15, 0.06, 2, 6);
			}
			return null;
		}

		public static int getmaxstudents(int age) {
			if(age>=6 && age<=12) {
				return 12;
			}
			if(age>=13 && age<=24) {
				return 15;
			}if(age>=25 && age<=35) {
				return 18;
			}if(age>=36 && age<=47) {
				return 24;
			}if(age>=48 && age<=59) {
				return 24;
			}if(age>= 60) {
				return 30;
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
