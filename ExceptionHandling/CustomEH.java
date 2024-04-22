package ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		super (msg);
	}
}

class OverAgeException extends Exception
{
	public OverAgeException(String msg)
	{
		super (msg);
	}
}

class Applicant
{
	int age;
	
	public void input()
	{
		System.out.println("welcome to RTO");
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly enter the age");
		age=sc.nextInt();
	}
	public void verify() throws UnderAgeException, OverAgeException
	{
		if(age<18)
		{
			UnderAgeException uae=new UnderAgeException("you are under age -- patience");
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>60)
		{
			OverAgeException ove=new OverAgeException("you are over age ");
			System.out.println(ove.getMessage());
			throw ove;
		}
		else
		{
			System.out.println("you can proceed with application ! you are eligible");
		}
	}
}

class RTO
{
	public void initiate()
	{
		Applicant at= new Applicant();
		
		try 
		{
			at.input();
			at.verify();
		} 
		catch (UnderAgeException | OverAgeException e) 
		{
			try 
			{
				at.input();
				at.verify();
			} 
			catch (UnderAgeException | OverAgeException e1) 
			{
				
				try 
				{
					at.input();
					at.verify();
				} 
				catch (UnderAgeException | OverAgeException e2) 
				{
					
					System.out.println("enough you are ineligible ");
				}
			}
		}
		
	}
}

public class CustomEH 
{

	public static void main(String[] args) 
	{
		RTO rto=new RTO();
		rto.initiate();

	}

}
