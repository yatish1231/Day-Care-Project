package edu.neu.csye6200.model;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Classdatahandler {

	
	private static List<Classroom> classlist1 = new ArrayList<Classroom>();
	private static List<Classroom> classlist2 = new ArrayList<Classroom>();
	private static List<Classroom> classlist3 = new ArrayList<Classroom>();
	private static List<Classroom> classlist4 = new ArrayList<Classroom>();
	private static List<Classroom> classlist5 = new ArrayList<Classroom>();
	private static List<Classroom> classlist6 = new ArrayList<Classroom>();
	private static HashMap<String, List<Classroom>> database = new HashMap<String, List<Classroom>>();
	public Classdatahandler() {
		// TODO Auto-generated constructor stub
		Classdatahandler.database.put("Under12", classlist1);
		Classdatahandler.database.put("Under24", classlist2);
		Classdatahandler.database.put("Under35", classlist3);
		Classdatahandler.database.put("Under47", classlist4);
		Classdatahandler.database.put("Under59", classlist5);
		Classdatahandler.database.put("Over60", classlist6);
	}
	public static List<Classroom> getclassrooms(String name){
		return Classdatahandler.database.get(name);
		
	}
	public static void addclass(Classroom obj) {
		Classdatahandler.database.get(obj.getClassname()).add(obj);
		
	}
	public static Classroom getclass(Classroom obj) {
		for (Classroom classroom : Classdatahandler.database.get(obj.getClassname())) {
			if(classroom.getClassnum() == obj.getClassnum())
				return classroom;
		}
		return null;
	}
}
