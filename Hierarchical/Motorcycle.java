package Hierarchical;

public class Motorcycle extends Vehicle
{
	String fuelType;

	public String getFuelType() 
	{
		return fuelType;
	}

	public void setFuelType(String fuelType) 
	{
		this.fuelType = fuelType;
	}
	public void show()
	{
		System.out.println("==motorcycle class==");
		System.out.println("vehicle name is "+vehicleName);
		System.out.println("vehicle price is "+vehiclePrice);
		System.out.println("vehicle name is "+fuelType);
		
	}
	public static void main(String[] args) 
	{
		Motorcycle m = new Motorcycle();
		m.setVehicleName("Honda");
		m.setVehiclePrice(100000);
		m.setFuelType("Diesel");
		m.show();
	}
}
