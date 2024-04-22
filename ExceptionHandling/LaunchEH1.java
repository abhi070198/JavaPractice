package ExceptionHandling;

import java.util.Scanner;

public class LaunchEH1 
{

	public static void main(String[] args) 
	{
		System.out.println(" connection established ");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" kindly enter the numberator to divide");
		int num1=sc.nextInt();
		
		System.out.println("kindly enter the denominator to divide ");
		int num2=sc.nextInt();
		
		try
		{
		int res = num1/num2;
		System.out.println("Result is " +res);
		}
		catch(Exception e)
		{
			System.out.println(" runtime exception ");
		}
		System.out.println("connection terminated smoothly");
		

	}

}
