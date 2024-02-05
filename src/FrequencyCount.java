
public class FrequencyCount 
{

	public static void main(String[] args) 
	{
		int arr[] = {2,2,3,4,3,4,2};
		int freq[] = new int[arr.length];
		int visited =-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=visited;
				}
				if(freq[i]!=visited)
				{
					freq[i]=count;
				}
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			System.out.println("element | frequency");
			System.out.println(arr[i]+" | "+freq[i]);
		}

	}

}
