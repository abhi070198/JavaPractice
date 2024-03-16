package Polymorphism;
class AeroPlane
{
	public void takeOff()
	{
		System.out.println("Aeroplane is taking off....");
	}
	public void fly()
	{
		System.out.println("Aeroplane is taking flying....");
	}
	public void landing()
	{
		System.out.println("Aeroplane is taking landing....");
	}
}
class CargoPlane extends AeroPlane
{
	public void takeOff()
	{
		System.out.println("CargoPlane is taking off....");
	}
	public void fly()
	{
		System.out.println("CargoPlane is taking flying....");
	}
	public void landing()
	{
		System.out.println("CargoPlane is taking landing....");
	}
}
class PassengerPlane extends AeroPlane
{
	public void takeOff()
	{
		System.out.println("PassengerPlane is taking off....");
	}
	public void fly()
	{
		System.out.println("PassengerPlane is taking flying....");
	}
	public void landing()
	{
		System.out.println("PassengerPlane is taking landing....");
	}
}
class FighterPlane extends AeroPlane
{
	public void takeOff()
	{
		System.out.println("FighterPlane is taking off....");
	}
	public void fly()
	{
		System.out.println("FighterPlane is taking flying....");
	}
	public void landing()
	{
		System.out.println("FighterPlane is taking landing....");
	}
}

class Airport
{
	public void permit(AeroPlane ref)
	{
		ref.takeOff();
		ref.fly();
		ref.landing();
	}
}

public class LaunchPoly1 
{

	public static void main(String[] args) 
	{
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		Airport a = new Airport();
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
		
//		AeroPlane ref;
//		
//		ref=cp; //AeroPlane ref = new CargoPlane();
//		ref.takeOff();
//		ref.fly();
//		ref.landing();
//		
//		System.out.println("----------------------------------------------");
//		
//		ref=pp;
//		ref.takeOff();
//		ref.fly();
//		ref.landing();
//		
//		System.out.println("----------------------------------------------");
//		
//		ref=fp;
//		ref.takeOff();
//		ref.fly(); 
//		ref.landing();
//		
//		System.out.println("----------------------------------------------");

		
//		cp.takeOff();
//		cp.fly();
//		cp.landing();
//		
//		System.out.println("----------------------------------------------");
//		
//		pp.takeOff();
//		pp.fly();
//		pp.landing();
//		
//		System.out.println("----------------------------------------------");
//		
//		fp.takeOff();
//		fp.fly(); 
//		fp.landing();
//		
//		System.out.println("----------------------------------------------");

	}

}
