package com.bridgelabz;

import java.util.Random;
 
public class EmployeeWageProgram 
{
	
	static int is_full_time = 1;
	static int is_part_time = 2;
	static int wage_per_hr = 20;
	static int full_time = 8;
	static int part_time = 4;
	static int working_day = 20;
	
	public static void main(String[] args) 
	{
		
		int empwage = 0;
		int totalempwage = 0;
		
		for(int i=0; i < working_day; i++)
		{
			Random random = new Random();
			int empcheck = random.nextInt(3);
			System.out.println("Employee attendence:"+empcheck);
			
			switch (empcheck)
			{
			case 1:
				empwage = wage_per_hr * full_time;
				System.out.println("Employee is present and wage is:"+empwage);
				break;
				
			case 2:
				empwage = wage_per_hr * part_time;
				System.out.println("Employee is part time present and wage is:"+empwage);
				break;
				
				default:
					System.out.println("Employee is absent and wage is:"+empwage);
					break;
			}
			
			totalempwage = empwage + totalempwage;
			System.out.println("Total wage of employee for the month is : " + totalempwage);
		}
	  }   
    
}
