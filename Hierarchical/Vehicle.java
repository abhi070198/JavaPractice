package Hierarchical;

public class Vehicle 
{
	int vehiclePrice;
	String vehicleName;
	
	public int getVehiclePrice() 
	{
		return vehiclePrice;
	}
	public void setVehiclePrice(int vehiclePrice) 
	{
		this.vehiclePrice = vehiclePrice;
	}
	public String getVehicleName() 
	{
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) 
	{
		this.vehicleName = vehicleName;
	}
	public void showVehicle()
	{
		System.out.println("vehicle name is "+vehicleName);
		System.out.println("vehicle price is "+vehiclePrice);
	}
	
//	public static void main(String[] args) 
//	{
//		Vehicle v = new Vehicle();
//		v.setVehicleName("honda");
//		v.setVehiclePrice(20000);
//	}
	
}
