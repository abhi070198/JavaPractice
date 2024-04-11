package com.abhi.jdbclearning;

public class LaunchClassForNameEx 
{

	public static void main(String[] args) throws ClassNotFoundException 
	{
		//Demo d =  new Demo();
		Class.forName("Demo");
		
	}

}

class Demo
{
	static 
	{
		System.out.println("Static Block");
	}
	
	//instance initialization block , it will get executed when you create the object of demo class
	{
		System.out.println("instance block ==>non static block");
	}
}