package UserLogin;

import java.util.Scanner;

public class Login1 extends Login
{

	void Option()
	{
		Login1 l2 = new Login1();
		System.out.println("***** Library Management Application *****");
		System.out.println("1. Login");
        System.out.println("2. Sign Up");
        System.out.println("3. Exit");
        System.out.println("Enter any option : ");
        l2.loginOption();
        
	}
}
