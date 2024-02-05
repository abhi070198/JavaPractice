
public class SecondLargest 
{

	public static void main(String[] args) 
	{
		int temp;
		int[] a=new int[] {25,10,35,15,45};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Largest element is "+a[1]);

	}

}
