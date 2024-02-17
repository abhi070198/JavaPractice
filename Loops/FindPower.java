package Loops;

import java.util.Scanner;

public class FindPower 
{
	public static void main(String[] args) 
	{
		int a,b;
		int result =1;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=0;i<b;i++)
		{
			result =result*a;
//			System.out.println("result :"+result);
		}
		System.out.println("result :"+result);
	}
}
