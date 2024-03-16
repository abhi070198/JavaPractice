package Polymorphism;
public class OverridingExp
{
	int salary;
	String employeeName;
	int YearOfExperience;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getYearOfExperience() {
		return YearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		YearOfExperience = yearOfExperience;
	}

	void IncrementSalary()
	{
		
		System.out.println("Salary of employee "+salary);
		if(YearOfExperience>2)
		{
			salary=salary+4000;
		}
	}
}

//class Developer extends Employee
//{
//	void IncrementSalary()
//	{
//		System.out.println("Salary of developer "+salary);
//		if(YearOfExperience>3)
//		{
//			salary=salary+9000;
//		}
//	}
//}
//class Manager extends Employee
//{
//	void IncrementSalary()
//	{
//		System.out.println("salary of manager "+salary);
//		if(YearOfExperience>3)
//		{
//			salary=salary+10000;
//		}
//	}
//}

