package Loops;

import java.util.Scanner;

public class UpperLowerCase
{
	public static void main(String[] args) 
	{
		char ch;
		System.out.println("enter any character");
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch>=65 && ch<=90)
		{
			System.out.println("this is upper case :"+ch);
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println("this is lower case :"+ch);
		}
		else
		{
			System.out.println("this is not alphabet");
		}
		
	}
}