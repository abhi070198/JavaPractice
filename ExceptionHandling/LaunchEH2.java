package ExceptionHandling;

import java.util.Scanner;

public class LaunchEH2 
{

	public static void main(String[] args) 
	{
		System.out.println(" connection established !--Logged in");
		
		try
		{
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" kindly enter the numberator to divide");
		int num1=sc.nextInt();
		System.out.println("kindly enter the denominator to divide ");
		int num2=sc.nextInt();
		
		int res = num1/num2;
		System.out.println("Result is " +res);
		
		System.out.println("enter size of an array");
		int size=sc.nextInt();
		int[] ar= new int[size];
		
		System.out.println(" Kindly enter the element in array");
		int ele =sc.nextInt();
		
		System.out.println("kinly enter the index of elements");
		int index=sc.nextInt();
		
		ar[index]=ele;	
		
		System.out.println("data inserted in array "+ar[index]);
		}
		catch(ArithmeticException e)
		{
		System.out.println("enter non zero denominator");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("be in you limits ! don't surpass limit");
		}
		catch(Exception e)
		{
		System.out.println("invlaid data and exception generated");
		}
		
		System.out.println("connection terminated smoothly !--Logged out");
	}

}
