package Arrays;
public class ArrayExmple
{
	public static void main(String[] args) 
	{
		int[] rollNum = new int[10];
		rollNum[0]=101;
		rollNum[1]=102;
		rollNum[2]=103;
		rollNum[3]=104;
		
		ArrayExmple ae = new ArrayExmple();
		ae.getArray(rollNum);
	}
	
	void getArray(int[] rollArray)
	{
//		System.out.println(rollArray[0]);
//		System.out.println(rollArray[1]);
//		System.out.println(rollArray[2]);
//		System.out.println(rollArray[3]);
		for(int i=0;i<rollArray.length;i++)
		{
			System.out.println(rollArray[i]);
		}
	}
}