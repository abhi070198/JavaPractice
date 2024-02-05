
public class CountFrequencyOfNumbers 
{

	public static void main(String[] args) 
	{
		int temp=0;
		int[] arr=new int[] {2,2,3,4,3,4,2};
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=1;j<i;j++)
			{
//				if(arr[i]>arr[j])
//				{
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				}
				if(arr[i]==arr[j])
				{
					int flag=arr[i];
					System.out.println("repitted element "+flag);
				}
				int freq=0,key=10;
				if(arr[i]==key)
				{
					freq++;
				}
			}
			
			System.out.println(arr[i]);
		}
	}

}
