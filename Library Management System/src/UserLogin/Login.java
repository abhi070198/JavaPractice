package UserLogin;
import java.util.Scanner;



public class Login
{
		int id=10;
		int password=1234;
		
		public int getId() {
			return id;
		}
	
		public void setId(int id) {
			this.id = id;
		}

		public int getPassword() {
			return password;
		}


		public void setPassword(int password) {
			this.password = password;
		}
		
		void SignUp()
		{
			Scanner sc=new Scanner(System.in);
			int id2;
			id2=sc.nextInt();
			int password2;
			password2=sc.nextInt();
			
		}
		
		void exit()
		{
			Scanner sc=new Scanner(System.in);
			sc.close();
			
		}

	void loginOption()
	{
		int a;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		if(a==1)
		{
			System.out.println("you are inside login");
		}
		else if(a==2)
		{
			System.out.println("you are inside Sign Up");
			Login l =new Login();
			l.SignUp();
		}
		else
		{
			System.out.println("Exit");
			//exit();
		}
	}
		void login()
		{
			Login1 l1=new Login1();
			l1.Option();
			
		    
		    //System.out.println("***** Library Management Application *****");
		    
		    Scanner input1 = new Scanner(System.in);
		    System.out.println("Enter Id : ");
		    int id = input1.nextInt();

		    Scanner input2 = new Scanner(System.in);
		    System.out.println("Enter Password : ");
		    int password = input2.nextInt();

		    if (id==l1.id && password==l1.password) {

		        System.out.println("Access Granted! Welcome!");
		        System.out.println(" Login Successful : Welcom Admin ");
		       
		    }

		    else if (id==l1.id) 
		    {
		        System.out.println("Invalid Password!");
		    } 
		    else if (password==l1.password) 
		    {
		        System.out.println("Invalid Username!");
		    } 
		    else 
		    {
		        System.out.println("Invalid Username & Password!");
		    } 
	}
		
	public static void main(String[] args) 
		{
			Login1 l = new Login1();
			//l.Option();
			l.login();
			AdminPage ap = new AdminPage();
			ap.admin();
			ap.adminOption();
			
		 }
}