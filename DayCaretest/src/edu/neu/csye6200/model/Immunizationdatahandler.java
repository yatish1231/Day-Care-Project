package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Immunizationdatahandler {
		private static HashMap<Integer, List<Immunization>> records = new HashMap<Integer, List<Immunization>>();
		
		public Immunizationdatahandler() {
			super();
		}

		public void addrecord(Student obj) {
			Immunizationdatahandler.records.put(obj.getId(), obj.getRecord());
		}
}
