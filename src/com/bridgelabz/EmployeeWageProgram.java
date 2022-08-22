package com.bridgelabz;

public class EmployeeWageProgram 
{
	static int is_Present = 1;
	static int wage_per_hr = 20;
	static int full_day_hr = 8;
	static int empwage = 0;
	
	public static void main(String[] args) 
	{
		
		
		double empcheck = Math.floor(Math.random()*10)%2;
		
		if(empcheck == 1)
		{
			empwage = wage_per_hr * full_day_hr;
			System.out.println("Employee is present");
			
		}
		else
		{
			System.out.println("Employee is absent");
		}
		
		System.out.println("Employee wage:" +empwage);
	}
    
}
