package com.imperium.start;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.imperium.calc.Calc;
import com.imperium.model.Stars;

public class GetInfo
{



	public static List<Stars> getInfo()
	{
		//this is to read the file star info
		File file = new File("Stars - Actors2 (1)");
		Scanner sc = null;
		
		//had to declare scanner outside the try catch
		//try catch for exceptions
		try 
		{
			sc = new Scanner(file);
		}
		catch (FileNotFoundException e) 
		{
			//TODO Auto-generated catch block
			e.printStackTrace();
		}

		// array list to keep info outside the while loop
		List<Stars> stars = new ArrayList<Stars>();
		
		//while loop that cycles through star info file line by line
		while(sc.hasNext())
		{
			Stars s = new Stars();
			String header = sc.nextLine();

			//set the name of the star
			String temp = sc.nextLine();
			String name = Calc.cleanName(temp);		
			s.setName(name);

			//set the dob of the star
			temp = sc.nextLine();
			String dob = Calc.cleanDob(temp);
			s.setDob(dob);

			//set the height of the star
			temp = sc.nextLine();
			String height = Calc.cleanHeight(temp);
			s.setHeight(height);

			//set spouses
			//List of Spouses:
			String spousesHeader = sc.nextLine();
			//counter to iteraite through data for list of movies
			int count = 0;
			List <String> sp = new ArrayList<String>();
			while(count==0)
			{
				String st = sc.nextLine();
				//if/else that looks for list of movies and populates the list array
				if(st.contains("List of Movies"))
				{
					count++;
				}
				else
				{
					st = Calc.cleanSpouse(st);
					sp.add(st);
				}
			}
			s.setSpouses(sp);

			//list of movies
			List <String> movies = new ArrayList<String>();
			while(count==0)
			{
				String st = sc.nextLine();
				//if/else that looks for list of movies and populates the list array
				if(st.contains("Reported Salary"))
				{
					count++;
				}
				else
				{
					movies.add(st);
				}
			}
			s.setFilmography(movies);

			//list of salary
			List <String> salary = new ArrayList<String>();
			while(count==0)
			{
				String st = sc.nextLine();
				//if/else that looks for list of movies and populates the list array
				if(st.contains("End Report"))
				{
					count++;
				}
				else
				{
					st = Calc.cleanSalary(st);
					if (!st.equals("Nothing")) 
					{
					salary.add(st);
				    }
			}
			}
			s.setSal(salary);
			System.out.println(s.getCounter());
			

			//adds star to list
			stars.add(s);


		}
		
		for(Stars s : stars)
		{
			if (s.getName().contains("Clint")) 
			{
			System.out.print(s.getCount() + "\t");
			System.out.print(s.getName() + "\t");
			System.out.print(s.getDob() + "\t");
			System.out.print(s.getHeight() + "\t");
			System.out.print(s.getSpouses() + "\t");
			System.out.print(s.getFilmography() + "\t");
			System.out.println(s.getSal());
			}
		}
		return stars;
	}
}


