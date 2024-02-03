class DataTypess
{
public static void main(String[] args)
{
	DataTypess dt = new DataTypess();
	dt.wholeNumbers();
	dt.floatNumbers();
	dt.charMethod();
}

	public void wholeNumbers()
	{
	byte num=-128;
	short num1=32767;
	int num2=2147483647;
	long num3=9223372036854775807l;
	System.out.println("byte number range is "+num);
	System.out.println("short number range is "+num1);
	System.out.println("int number range is "+num2);
	System.out.println("long number range is "+num3);	
	}
	
	public void floatNumbers()
	{
	float num=19.98f;
	double num1=-42937737.9d;
	System.out.println("float number range is "+num);
	System.out.println("double number range is "+num1);
	}
	public void charMethod()	
	{
	char ch='A';
	System.out.println("char  is "+ch);
	}

}