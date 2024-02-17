package Hierarchical;

public class Car extends Vehicle
{
	String breakType;

	public String getBreakType() 
	{
		return breakType;
	}

	public void setBreakType(String breakType) 
	{
		this.breakType = breakType;
	}
	public void show()
	{
		System.out.println("==car class==");
		System.out.println("vehicle name is "+vehicleName);
		System.out.println("vehicle price is "+vehiclePrice);
		//System.out.println("vehicle name is "+fuelType);
		System.out.println("vehicle name is "+breakType);
		
	}
	public static void main(String[] args) 
	{
		Car c = new Car();
		c.setVehicleName("maruti");
		c.setVehiclePrice(20000);
		c.setBreakType("disk");
		c.show();
	}
}
