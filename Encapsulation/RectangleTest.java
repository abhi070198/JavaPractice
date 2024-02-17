package Encapsulation;

public class RectangleTest 
{
	private int length;
	private int breadth;
	
	public RectangleTest(int i, int j) 
	{
		this.length=i;
		this.breadth=j;
	}
	public int getLength() 
	{
		return length;
	}
	public void setLength(int length) 
	{
		this.length = length;
	}
	public int getBreadth() 
	{
		return breadth;
	}
	public void setBreadth(int breadth) 
	{
		this.breadth = breadth;
	}
	public static void main(String[] args) 
	{
		RectangleTest rt = new RectangleTest(20,30);
		int lth=rt.getLength();
		int bth=rt.getBreadth();
		int Area = lth*bth;
		System.out.println("Area: "+Area);
		rt.setLength(50);
		rt.setBreadth(60);
		int ln=rt.getLength();
		int br=rt.getBreadth();
		int newArea = ln*br;
		System.out.println("new area: "+newArea);
	}

}
