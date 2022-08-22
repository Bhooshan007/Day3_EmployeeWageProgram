package com.bridgelabz;

import java.util.Random;

public class EmployeeWageProgram 
{
	
	static int is_full_time = 1;
	static int is_part_time = 2;
	static int wage_per_hr = 20;
	static int full_time = 8;
	static int part_time = 4;
	
	public static void main(String[] args) 
	{
		
		
		Random random = new Random();
		int empPresent = random.nextInt(3);
		System.out.println("Employee attendence:"+empPresent);
		
		int empwage = 0;
		
		switch (empPresent)
        {
            case 1:
            {
                empwage = wage_per_hr * full_time;
                System.out.println("Employee is present and the wage is : " + empwage);
                break;

            }
            case 2:
            {
                empwage = wage_per_hr * part_time;
                System.out.println("Employee is Part time present and the wage is : " + empwage);
                break;
            }
            default:
            {
                System.out.println("Employee is absent and the wage is : " + empwage);
                break;
            }
        }
	}
    
}
