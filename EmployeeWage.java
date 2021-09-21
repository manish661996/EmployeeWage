package com.bridgelabz.EmployeeWage;

import java.util.concurrent.ThreadLocalRandom;

public class EmployeeWage {
	//method to find the result of use case 1
		// this method will return the employee is present or not
			public static void getAttendence() {
				  int IsFullTime =1;
			      int EmpAtten = ThreadLocalRandom.current().nextInt(0,2);
			      if(EmpAtten == IsFullTime) {
				        System.out.println("Employee is present");
				        
			      }	
			      else {
				       System.out.println("Employee is absent");
				       
			     }	
		    }

}
