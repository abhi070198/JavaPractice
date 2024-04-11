package NewStudent;

import java.util.Scanner;


public class StudentPage extends AddStudent
{
	int roll;
	String name;
	int a;
	
	private static Student[] studentInfo; 
	public void student()
	{
		
		do
		{
		System.out.println("***** Student Page *****");
		System.out.println("1. Add Students :");
        System.out.println("2. Display all Students");
        System.out.println("3. Exit ");
        System.out.println(" Enter any option ");
        
        
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		if(a==1)
		{
			System.out.println("Add Students");
			System.out.println(" Add student name and Roll No. ");
			AddStudent sp = new StudentPage();
			studentInfo=sp.addStudens();
			
			
		}
		else if(a==2)
		{
			System.out.println("Display all Students");
			StudentPage sp = new StudentPage();
			sp.displayInfo(studentInfo);
			
		}
		else if(a==3)
		{
			System.out.println("Exit");
			
		}
		
		}while(a!=3);
	
	}

}
