package com.imperium.calc;

public class Calc 
{
			//this class does all calculations
	public static void main(String[] args) 
	{
		

	}
	
	public static String cleanName(String name)
	{
		String temp = name.substring(6);
		
		return temp;
	}
	public static String cleanDob(String dob)
	{
		String temp = dob.substring(6,dob.indexOf(" in"));
		
		return temp;
	}

	public static String cleanHeight(String height) 
	{
		String temp = height.substring(8);
		return temp;
	}
	public static String cleanSpouse(String spouse) 
	{
		int i = spouse.indexOf(",");	//-1
		
		if (i != -1)
		{
			spouse = spouse.substring(0,i);
		}
		return spouse;
	}
	public static String cleanMovies(String movies) 
	{
		movies = movies.substring(0,movies.indexOf("Date:"));
		return movies.trim();
	}
	public static String cleanSalary(String salary) 
	{
		
		int sub1 = salary.indexOf('$');
		
		if (sub1 != -1) 
		{
			
	
		String temp = salary.substring(sub1);
		
		int sub2 = temp.indexOf(' ');
		
		if (sub2 != -1)
		{
			salary = salary.substring(0, (sub1 + sub2));
		}
		else
		{
			salary = salary + "0";
		}
		}
		return salary;
	}

}
