package Loops;

import java.util.Scanner;

public class PostiveAndNegative 
{
	public static void main(String[] args) 
	{
	 int number;
	 System.out.println("enter any number");
	 Scanner sc = new Scanner(System.in);
	 number=sc.nextInt();
	 if(number>0)
	 {
		 System.out.println("number is postive");
	 }
	 else
	 {
		 System.out.println("number is negative");
	 }
	}
}
