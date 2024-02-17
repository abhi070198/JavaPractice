package Loops;

import java.util.Scanner;

public class GreadingSystem 
{
 public static void main(String[] args) 
{
	System.out.println("Enter marks");
	int marks;
	Scanner sc = new Scanner(System.in);
	marks=sc.nextInt();
	if(marks<25)
	{
		System.out.println("Grade is F");
	}
	else if(marks<=45)
	{
		System.out.println("Grade is E");
	}
	else if(marks<=50)
	{
		System.out.println("Grade is D");
	}
	else if(marks<=60)
	{
		System.out.println("Grade is C");
	}
	else if(marks<=80)
	{
		System.out.println("Grade is B");
	}
	else if(marks>80)
	{
		System.out.println("Grade is A");
	}
}
}
