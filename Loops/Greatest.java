package Loops;

import java.util.Scanner;

public class Greatest 
{
	public static void main(String[] args) 
	{
	 int a,b;
	 System.out.println(" Enter number ");
	 Scanner sc = new Scanner(System.in);
	 a=sc.nextInt();
	 b=sc.nextInt();
	 if(a>b)
	 {
		 System.out.println(" a is greater number : "+a);
	 }
	 else
	 {
		 System.out.println(" b is greater number : "+b);
	 }
			 
	}
}
