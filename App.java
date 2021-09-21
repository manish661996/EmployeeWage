package com.bridgelabz.EmployeeWage;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
	public static void main( String[] args )
	{
		// this section of the code will generate log file and print log message on console
		String message="Wecome , your attendence is in progress";
		LOG.debug(message + " will be printed on Debug");
		LOG.info(message + " Will be printed on info");
		LOG.warn(message + " will be printed on warn");
		LOG.error(message + " will be printed on error");
		LOG.fatal(message + " will be printed on fatal");
		LOG.info("Appending String: {}.", message);
		System.out.println(message);

		// check employee is present or not
		//EmployeeWage.getAttendence();
		//Calculate employee one day wage
		//EmployeeWage.empWagePerDay();
		//if employee is part time then calculate its wage according to 4 hrs and if employee is full time then calculates its wage according to 8 hrs
		//EmployeeWage.PartTimeEmpWage();
		//EmployeeWage.EmpWageUsingSwitch();
		//EmployeeWage.ComputingEmpWageFor20Days();
		//EmployeeWage.ComputingEmpWageFor20DaysFor100Hrs();
		//creating object
		/*EmployeeWage emp1 = new EmployeeWage();
		emp1.ComputingEmpWageFor20DaysFor100HrsOOP();
		*/
		EmployeeWage emp2 = new EmployeeWage();
		emp2.ComputeEmpWageForCompanie("TCS", 20, 30, 200);
		
	}
}
