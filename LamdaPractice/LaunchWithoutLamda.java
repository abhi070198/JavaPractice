package LamdaPractice;
interface Alpha
{
	void display();
}
class AlphaImpl implements Alpha
{
	public void display()
	{
		System.out.println("Alpha implementation");
	}
}



public class LaunchWithoutLamda 
{
	public static void main(String[] args) 
	{
//		AlphaImpl alpha = new AlphaImpl();
//		alpha.display();
		Alpha a = new Alpha() // anonymous inner class
		{
		public void display()
		{
			System.out.println("Alpha implementation");
		}
		};
		a.display();
	}
}
