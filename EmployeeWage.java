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

	
	// this method will calculate the wage of employee for one day
	public static void empWagePerDay() {
		//full time employee value
		int IsFullTime =1;
		//Employee wage per  hour
		int EmpWagePerHour =20;
		//Employee working hours
		int EmpHrs =0;
		//according to working hours employee wage
		int EmpWage =0;
		//checking employee is present or not
		int EmpAtten = ThreadLocalRandom.current().nextInt(0,2);
		if(EmpAtten == IsFullTime)
			EmpHrs=8;
		else
			EmpHrs=0;
		EmpWage= EmpHrs * EmpWagePerHour  ;
		System.out.println("Employee wage per day : "+ EmpWage);

	}

}
