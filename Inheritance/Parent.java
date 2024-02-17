package Inheritance;

public class Parent 
{
	String name = "amit";
	String surname = "rai";
	int age = 21;
	String address = "pune";
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getSurname() 
	{
		return surname;
	}
	public void setSurname(String surname) 
	{
		this.surname = surname;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public void parent()
	{
		System.out.println("==parent information==");
		System.out.println("parent name is "+name);
		System.out.println("parent surname is "+surname);
		System.out.println("parent age is "+age);
		System.out.println("parent address "+address);
		
	}
	public static void main(String[] args) 
	{
		Parent p = new Parent();
		p.parent();
	}
}
