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

	// method will add part time workers and will calculate their wage 
	public static void PartTimeEmpWage() {
		//variable to check employee is part time or not
		int IsPartTime =1;
		//variable to check employee is full time or not
		int IsFullTime =2;
		//employee wage per hour
		int EmpWagePerHour =20;
		//employee working hours in a day
		int EmpHrs=0;
		//employee wage according to the working hours
		int EmpWage =0;
		//checking employee is absent or present
		int EmpAtten = ThreadLocalRandom.current().nextInt(0,3);
		//setting employee working hrs according to part time or full time
		if(EmpAtten == IsPartTime) {
			System.out.println("Employee is part time");
			EmpHrs = 4;
		}	 
		else if(EmpAtten == IsFullTime) {
			System.out.println("Employee is full time");
			EmpHrs = 8;
		}

		else {
			System.out.println("Employee is absent");
			EmpHrs =0;
		}	 
		// calculating employee wage for one day 
		EmpWage = EmpHrs * EmpWagePerHour ;
		System.out.println("Employee Wage : "+ EmpWage);

	}


	//defining a method to calculate employee wage for one day for both part and full time employee with the help of Switch case
	public static void EmpWageUsingSwitch() {
		//defining variable of EmpUc4 object
		//variable to check employee is part time or not
		final int IsPartTime =1;
		// variable to check employee is full time or not
		final int IsFullTime =2;
		// variable to set wage of employee per hour
		final int EmpWagePerHour =20;
		//variable to set employee working hours in one day
		int EmpHrs=0;
		//variable to set employee wage in one day
		int EmpWage=0;

		//checking employee is present or absent
		int EmpAtten = ThreadLocalRandom.current().nextInt(0,3);
		//applying Switch in place of if to set employee working hour in a day
		switch(EmpAtten) {
		case IsPartTime :
			System.out.println("Employee is part time");
			EmpHrs = 4;
			break;
		case IsFullTime :
			System.out.println("Employee is full time");
			EmpHrs =8;
			break;
		default :
			System.out.println("Employee is absent");
			EmpHrs =0;
			break;
		}
		//calculate employee wage for one day
		EmpWage = EmpHrs * EmpWagePerHour ;
		System.out.println("Employee wage : "+ EmpWage);
	}

	
	//defining method to calculate employee wage 20 days in a month for both Part time and Full time
	public static void ComputingEmpWageFor20Days() {
		//variable to check employee is part time or not
		final int IsPartTime = 1;
		//variable to check employee is full time or not
		final int IsFullTime = 2;
		//variable to set employee rate per hour
		final int EmpWagePerHour = 20;
		//variable to set number of working days in a month
		final int NumOfWorkingDays = 20;
		// variable to set employee working hours in a day
		int EmpHrs =0;
		//variable to calculate employee wage in a day
		int EmpWage =0;
		//variable to store total employee wage in a month or in 20 days
		int TotalEmpWage =0;

		//using for loop loop to calculate employee wage for each day and adding to get wage for 20  days
		for(int i =1; i<= NumOfWorkingDays ; i++) {

			//checking employee is absent or present
			int EmpAtten = ThreadLocalRandom.current().nextInt(0,3);
			//using switch to calcuate employee working hours in a day
			switch(EmpAtten) {
			case IsPartTime :
				EmpHrs = 4;
				break;
			case IsFullTime :
				EmpHrs =8;
				break;
			default :
				EmpHrs =0;
				break;
			}
			EmpWage= EmpHrs * EmpWagePerHour;
			TotalEmpWage = TotalEmpWage + EmpWage;
			System.out.println("Employee wage for day:"+ i +" is "+ EmpWage);
		}
		System.out.println("Total employee wage for one month is "+ TotalEmpWage);
	}

}
