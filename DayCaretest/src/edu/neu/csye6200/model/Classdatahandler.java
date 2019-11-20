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
	private static List<List<Classroom>> allclasses = new ArrayList<List<Classroom>>();
	private static HashMap<Integer, List<Classroom>> database = new HashMap<Integer, List<Classroom>>();
	static {
		Classdatahandler.database.put(1, classlist1);
		Classdatahandler.database.put(2, classlist2);
		Classdatahandler.database.put(3, classlist3);
		Classdatahandler.database.put(4, classlist4);
		Classdatahandler.database.put(5, classlist5);
		Classdatahandler.database.put(6, classlist6);
		Classdatahandler.allclasses.add(classlist1);
		Classdatahandler.allclasses.add(classlist2);
		Classdatahandler.allclasses.add(classlist3);
		Classdatahandler.allclasses.add(classlist4);
		Classdatahandler.allclasses.add(classlist5);
		Classdatahandler.allclasses.add(classlist6);
	}
	public Classdatahandler() {
		// TODO Auto-generated constructor stub
	}
	public static List<Classroom> getclassrooms(int name){
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
	public static List<List<Classroom>> getallclasses(){
		return allclasses;
		}
	}

