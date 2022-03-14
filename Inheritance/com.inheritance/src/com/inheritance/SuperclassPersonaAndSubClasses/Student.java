package com.inheritance.SuperclassPersonaAndSubClasses;

class Student extends Person
{
	private String program;
	private int year;
	private double fee;
	
	public Student(String name,String address)
	{	
		super(name,address);
	}
	public String getProgram()
	{
		return this.program;
	}
	public void setProgram(String program)
	{
		this.program = program;
	}
	public int getYear()
	{
		return this.year;
	}
	public void setProgram(int year)
	{
		this.year = year;
	}
	public double getFee()
	{
		return this.fee;
	}
	public void setProgram(double fee)
	{
		this.fee = fee;
	}
}
