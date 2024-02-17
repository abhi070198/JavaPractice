package Loops;

public class JumpStatement 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			if(i==6) // skip 6
			{
				continue;
			}
			System.out.println("value of i using for loop and continue :"+i);
		}
		for(int j=1;j<=5;j++)
		{
			if(j==4)
			{
				if(j==5)
				{
					continue;
				}
				break;
			}
			System.out.println("print value of j using break :"+j);
		}
		int k = 1; //initialization
		while(k<5) //condition
		{
			System.out.println("print value of k using while loop :"+k);
			k++; //iteration
		}
		int x=1;
		do {
			System.out.println("print value of x using do while loop :"+x);
			x++;
		}
		while(x<=5);
			
		for(int a=2;a<=20;a=a*2)
		{
			System.out.println("using for loop "+a);
		}
//		for(int i=2;i<=20;i=i+2)
//		{
//			System.out.println("table of 2 is :"+i);
//		}
//		JumpStatement js= new JumpStatement();
//		js.tableOfTwo();
//	}
//	void tableOfTwo()
//	{
//		for(int i=2;i<=20;i=i+2)
//			{
//				System.out.println("table of 2 is :"+i);
//				
//			}
	}
}
