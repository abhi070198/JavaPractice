package Loops;
import java.util.*;
public class NaturalNumbers 
{
	 
	public static void main(String[] args)   
	{     
	int num, i, sum = 0;  
	
	Scanner sc = new Scanner(System.in);  
	System.out.print("Sum is from: ");  
	
	i = sc.nextInt();  
	System.out.print("Sum is up to: ");  
	 
	num = sc.nextInt();  
	while(i <= num)  
	{  
	
	sum = sum + i;
	  
	i++;  
	}  
	System.out.println("Sum of Natural Numbers = " + sum);  
	}  
	}  

