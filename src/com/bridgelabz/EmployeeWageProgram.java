package com.bridgelabz;
import java.util.Random;

public class EmployeeWageProgram 
{

	public static void main(String[] args) 
	{
		
        int wage_per_hr = 20;
		int full_time = 8;
		int part_time = 4;
		int wage_per_day = 0;
		int monthly_salary = 0;
		int monthly_hour = 0;
		int days = 0;

		while (monthly_hour < 100 && days < 20) 
		{

			days++;
			Random random = new Random();
			int empcheck = random.nextInt(3);
			switch (empcheck) 
			{

			case 0:
				System.out.println("Employee Absent");
				break;

			case 1:
				System.out.println("Employee Part Time Present");
				wage_per_day = part_time * wage_per_hr;
				monthly_hour = monthly_hour + part_time;
				break;
			default:
				System.out.println("Employee Full Day Present..");
				wage_per_day = wage_per_hr * full_time;
				monthly_hour = monthly_hour + full_time;
				break;
			}

			monthly_salary = monthly_salary + wage_per_day;
			System.out.println("Day: " + days + " MonthlyHours: " + monthly_hour + ": Monthly Salary: " + monthly_salary);
		}

	}
}
