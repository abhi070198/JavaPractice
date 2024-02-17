package Loops;

public class ForEachLoop 
{
	public static void main(String[] args) 
	{
		int[] ar=new int[3];
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		
		System.out.println("array iteration using for each loop");
		
		for(int i:ar)
		{
			System.out.println(i);
		}
	}
}
