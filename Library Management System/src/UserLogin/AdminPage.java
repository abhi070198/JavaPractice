package UserLogin;
import java.util.Scanner;


import NewStudent.StudentPage;
import UserLogin.AdminPage;

public class AdminPage 
{
	void admin()
	{
		
		System.out.println("***** Admin Page *****");

		System.out.println("1. Student Records");
        System.out.println("2. Book Records");
        System.out.println("3. Manage Books");
        System.out.println("4. Exit ");
        System.out.println(" Enter Any Option ");
        
	}
	
	void adminOption()
	{
		int a;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		if(a==1)
		{
			System.out.println("Student Records");
			StudentPage sp = new StudentPage();
			sp.student();
		}
		else if(a==2)
		{
			System.out.println("Book Records");
		}
		else if(a==3)
		{
			System.out.println("Manage Books");
			//exit();
		}
		else
		{
			System.out.println("Exit");
		}
	}
	
	public static void main(String[] args) 
	{
		AdminPage ap = new AdminPage();
		
	}
}
