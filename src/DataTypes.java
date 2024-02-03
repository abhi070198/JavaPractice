
class DataTypes
{

	public static void main(String args[])
	{
	
		System.out.println("Welcome to main method");
		
		DataTypes obj = new DataTypes();
		
		obj.wholeNumber();
		obj.floatNumber();
	}
	
	public void wholeNumber()
	{
		
		byte num = 10;
		short num1 = 10;
		int num2 = 10;
		long num3 = 10;
		
		System.out.println("Byte value-"+num);
		System.out.println("Short value-"+num1);
		System.out.println("Int value-"+num2);
		System.out.println("Long value-"+num3);
		
		byte num4=0;
		System.out.println("Byte value-"+num4);
		
	
	}
	
	public void floatNumber()
	{
		
		float val = 10.20f;
		
		System.out.println("Float Number is-"+val);
		
		int a = 9;
		int b = 2;
		float result = (float)a/b;
		
		System.out.println("Result of devision is-"+result);
		
	}

}