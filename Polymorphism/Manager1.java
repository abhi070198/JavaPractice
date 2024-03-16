package Polymorphism;

public class Manager1 extends OverridingExp
{
	void IncrementSalary()
	{
		//System.out.println("Salary of developer "+salary);
		if(YearOfExperience>4)
		{
			salary=salary+10000;
			System.out.println("salary of manager is "+salary);
			System.out.println("name of manager is "+employeeName);
			System.out.println("no. of experience "+YearOfExperience);
		}
	}
	public static void main(String[] args) 
	{
		OverridingExp e = new Manager1();
		e.setSalary(40000);
		e.setEmployeeName("abhi");
		e.setYearOfExperience(5);
		e.IncrementSalary();
	}
}
