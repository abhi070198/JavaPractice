package Array3;

public class EmployeeDetails 
{
	public static void main(String[] args) 
	{
		EmployeeDetails dt = new EmployeeDetails();
		dt.addEmployeeInArray();
		
		
		
			
	}
	
	void printEmployee(Employee[] arr) 
	{
		
		for(int i=0; i<arr.length; i++) 
		{
			
			Employee eObj = arr[i];
			System.out.println(eObj);
		}
	}
	
	void printArray(Employee[] arr) 
	{
	
		System.out.println("Inside StudentAnother class ");
		
		for (Employee sObj : arr) 
		{
			
			//System.out.println("Roll No is :"+sObj.rno);
			//System.out.println("Name is :"+sObj.name);
			
			//System.out.println("Roll No is :"+sObj.getRno());
			//System.out.println("Name is :"+sObj.getName());
			
			System.out.println(sObj.toString());
			//sObj.toString1();
		}
		
	}
	
	Employee[] addEmployeeInArray() 
	{
		
		Employee obj1 = new Employee();
		obj1.setSalary(1000);
		obj1.setName("Rajendra");
		obj1.setEmpId(10);
		
		Employee obj2 = new Employee();
		obj1.setSalary(2000);
		obj1.setName("abhi");
		obj1.setEmpId(11);
		
		Employee obj3 = new Employee();
		obj1.setSalary(3000);
		obj1.setName("amit");
		obj1.setEmpId(12);
		 
Employee[] empArray = new Employee[3];
		
		empArray[0] = obj1;
		empArray[1] = obj2;  
		empArray[2] = obj3;
		
		return empArray;
	}
}