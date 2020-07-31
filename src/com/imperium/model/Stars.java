package com.imperium.model;

import java.util.List;

//this class is to store the star info that is found by GetInfo
public class Stars 
{
	static int counter = -1;
	
	int count;
	String name;
	String dob;
	String height;
	
	List <String> spouses;
	List <String> filmography;
    List <String> sal;
    //constructor
    public Stars ()
    {
		this.count = counter++;
    }
    //methods
    public int getCounter() 
    { 
    	return counter;
    }
    public int getCount ()
    {
    	return count;
    }
    public String getName()
    {
    	return name;

	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDob() 
	{
		return dob;
	}
	public void setDob(String dob) 
	{
		this.dob = dob;
	}
	public String getHeight() 
	{
		return height;
	}
	public void setHeight(String height) 
	{
		this.height = height;
	}
	public List<String> getSpouses() 
	{
		return spouses;
	}
	public void setSpouses(List<String> spouses) 
	{
		this.spouses = spouses;
	}
	public List<String> getFilmography() 
	{
		return filmography;
	}
	public void setFilmography(List<String> filmography) 
	{
		this.filmography = filmography;
	}
	public List<String> getSal()
	{
		return sal;
	}
	public void setSal(List<String> sal) 
	{
		this.sal = sal;
	}
    
    
    
    }
    

