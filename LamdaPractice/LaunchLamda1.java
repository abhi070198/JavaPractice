package LamdaPractice;
interface Beta
{
	void disp();
	
}
public class LaunchLamda1 
{
	public static void main(String[] args) 
	{
//		Beta beta = ()->
//		{
//		System.out.println("Displ method implementation");
//		};
		Beta beta =()->System.out.println("Displ method implementation");
		beta.disp();
	}
}
