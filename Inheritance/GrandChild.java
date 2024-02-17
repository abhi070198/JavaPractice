package Inheritance;

public class GrandChild extends Child
{
	String SchoolName;
	public String getSchoolName() 
	{
		return SchoolName;
	}
	public void setSchoolName(String schoolName) 
	{
		SchoolName = schoolName;
	}
	public void GrandChildInfo()
	{
		System.out.println("==grandchild info==");
		System.out.println("grandchild name is "+name);
		System.out.println("grandchild name is "+surname);
		System.out.println("grandchild name is "+age);
		System.out.println("grandchild name is "+address);
		System.out.println("grandchild schoolname is "+SchoolName);
	}
	
	public static void main(String[] args) 
	{
		GrandChild gd = new GrandChild();
		gd.setName("amittt");
		gd.setSurname("rai");
		gd.setAge(3);
		gd.setAddress("pune");
		gd.setSchoolName("svm");
		
		gd.GrandChildInfo();
	}
}
