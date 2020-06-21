package edu.neu.csye6200.view;

import java.util.List;

import edu.neu.csye6200.model.Classdatahandler;
import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.Group;
import edu.neu.csye6200.model.Student;

public class Studentview {
		
    private Student student;
    private Group group;
    private Classroom class1;

    public Studentview() {
    }
    
    public Studentview(Student student, Group group, Classroom class1) {
        this.student = student;
        this.group = group;
        this.class1 = class1;
    }

    
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Classroom getClass1() {
        return class1;
    }

    public void setClass1(Classroom class1) {
        this.class1 = class1;
    }
    
	public static void viewall() {
		for (List<Classroom> classes : Classdatahandler.getallclasses()) {
//			System.out.println(classes);
			for (Classroom classroom : classes) {
//				System.out.println("This is the name of the class" + classroom.getClassname());
				for (Group group : classroom.getGroups()) {
//					System.out.println("This is teacher name of "+ group.getGroupnum()+ group.getTeacher().getFirstname());
					for (Student students : group.getStudents()) {
//						System.out.println("Student name in group "+ group.getGroupnum()+ students.getFirstname());
					}
					System.out.println("\n");
				}
				}
			}
		}
        public static Studentview getStudent(int Id){
            	for (List<Classroom> classes : Classdatahandler.getallclasses()) {
//			System.out.println(classes);
			for (Classroom classroom : classes) {
				System.out.println("This is the name of the class" + classroom.getClassname());
				for (Group group : classroom.getGroups()) {
					System.out.println("This is teacher name of "+ group.getGroupnum()+ group.getTeacher().getFirstname());
					for (Student students : group.getStudents()) {
						if(students.getId()==Id)
                                                {
                                                    Studentview info = new Studentview(students, group, classroom);
                                                    return info;
                                                }
					}
					System.out.println("\n");
				}
				}
			}
                return null;
        }
//	public static void viewRegistration() {
//		System.out.println(Registration.getRegistrationRecord());
//	}
	}
