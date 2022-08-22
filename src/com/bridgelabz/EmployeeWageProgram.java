package com.bridgelabz;

public class EmployeeWageProgram 
{
	
	public static void main(String[] args) 
	{
		
		int is_Present = 1;
		double empcheck = Math.floor(Math.random()*10)%2;
		
		if(empcheck == is_Present)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}

}
