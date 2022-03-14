package com.inheritance;

public class Employee {
	private int empid;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee(int empid, String name, String ssn, double salary)
	{
		this.empid = empid;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void raiseSalary(double increase)
	{
		this.salary = increase;
	}
	public void printEmployee()
	{
		System.out.println("Employee ID :"+empid+"\nEmployee Name :"+name+"\nEmployee SSN :"+ssn+"\nEmployee Salary :"+salary);
	}
}
