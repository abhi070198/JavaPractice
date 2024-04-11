package Array2;

// git testing
public class CopyArray 
{
	public static void main(String[] args) 
	{
		int[] arr1= {3,5,7,9};
		int[] arrcopy= new int[4];
		arrcopy=arr1;
		
		System.out.println("array is :");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println("copied array is :");
		for(int i=0;i<arrcopy.length;i++)
		{
			System.out.println(arrcopy[i]);
		}
	}
}
