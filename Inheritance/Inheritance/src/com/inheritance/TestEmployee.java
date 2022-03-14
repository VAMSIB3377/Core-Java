package com.inheritance;

public class TestEmployee {
	public static void main(String args[])
	{
		Employee e1 = new Engineer(101,"Jane Smith","012-34-5678",120_345.27);
		Employee e2 = new Manager(207,"Barbara Jhonson","054-12-2367",109_501.36,"US Marketing");
		Employee e3 = new Admin(304,"Bill Munroe","108-23-6509",75_002.34);
		Employee e4 = new Director(104,"Susan Wheeler","099-45-2340",120_567.36,"Global_Marketing",1_000_000.00);
		e1.printEmployee();
		System.out.println();
		e2.printEmployee();
		System.out.println();
		e3.printEmployee();
		System.out.println();
		e4.printEmployee();
		
	}

}
