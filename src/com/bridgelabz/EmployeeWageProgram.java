package com.bridgelabz;

public class EmployeeWageProgram 
{
	static int is_Present = 1;
	static int wage_per_hr = 20;
	static int full_time = 8;
	static int part_time = 4;
	static int empwage = 0;
	
	public static void main(String[] args) 
	{
		
		
		double empcheck = Math.floor(Math.random()*10)%3;
		
		if(empcheck == 1)
		{
			empwage = wage_per_hr * full_time;
			System.out.println("Employee is present");
			
		}
		else if(empcheck == 2)
		{
			empwage = wage_per_hr * part_time;
			System.out.println("Employee is part time");
		}
		else
		{
			System.out.println("Employee is absent");
		}
		
		System.out.println("Employee wage:" +empwage);
	}
    
}
