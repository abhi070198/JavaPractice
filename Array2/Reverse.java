package Array2;

public class Reverse
{
	
	static void reverse(int[] arr)
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
			//System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		
		//int[] arr=new int[] {0,23,14,12,9};
		int[] arr=new int[] {7,0,2};
		System.out.println("before reverse");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		reverse(arr);
		System.out.println("after reverse");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

