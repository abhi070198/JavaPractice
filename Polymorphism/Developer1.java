package Polymorphism;

public class Developer1 extends OverridingExp
{
	void IncrementSalary()
	{
		//System.out.println("Salary of developer "+salary);
		if(YearOfExperience>3)
		{
			salary=salary+9000;
			System.out.println("salary of developer "+salary);
			System.out.println("name of developer is "+employeeName);
			System.out.println("no. of developer "+YearOfExperience);
		}
	}
	
	public static void main(String[] args) 
	{
		OverridingExp e = new Developer1();
		e.setSalary(30000);
		e.setEmployeeName("abhishek");
		e.setYearOfExperience(4);
		e.IncrementSalary();
	}
}
