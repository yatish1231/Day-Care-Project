/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.model;

/**
 *
 * @author yccha
 */
public class Enquiries {
    
    private String fname;
    private String lname;
    private int age;
    private long phonenum;

    public Enquiries(String fname, String lname, int age, long phonenum) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.phonenum = phonenum;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }
    
    
    
    
}
