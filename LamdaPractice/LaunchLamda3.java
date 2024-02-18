package LamdaPractice;
@FunctionalInterface
interface CLS  // computelengthstring
{
	int getLength(String s);
}

public class LaunchLamda3 
{
	public static void main(String[] args) 
	{
//		CLS cls = new CLS()
//		{
//		public int getLength(String s)
//		{
//			return s.length();
//		}
//	};
		CLS cls = (s)->s.length();
		System.out.println(cls.getLength("Telusko"));
}
}