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
import java.time.*;
public class Time {

	
	
	public static int compareDates(LocalDate registration) {
		
	
	//LocalDate dreg = LocalDate.of(2018, 02, 27);
	
	LocalDate present = LocalDate.now();
	
	Period period = Period.between(registration, present);
	
	int diff = period.getMonths();
	
	return diff;
	}
	
	
//	static LocalDate test = LocalDate.parse("2019-11-22");
	
//	public static void main(String[] args) {
//		
//		System.out.println(test);
//	}
}
