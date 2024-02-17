package Array2;

public class SortArray1 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[] {7,0,2};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("sorted array :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(+arr[i]);
		}
	}
}
