package LamdaPractice;
@FunctionalInterface
interface Calc
{
	int add(int a);
}
interface Calc2
{
	int add(int a, int b);
}
public class LaunchLamda2 
{
	public static void main(String[] args) 
	{
		Calc c= a->a+10;
		
		System.out.println(c.add(10));
		
		Calc2 c2 =(a,b) ->a+b;
		System.out.println(c2.add(10, 20));
	}
}
