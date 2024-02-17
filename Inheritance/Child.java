package Inheritance;


public class Child extends Parent 
{
	String educationLevel;
	int numberOfChild;
	public String getEducationLevel() 
	{
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) 
	{
		this.educationLevel = educationLevel;
	}
	public int getNumberOfChild() 
	{
		return numberOfChild;
	}
	public void setNumberOfChild(int numberOfChild) 
	{
		this.numberOfChild = numberOfChild;
	}
	public void ChildInfo()
	{
		System.out.println("==Child information==");
		System.out.println("child name is "+name);
		System.out.println("child surname is "+surname);
		System.out.println("child age is "+age);
		System.out.println("child address "+address);
		System.out.println("child eduaction level is "+educationLevel);
		System.out.println("numbe of child "+numberOfChild);
	}
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.setName("amitt");
		c.setSurname("rai");
		c.setAge(13);
		c.setAddress("pune");
		c.setEducationLevel("graduate");
		c.setNumberOfChild(2);
		c.ChildInfo();
	}
}
