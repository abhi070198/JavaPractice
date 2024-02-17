package Arrays;

public class AverageOfArray 
{
	public static void main(String[] args) 
	{
		int[] arr={10,11,12,13,14};
		int sum=0,avg=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			avg=sum/5;
		}
		
		System.out.println("average of array elements is :"+avg);
	}
}
