package Exceptions;

import java.util.Scanner;

public class TestException {
	public static void main(String args[]) throws Exception
	{
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("Enter Age : ");
		int age = scanner.nextInt();
		System.out.print("Your Age is : " +age+"\n");
		
		if(age<18)
		{
			throw new Exception("Age is under 18");
		}
		else
		{
			System.out.println("Age is over 18");
		}
		
		
		
		
		System.out.println("Enter the num :");
		
		int num = scanner.nextInt();
		
		if(num<5)
		{
			throw new Exception("Number is less than 5");
		}
		else 
		{
			System.out.println("Number is greater than 5 which is : "+num);
		}
		
		try
		{
			int result = 15/0;
			
		}
		catch(Throwable ex)
		{
			System.out.println("Division by zero is not allowed");
			System.out.println(ex.getMessage());
		}
		
		
		
		try
		{
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Enter Number One : ");
			int num1 = scanner1.nextInt();
			System.out.println("Enter Number Two : ");
			int num2 = scanner1.nextInt();
			System.out.println(num1 + num2);		
		}
		catch(Throwable ex)
		{
			System.out.println("Values has to be an Integer");
		}
		*/
		
		
		try
		{
			int num1 = 5;
			int num2 = 3;
			System.out.println(num1/num2);
			
		}
		catch(Throwable ex)
		{
			System.out.println("Error within code");
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("Thanks for using this application");
		}
		
		
		
		
		
	}

}
