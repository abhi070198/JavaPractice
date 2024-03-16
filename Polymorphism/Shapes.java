package Polymorphism;
class Circle 
{
	void area(float r)
	{
		double area1=3.14*r*r;
		System.out.println("area of circle is "+area1);
	}
	void area(int base, int height)
	{
		double area2=(base*height)/2;
		System.out.println("area of triangle is "+area2);
	}
	void area(float length, int width)
	{
		float area3 = length*width;
		System.out.println("area of rectangle "+area3);
	}
}

public class Shapes 
{

	public static void main(String[] args) 
	{
		Circle c = new Circle();
		c.area(10);
		c.area(12, 15);
		c.area(3.4f,14);
	}

}
