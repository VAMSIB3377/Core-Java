package Arrays;

import java.util.Scanner;

public class StudentData {
	public static void main(String args[])
	{
		String details[][];
		details = new String[3][5];
		Scanner input = new Scanner(System.in);
		int count = 1,sum =0,a_mark =0,e_mark =0,highest =0, grandtotal = 0, average;
		String name = "", mode, assess, exam, total, bestscore="";
		
		for (int i = 0; i<3; i++)
		{
			for(int j = 0;j<5;j++)
			{
				if(j==0)
				{
					System.out.println("Type name of Student "+count);
					name = input.nextLine();
					details[i][j] = name;
					count++;
				}
				if(j==1)
				{
					System.out.println("Type mode of Student "+name);
					mode = input.nextLine();
					details[i][j] = mode;
					
					
				}
				if(j==2)
				{
					System.out.println("Type Assessment Marks of Student "+name);
					assess = input.nextLine();
					details[i][j] = assess;
					a_mark = Integer.parseInt(assess);
				}
				if(j==3)
				{
					System.out.println("Type Exam Marks of Student "+name);
					exam = input.nextLine();
					details[i][j] = exam;
					e_mark = Integer.parseInt(exam);
				}
				
			}
			sum = a_mark+e_mark;
			total = Integer.toString(sum);
			details[i][4] = total;
			grandtotal = grandtotal+sum;
			
			if(sum>highest)
			{
				highest = sum;
				bestscore = details[i][0];
			}
			
			
		}
		
		int size = details.length;
		average = grandtotal/size;
		
		
		System.out.println("Student Details");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0;j<5;j++)
			{
				System.out.print(details[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Highest Mark "+highest+" by "+bestscore);
		System.out.println("Class Average "+average);
		
	}
	

}
