
import java.util.Scanner;
class UserInput
{

	public static void main(String args[])
	{
	
		System.out.println("Enter first value");
		
		int value1;
		
		Scanner sc = new Scanner(System.in);
		
		value1 = sc.nextInt();
		
		System.out.println("You entered first value is-"+value1);
		
		System.out.println("Enter second value");
		
		int value2 = sc.nextInt();
		
		System.out.println("You entered second values is-"+value2);
		
		
		
		Calculations obj = new Calculations();
		
		obj.addition(value1, value2);
		obj.substraction(value1, value2);
		
		System.out.println("Value from Calculations class is-"+ obj.val);
	}
	

}