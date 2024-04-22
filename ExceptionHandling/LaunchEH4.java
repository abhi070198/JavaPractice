package ExceptionHandling;

import java.util.Scanner;

class Alpha
{
	public void alpha()
	{
		System.out.println(" connection2 established ");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" kindly enter the numberator to divide");
		int num1=sc.nextInt();
		
		System.out.println("kindly enter the denominator to divide ");
		int num2=sc.nextInt();
		
		
		int res = num1/num2;
		System.out.println("Result is " +res);
		
		
		System.out.println("connection2 terminated smoothly");
		
	}
}

public class LaunchEH4 
{
	public static void main(String[] args) 
	{
		System.out.println("Connect1 established");
		Alpha a=new Alpha();
		a.alpha();
		
		System.out.println("connection1 terminated smoothly");
	}

}
